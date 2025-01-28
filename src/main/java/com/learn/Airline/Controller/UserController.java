package com.learn.Airline.Controller;

import java.io.IOException;
import java.io.InputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.learn.Airline.Entity.User;
import com.learn.Airline.Repository.UserRepository;
import com.learn.Airline.Service.FileService;

import jakarta.servlet.http.HttpServletResponse;

import org.springframework.util.StreamUtils;

@RestController
@CrossOrigin //Imp
public class UserController {

	@Value("${user.image.path}") // Spring expression language (spel)
	private String imageUploadPath;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private FileService fileService;
	
	
	  @PostMapping("users/{userId}/image")
	   public ResponseEntity<String> uploadUserImage(@RequestParam("userImage") MultipartFile image, @PathVariable String userId) throws IOException, java.io.IOException {
	       String imageName = fileService.uploadFile(image, imageUploadPath);
	        User user = userRepository.findById(userId).get();
	        System.out.println("ImageName"+imageName);
	        user.setUserImage(imageName);
	        userRepository.save(user);
	       return new ResponseEntity<String>("Successs",HttpStatus.ACCEPTED);
	   }

	  
	   @GetMapping(value = "users/{userId}/image")
	   public void serveUserImage(@PathVariable String userId, HttpServletResponse response) throws  java.io.IOException {
	       User user = userRepository.findById(userId).get();
	       InputStream resource = fileService.getResource(imageUploadPath, user.getUserImage());
	       response.setContentType(MediaType.IMAGE_JPEG_VALUE);
	       StreamUtils.copy(resource, response.getOutputStream());
	   }


}

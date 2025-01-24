package com.learn.Airline.Service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import java.io.File;
import java.nio.file.Paths;
import java.util.UUID;
import java.nio.file.Files;
import org.springframework.stereotype.Service;

import org.springframework.web.multipart.MultipartFile;


//Service - Bean banata hai aur batata hai it has a business logic
@Service
public class FileServiceImpl implements FileService {

	@Override
	public String uploadFile(MultipartFile file, String path) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InputStream getResource(String path, String name) throws FileNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}

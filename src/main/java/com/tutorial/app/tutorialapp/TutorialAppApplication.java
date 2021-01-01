package com.tutorial.app.tutorialapp;

import javax.annotation.Resource;

import com.tutorial.app.tutorialapp.service.FileStorageService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class TutorialAppApplication implements CommandLineRunner {
	@Resource
	FileStorageService storageService;
  
	public static void main(String[] args) {
		SpringApplication.run(TutorialAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		storageService.deleteAll();
		storageService.init();

	}

}

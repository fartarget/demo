package com.xmf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class StudyPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyPortalApplication.class, args);
	}
}

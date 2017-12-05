package com.xmf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
@MapperScan("com.xmf.dao")
public class StudyPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyPortalApplication.class, args);
	}

}



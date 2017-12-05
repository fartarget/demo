package com.xmf;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.apache.logging.log4j.LogManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import org.apache.logging.log4j.Logger;

@SpringBootApplication
@ServletComponentScan
@MapperScan("com.xmf.dao")
public class StudyPortalApplication {
	private static final Logger log = LogManager.getLogger(StudyPortalApplication.class);
	private static final Log log1 = LogFactory.getLog(StudyPortalApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(StudyPortalApplication.class, args);
		log.trace("这是 org.apache.logging.log4j LogManager trace log");
		log.warn("这是 org.apache.logging.log4j LogManager warn log");
		log.debug("这是 org.apache.logging.log4j LogManager debug log");
		log.error("折是 org.apache.logging.log4j LogManager error log");
		System.out.println("-----------------------------------------------------------华丽丽的分割线----------------------------------------------------------------");
		log1.trace("这是 org.apache.commons.logging LogFactory trace log");
		log1.warn("这是 org.apache.commons.logging LogFactory warn log");
		log1.debug("这是 org.apache.commons.logging LogFactory debug log");
		log1.error("这是 org.apache.commons.logging LogFactory error log");
	}

}

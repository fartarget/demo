package com.xmf;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

import javax.persistence.EntityManagerFactory;

@SpringBootApplication
@ServletComponentScan
public class StudyPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyPortalApplication.class, args);
	}

	/**
	 * 注入sessionfatory
	 * @return
	 */
    @Bean
    public SessionFactory sessionFactory(@Qualifier("entityManagerFactory") EntityManagerFactory emf) {
        return emf.unwrap(SessionFactory.class);
    }

}



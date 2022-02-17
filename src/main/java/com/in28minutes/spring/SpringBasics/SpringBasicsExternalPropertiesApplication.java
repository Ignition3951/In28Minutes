package com.in28minutes.spring.SpringBasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.in28minutes.spring.SpringBasics.scope.PersonDAO;
import com.in28minutes.spring.componentscan.ComponentDAO;
import com.in28minutes.spring.properties.SomeExternalPropertyDemo;

//@SpringBootApplication
@Configuration
@ComponentScan("com.in28minutes.spring.properties")
@PropertySource("classpath:app.properties")
public class SpringBasicsExternalPropertiesApplication {
	
	private static Logger LOGGER =  LoggerFactory.getLogger(SpringBasicsExternalPropertiesApplication.class);

	public static void main(String[] args) {
//		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(
//				new QuickSortAlgorithm());
		ApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringBasicsExternalPropertiesApplication.class);

		SomeExternalPropertyDemo externalUrl = applicationContext.getBean(SomeExternalPropertyDemo.class);

		LOGGER.info("External URL from app.properties file is {}",externalUrl.returnService());


	}

}

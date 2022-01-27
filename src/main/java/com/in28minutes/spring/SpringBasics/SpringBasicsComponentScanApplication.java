package com.in28minutes.spring.SpringBasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.in28minutes.spring.SpringBasics.scope.PersonDAO;
import com.in28minutes.spring.componentscan.ComponentDAO;

@SpringBootApplication
@ComponentScan("com.in28minutes.spring.componentscan")
public class SpringBasicsComponentScanApplication {
	
	private static Logger LOGGER =  LoggerFactory.getLogger(SpringBasicsComponentScanApplication.class);

	public static void main(String[] args) {
//		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(
//				new QuickSortAlgorithm());
		ApplicationContext applicationContext = SpringApplication.run(SpringBasicsComponentScanApplication.class, args);

		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}",componentDAO);


	}

}

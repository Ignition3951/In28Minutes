package com.in28minutes.spring.SpringBasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.SpringBasics.scope.PersonDAO;
import com.in28minutes.spring.SpringBasics.xml.XmlPersonDAO;

//@SpringBootApplication
@Configuration
@ComponentScan
public class SpringBasicsScopeXmlConfigApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicsScopeXmlConfigApplication.class);

	public static void main(String[] args) {
//		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(
//				new QuickSortAlgorithm());
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {

			XmlPersonDAO personDAO = applicationContext.getBean(XmlPersonDAO.class);
			LOGGER.info("{}", personDAO);
			LOGGER.info("{}", personDAO.getXmlJdbcConnection());
		}
	}

}

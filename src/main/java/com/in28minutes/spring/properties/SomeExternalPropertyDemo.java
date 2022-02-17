package com.in28minutes.spring.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalPropertyDemo {
	
	@Value("${external.source.url}")
	private String Url;
	
	public String returnService() {
		return Url;
	}

}

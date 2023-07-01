package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.beans.Test;

@SpringBootApplication
public class SimpleSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SimpleSpringBootApplication.class, args);
		
		/*Test obj = ctx.getBean(Test.class);
		
		System.out.println(obj);
		*/
		String [] names = ctx.getBeanDefinitionNames();
		
		for(String beanName : names)
			System.out.println(beanName);
		
		
		
	}

}

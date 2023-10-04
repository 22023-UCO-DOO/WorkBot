package com.novellius;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		final ApplicationContext applicationContext = new ClassPathXmlApplicationContext("");
	}
}

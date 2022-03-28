package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\geckodriver.exe");
		WebDriver fox = new FirefoxDriver();
		fox.get("http://www.greenstechnologys.com/");
		fox.manage().window().fullscreen();
		//fox.get("https://www.facebook.com/");
		//fox.get("https://www.amazon.in");
		//fox.get("http://greenstech.in/selenium-course-content.html");
		
		System.out.println(fox.getCurrentUrl());
		
		System.out.println(fox.getTitle());
		
		System.out.println(fox.getPageSource());
	}

}

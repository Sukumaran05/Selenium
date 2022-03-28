package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEx {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\IEDriverServer.exe");
		
		WebDriver iE = new InternetExplorerDriver();
		
		iE.get("http://www.greenstechnologys.com/");
		//iE.get("http://demo.automationtesting.in/Register.html");
		iE.manage().window().fullscreen();
		//iE.get("http://greenstech.in/selenium-course-content.html");
		//iE.get("http://www.greenstechnologys.com/");
		
		System.out.println(iE.hashCode());
		System.out.println(iE.getTitle());
		System.out.println(iE.getClass());
		
		iE.quit();
		
	}

}

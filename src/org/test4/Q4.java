package org.test4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		//WebElement place = driver.findElement(By.xpath("//h6[@class='widget-title '][1]"));
		//System.out.println(place.getText());
		driver.manage().window().maximize();
		WebElement add = driver.findElement(By.xpath("//div[@class='col-md-3 short-desc-with-logo widget widget_text']"));
		System.out.println(add.getText());

	}


}

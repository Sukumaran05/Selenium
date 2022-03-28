package org.test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5 {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://greenstech.in/selenium-course-content.html");
	
	WebElement plus = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
	plus.click();
	
	//WebElement plus = driver.findElement(By.xpath("(//i[class='fas fa-plus'][1])"));
	//plus.click();
	
	WebElement intr = driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/interview-questions/cts.pdf#toolbar=0\']"));
	//WebElement cts = driver.findElement(By.xpath(("//a[@title='Interview Questions'])[6]")));
	intr.click();
	
	
	}

}

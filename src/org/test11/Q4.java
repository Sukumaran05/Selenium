package org.test11;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {
	public static void main(String[] args)throws InterruptedException, AWTException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(5000);
	List<WebElement> month = driver.findElements(By.xpath("//select[@title='Month']"));
	
	for (int i = 0; i < month.size(); i++) {
		WebElement allmonth = month.get(i);
		String text = allmonth.getText();
		System.out.println(text);
	}
	}


}

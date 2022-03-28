package org.test4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q10 {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	WebElement product = driver.findElement(By.xpath("//input[@name='q']"));
	product.sendKeys("shoes boys");
	
	driver.findElement(By.xpath("//a[text()='Login']")).click();
	
	WebElement watch = driver.findElement(By.xpath("//img[@src='https://rukminim1.flixcart.com/image/369/443/keg02a80/kids-shoe/n/u/y/11c-combo-o-1208-1582-bersache-original-imafv3sgh9uxpgzd.jpeg?q=50']"));
	watch.click();	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}

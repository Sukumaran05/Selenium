package org.test4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q9 {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.snapdeal.com/");
	
	WebElement product = driver.findElement(By.xpath("//input[@name='keyword']"));
	product.sendKeys("smartwatch");
	
	WebElement btn = driver.findElement(By.className("searchTextSpan"));
	btn.click();
	
	WebElement watch = driver.findElement(By.xpath("//img[@src='https://n2.sdlcdn.com/imgs/k/c/h/230X258_sharpened/Tyoon-901-Smartwatch-with-Bluetooth-SDL522505644-1-33738.png']"));
	watch.click();
	
	}
}

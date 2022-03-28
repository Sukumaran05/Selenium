package org.test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement firstnm = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstnm.sendKeys("Sukumaran");
		
		WebElement lastnm = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastnm.sendKeys("K");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		address.sendKeys("Tindivanam");
		
		WebElement emadd = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		emadd.sendKeys("Sukumaran.ece84@gmail.com");
		
		WebElement ph = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		ph.sendKeys("9789673405");
		
		WebElement gen = driver.findElement(By.xpath("//input[@value='Male']"));
		gen.click();
		
		WebElement crck = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		crck.click();
		
		//WebElement lang = driver.findElement(By.xpath("(//a[@class='ui-corner-all'])[8]"));
		//lang.click();
		
		WebElement skill = driver.findElement(By.xpath("//option[@value='Java']"));
		skill.click();
		
		WebElement country = driver.findElement(By.xpath("//span[@title='India']"));
		country.sendKeys("K");
		
		WebElement year = driver.findElement(By.xpath("//option[@value='1990']"));
		year.sendKeys("K");
		
		WebElement month = driver.findElement(By.xpath("//option[@value='February']"));
		month.sendKeys("K");
		
		WebElement date = driver.findElement(By.xpath("//option[@date='25']"));
		date.sendKeys("K");
		
		WebElement fpass = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		fpass.sendKeys("test@55555");
		
		WebElement spass = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		spass.sendKeys("test@55555");
		
		WebElement butn = driver.findElement(By.xpath("//button[@type='submit']"));
		butn.click();
		
		
		
		
		
		
		
	}

}

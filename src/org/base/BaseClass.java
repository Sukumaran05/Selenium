package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	//Creating methods in base class
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static JavascriptExecutor js;
	public static Alert at;
	public static TakesScreenshot t;
	public static Select s;
		
	
	
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");

		 driver = new ChromeDriver();
	}

	public static void toPassUrl(String url) {
		driver.get(url);
	}
	
	public static void toGetTitle() {
		System.out.println(driver.getTitle());
	}
	
	public static void toGetCurrentUrl(String currentUrl) {
		System.out.println(driver.getCurrentUrl());
	}
	
	public static void toMaximize() {
		driver.manage().window().maximize();
	}
	
	public static void toClose() {
		driver.close();
	}
	
	public static void toQuit() {
		driver.quit();
	}
	
	public static void toGiveInput(WebElement element, String input) {
		element.sendKeys(input);
	}
	
	public static void toClick(WebElement element) {
		element.click();
	}
	
	public static void toclear(WebElement element) {
		element.clear();
	}
	
	public static void toGetText(WebElement element) {
		System.out.println(element.getText());
	}
	
	public static void toGetAttribute(WebElement element, String value) {
		System.out.println(element.getAttribute(value));
	}

	public static void toMovehover(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	public static void ToDragAndDrop(WebElement src, WebElement dest) {
		a.dragAndDrop(src, dest).perform();
	}
	
	public static void toDoubleClick() {
		a.doubleClick().perform();
	}
	
	public static void toRightClick(WebElement element) {
		a.contextClick(element).perform();
	}
	
	public static void tokeyUp(WebElement element, CharSequence key) {
		a.keyUp(key);
	}
	
	public static void tokeyDown(WebElement element, CharSequence key) {
		a.keyDown(key);
	}
	public static void toKeyPress(int keycode) throws AWTException {
		r = new Robot();
		r.keyPress(keycode);
	}
	
	public static void toKeyRelease(int keycode) {
		r.keyRelease(keycode);
	}
	
	public static void toJsSendKeys(String code, WebElement element) {
		js = (JavascriptExecutor)driver;
		js.executeScript(code, element);
	}
	
	public static void toJsGetAttribute(String code, WebElement element) {
		js.executeScript(code, element);
	}
	
	public static void toJsClick(String code, WebElement element) {
		js.executeScript(code, element);
	}
	
	public static void toAcceptAlert() {
		 at = driver.switchTo().alert();
		 at.accept();
		
	}
	
	public static void toDismissAlert() {
		at.dismiss();
	}
	
	public static void toSendKeysAlert(String value) {
		at.sendKeys(value);
	}
	
	public static void toGetTextAlert() {
		System.out.println(at.getText());
	}
	
	public static void toTakeScreenShot() {
		t = (TakesScreenshot)driver; 
		t.getScreenshotAs(OutputType.FILE);
		
	}
	
	public static void toGetFrameId(String id) {
		driver.switchTo().frame(id);
	}
	
	public static void toGetFrameName(String name) {
		driver.switchTo().frame(name);
	}
	
	public static void toGetFrameXpath(WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public static void toGetFrameIndex(int index) {
		driver.switchTo().frame(index);
	}
	
	public static void toWindowHandlingUrl(String url) {
		driver.switchTo().window(url);
	}
	
	public static void toWindowHandlingTitle(String title) {
		driver.switchTo().window(title);
	}
	
	public static void toGetCurrentWindowID() {
		driver.getWindowHandle();
	}
	
	public static void toGetAlltWindowsID() {
		driver.getWindowHandles();
	}
	
	public static void toDropDownByValue(WebElement dropdown, String value) {

		s = new Select(dropdown);
		s.selectByValue(value);
	}
	
	public static void toDropDownByIndex(int index) {
		s.selectByIndex(index);
	}
	
	public static void toDropDownByVisibetext(String text) {
		s.selectByVisibleText(text);
	}
	
	private void toDropDownByMultiple() {
		s.isMultiple();
	}
	
	public static void toDropDownByAllSelect() {
		s.getAllSelectedOptions();
	}
	
	public static void toDropDownByFirstSelect() {
		s.getFirstSelectedOption();
	}
	
	public static void toDropDownDeSelectByValue(String value) {
		s.deselectByValue(value);
	}
	
	public static void toDropDownDeSelectByIndex(int index) {
		s.deselectByIndex(index);
	}
	
	public static void toDropDownDeSelectByVisibetext(String text) {
		s.deselectByVisibleText(text);
	}
	
	public static void toDropDownDeSelect() {
		s.deselectAll();
	}
	
	public static void toWait(long millis) throws InterruptedException {
		Thread.sleep(millis);
	}
	
	public static void toImplicitWait(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	
	public void toWebDriverWaits(long timeout) throws InterruptedException {
		ExpectedConditions.alertIsPresent().wait(timeout);
	}

}

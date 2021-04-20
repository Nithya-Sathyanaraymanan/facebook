package org.selenium10;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class css {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/Users/nithyasathyanarayanan/Downloads/Drivers and selenium jar files/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement login = driver.findElement(By.name("login"));
		String cssValue = login.getCssValue("background-color");
		System.out.println(cssValue);
		
		String cssValue2 = login.getCssValue("font-size");
		System.out.println(cssValue2);
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background-color:yellow; font-size:40px')", login);
		
		
		WebElement create = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		js.executeScript("arguments[0].setAttribute('style', 'background-color:yellow;font-size:45px')", create);
		
		String text = js.executeScript("return document.title;").toString();
		System.out.println(text);
		
		driver.quit();
}
}

package org.selenium10;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class question5 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/Users/nithyasathyanarayanan/Downloads/Drivers and selenium jar files/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/python-training.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//span[@aria-hidden=\"true\"])[1]")).click();
		driver.findElement(By.id("Python-Solutions-Architect-Training")).click();
	
	
	
	}
}

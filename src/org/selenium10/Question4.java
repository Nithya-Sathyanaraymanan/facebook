package org.selenium10;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/Users/nithyasathyanarayanan/Downloads/Drivers and selenium jar files/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/python-training.html");
		
		Thread.sleep(4000);
		driver.findElement(By.id("Python-Solutions-Architect-Training")).click();
		driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']")).click();
		driver.findElement(By.xpath("//button[text()='Windows Handling']")).click();
		
		Thread.sleep(3000);
		String parid = driver.getWindowHandle();
		System.out.println(parid);
		
		Set<String> allids = driver.getWindowHandles();
		System.out.println(allids);
		
		for (String eachID : allids) {
			if (!eachID.equals(parid)) {
				WebDriver window = driver.switchTo().window(eachID);
			}
			}
		
		
}	
}

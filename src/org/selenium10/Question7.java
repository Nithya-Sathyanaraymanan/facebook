package org.selenium10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question7 {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "/Users/nithyasathyanarayanan/Downloads/Drivers and selenium jar files/chromedriver");
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.findElement(By.xpath("//div[@id=\"heading302\"]")).click();
	driver.findElement(By.xpath("(//a[@title=\"Test papers training in chennai\"])[4]")).click();
	
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

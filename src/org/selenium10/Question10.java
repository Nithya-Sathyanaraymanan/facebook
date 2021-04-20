package org.selenium10;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question10 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/Users/nithyasathyanarayanan/Downloads/Drivers and selenium jar files/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("mask");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class=\"s1Q9rs\"])[1]")).click();
		
		String parid = driver.getWindowHandle();
		System.out.println(parid);
		
		Set<String> allids = driver.getWindowHandles();
		System.out.println(allids);
		
		for (String eachID : allids) {
			if (!eachID.equals(parid)) {
				WebDriver window = driver.switchTo().window(eachID);
			}
			}
		
		driver.findElement(By.xpath("//input[@id=\"pincodeInputId\"]")).sendKeys("500090");
		driver.findElement(By.xpath("//span[text()='Check']")).click();
		
		Thread.sleep(3000);
		System.out.println("pincode checked");
		
		driver.quit();
		
	}
}

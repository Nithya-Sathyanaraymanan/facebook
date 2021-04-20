package org.selenium10;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/Users/nithyasathyanarayanan/Downloads/Drivers and selenium jar files/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/ ");
		driver.findElement(By.name("keyword")).sendKeys("iphones 7");
		driver.findElement(By.xpath("//span[text()=\"Search\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//p[@class=\"product-title\"])[1]")).click();
		
		String parid = driver.getWindowHandle();
		System.out.println(parid);
		
		Set<String> allids = driver.getWindowHandles();
		System.out.println(allids);
		
		for (String eachID : allids) {
			if (!eachID.equals(parid)) {
				WebDriver window = driver.switchTo().window(eachID);
			}
		}
	driver.findElement(By.xpath("//span[text()='add to cart']")).click();
	
	Thread.sleep(3000);
	
	WebElement youpay = driver.findElement(By.xpath("//div[@class=\"you-pay\"]"));
	String text = youpay.getText();
	System.out.println(text);
		
}
}


package org.selenium10;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/Users/nithyasathyanarayanan/Downloads/Drivers and selenium jar files/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.findElement(By.xpath("//img[@alt=\"Lighting & Ceiling Fans\"]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='Ceiling Fans'])[2]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[text()='Shop All'])[4]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[@class=\"product-pod__title__product\"])[1]")).click();
		
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
		
		WebElement details = driver.findElement(By.xpath("//a[text()='See More Details']"));
		String text = details.getText();
		System.out.println(text);
		driver.quit();
	}
}

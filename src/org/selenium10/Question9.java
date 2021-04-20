package org.selenium10;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question9 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/Users/nithyasathyanarayanan/Downloads/Drivers and selenium jar files/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("redmi phone");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class=\"_4rR01T\"])[1]")).click();
		
		String parid = driver.getWindowHandle();
		System.out.println(parid);
		
		Set<String> allids = driver.getWindowHandles();
		System.out.println(allids);
		
		for (String eachID : allids) {
			if (!eachID.equals(parid)) {
				WebDriver window = driver.switchTo().window(eachID);
			}
			}
		
		WebElement price = driver.findElement(By.xpath("//div[@class=\"_30jeq3 _16Jk6d\"]"));
		System.out.println(price.getText());
		
		driver.quit();
	
}		
}

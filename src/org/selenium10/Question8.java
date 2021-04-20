package org.selenium10;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question8 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/Users/nithyasathyanarayanan/Downloads/Drivers and selenium jar files/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.name("keyword")).sendKeys("hand sanitizer");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class=\"searchTextSpan\"]")).click();
		
		Thread.sleep(3000);
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
		System.out.println("added to cart");
		
}
}

package org.selenium10;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/Users/nithyasathyanarayanan/Downloads/Drivers and selenium jar files/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.amazon.com/");
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone x");
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		Robot r= new Robot();
		
		
		
		WebElement phone = driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[1]"));
		a.contextClick(phone).perform();
		
		Thread.sleep(3000);
		a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
		WebElement price = driver.findElement(By.xpath("//span[@class=\"a-size-medium a-color-price qa-price-block-our-price\"]"));
		System.out.println(price.getText());
		
		driver.quit();
		
	
		
		
	
		
	
		
	}
}

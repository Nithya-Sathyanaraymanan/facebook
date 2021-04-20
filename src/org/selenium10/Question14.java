package org.selenium10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question14 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/nithyasathyanarayanan/Downloads/Drivers and selenium jar files/chromedriver");
			
			WebDriver driver=new ChromeDriver();
			driver.get("http://greenstech.in/selenium-course-content.html");
			driver.findElement(By.xpath("//div[@id=\"heading304\"]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[text()=' TESTNG']")).click();
			
			String parid = driver.getWindowHandle();
			System.out.println(parid);
			
			Set<String> allids = driver.getWindowHandles();
			System.out.println(allids);
			
			for (String eachID : allids) {
				if (!eachID.equals(parid)) {
					WebDriver window = driver.switchTo().window(eachID);
				}
				}
			WebElement questions = driver.findElement(By.xpath("//pre[contains(text(),'TESTNG')]"));
			String text = questions.getText();
			
			int indexOf = text.indexOf("QUESTION 4");
			int indexOf2 = text.indexOf("QUESTION 5");
			String substring = text.substring(indexOf, indexOf2);
			System.out.println(substring);
			
			driver.quit();
	}
}

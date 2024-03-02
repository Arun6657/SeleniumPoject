package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
//Day 2--> selenium Task 
//Question 2
		
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\Newworkspace\\AutomationProject\\Driver\\chromedriver.exe");	
		WebDriver driver = new 	ChromeDriver();
		// Launch url
		driver.get("https://www.redbus.in/");
		// To interact From field using id locator
		WebElement From = driver.findElement(By.id("src"));
		From.sendKeys("Madurai");
	 //To interact To field using id locator
		WebElement To = driver.findElement(By.id("dest"));
	      To.sendKeys("Chennai");
	 
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

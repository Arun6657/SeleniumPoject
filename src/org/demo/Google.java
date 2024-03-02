package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
//Day 2--> selenium Task 
//Question 3
		
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Newworkspace\\AutomationProject\\Driver\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	WebElement Searchfield = driver.findElement(By.name("q"));
	
	Searchfield.sendKeys("GreensTechnology");
		
	}

}

package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel {

	public static void main(String[] args) {
//Day 2--> selenium Task 
//Question 10
		
	System.setProperty("webdriver.chrome.driver","D:\\Users\\Newworkspace\\AutomationProject\\Driver\\chromedriver.exe");
	
    WebDriver driver = new ChromeDriver();
    
//To launch url
    driver.get("http://adactinhotelapp.com/");
    
//To interact with username field By using Id locator		
    
    WebElement username = driver.findElement(By.id("username"));
    username.sendKeys("Arunkumar");
		
//To interact with password field using id locator
		
    WebElement password = driver.findElement(By.name("password"));
    password.sendKeys("Ak@123");
			
		
		 
		

		}
	

}

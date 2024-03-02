package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\Newworkspace\\AutomationProject\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	//To launch Url 
	driver.get("https://www.facebook.com/");
	
	//TO interact with email field using Id locator
		WebElement email = driver.findElement(By.id("email"));
	// Enter text 
	email.sendKeys("arun@123");
	
	//To interact with Password field using name locator
	WebElement password = driver.findElement(By.name("pass"));
	// Enter text	
	password.sendKeys("ak@14");
	
	//To click login button 
	
    WebElement login = driver.findElement(By.name("login"));
     login.click();
     // To close browser
	 driver.close();
	
	}

}

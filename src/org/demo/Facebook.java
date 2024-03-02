package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Facebook {

	public static void main(String[] args) {
// Day 2---> selenium Task 
// Question 1

System.setProperty("webdriver.chrome.driver", "D:\\Users\\Newworkspace\\AutomationProject\\Driver\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			// Enter  Facebook url 
			driver.get("https://www.facebook.com/");

			// Entering Facebook username 
			WebElement username = driver.findElement(By.id("email"));
			username.sendKeys("arun@gmail.com");
			
			//Enter Facebook password 
			WebElement Password = driver.findElement(By.name("pass"));
			Password.sendKeys("Arun@123");
			
			// click on login button
			WebElement loginbutton = driver.findElement(By.name("login"));
	          loginbutton.click();
	          
	        // Close browser
	         driver.close();
		
		
	}

}

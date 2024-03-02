package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {

	public static void main(String[] args) {
//Day 2--> selenium Task 
//Question 7
		
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Newworkspace\\AutomationProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// To launch url 
		driver.get("https://www.snapdeal.com/login");	
		// To interact with username fied by using name locator
		WebElement Username = driver.findElement(By.name("username"));
		// To enter text
		Username.sendKeys("9841515041");
		
		WebElement loginbutton = driver.findElement(By.id("checkUser"));
		loginbutton.click();
		// To close browser
		driver.close();
		
		}

}

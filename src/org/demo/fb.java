package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {

	public static void main(String[] args) {
//Day 3--->Selenium Task
//Question 2		

System.setProperty("webdriver.chrome.driver", "D:\\Users\\Newworkspace\\AutomationProject\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

// Launch url 
driver.get("https://www.facebook.com/");

// Enter username by using xpath 

WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
username.sendKeys("arun@gamil.com");

//Enter password 
WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
password.sendKeys("arin@345");



	}
	

}

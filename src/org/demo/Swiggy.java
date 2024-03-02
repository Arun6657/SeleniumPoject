package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Day 2--> selenium Task 
//Question 6
		
		
System.setProperty("webdriver.chrome.driver", "D:\\Users\\Newworkspace\\AutomationProject\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	// Launch url 
	driver.get("https://www.swiggy.com/");
	// Entering location by using CSS selector
	
	WebElement Location = driver.findElement(By.cssSelector("span._1tcx6"));
	Location.click();
	
	WebElement Locationtext = driver.findElement(By.cssSelector("input._381fS._1oTLG._1H_62"));
	
	Locationtext.sendKeys("Chennai");
	}

}

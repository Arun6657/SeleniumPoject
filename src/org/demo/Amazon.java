package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
//Day 3--->Selenium Task
//Question 1
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Newworkspace\\AutomationProject\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		// Launch url
		driver.get("https://www.amazon.in/");
		
		// Enter search field 
		WebElement Searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Searchbox.sendKeys("Iphone");
		
	}

}

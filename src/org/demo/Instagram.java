package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\Newworkspace\\AutomationProject\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
		//To launch url
		driver.get("https://www.instagram.com/accounts/login/?hl=en)");
		//To interact with username field using name locator
		WebElement username=driver.findElement(By.name("username"));
		// To enter text
		username.sendKeys("arunkumar");
		//To interact with username field using TagName locator
		
		WebElement password =driver.findElement(By.tagName("input"));
		// To enter text
		password.sendKeys("arunk@123");
		
		 // To close browser
		 driver.close();
	}

}

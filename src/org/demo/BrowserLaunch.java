package org.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "D:\\Users\\Newworkspace\\AutomationProject\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
// QUESTION 1	
		//Launch browser greenstechnologys.
		driver.get("http://www.greenstechnologys.com/");
		//Launch browser facebook
		driver.get("https://www.facebook.com/");
		//Launch browser amazon
		driver.get("https://www.amazon.in");
		//Launch browser greenstech selenium-course-content
		driver.get("http://greenstech.in/selenium-course-content.html");
// QUESTION 2 	
		
		//Launch browser greenstechnologys
		driver.get("http://www.greenstechnologys.com/");
		//Launch browser gmail
		driver.get("http://gmail.com/");
		//Launch browser flipkart
		driver.get("http://www.flipkart.com/");
		//Launch browser greenstech selenium-course-content
		driver.get("http://greenstech.in/selenium-course-content.html");
	
// QUESTION 3 
		
		//Launch browser greenstechnologys
		driver.get("http://www.greenstechnologys.com/");
		//Launch browser automationtesting
		driver.get("http://demo.automationtesting.in/Register.html");
		//Launch browser greenstechnologys
		driver.get("http://www.greenstechnologys.com/");
		//Launch browser greenstech selenium-course-content
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		//Day 2 questions
		driver.get("https://www.swiggy.com/");
		driver.close();
	
	
	}
	
	

}

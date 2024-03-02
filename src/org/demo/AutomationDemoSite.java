package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationDemoSite {

	public static void main(String[] args) {
//Day 2---> selenium Task 
// Question 9
		
	System.setProperty("webriver.chrome.driver", "D:\\Users\\Newworkspace\\AutomationProject\\Driver\\chromedriver.exe");
	
WebDriver driver = new ChromeDriver();
//Launch Url 
driver.get("http://demo.automationtesting.in/Register.html");

// Enter firstName field Value
WebElement Firstname  = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
Firstname.sendKeys("Arun");
	
// Enter LastName field Value
WebElement Lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
Lastname.sendKeys("kumar");
	
// Enter Address field Value
WebElement Address = driver.findElement(By.xpath("//textarea[contains(@class,'form-control ng-pristin')]"));
Address.sendKeys("Chennai");

// Enter email field Value

WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
email.sendKeys("arun@gmail.com");

//Enter phone number field Value
WebElement phoneNumber = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
phoneNumber.sendKeys("1234567890");

//Enter password field Value
WebElement password = driver.findElement(By.id("firstpassword"));
password.sendKeys("Arun@123");

// Enter confirm password field Value
WebElement ConfirmPassword = driver.findElement(By.id("secondpassword"));
ConfirmPassword.sendKeys("Arun@123");

}
}

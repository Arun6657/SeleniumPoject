package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Newworkspace\\AutomationProject\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//launch url 
		driver.get("https://www.facebook.com/");
		// Create Account button
		WebElement Createbutton = driver.findElement(By.xpath("//a[text()='Create new account']"));
		Createbutton.click();
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First name']"));
		firstname.sendKeys("Arun");
		// surname
		WebElement surname = driver.findElement(By.xpath("//input[@name='lastname']"));
		surname.sendKeys("kumar");
		//Mobileno
		WebElement Mobileno = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		Mobileno.sendKeys("9841515041");
      // newpassword
		WebElement newpassword = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		newpassword.sendKeys("Arun@123");
		//day
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select S = new Select(day);
		S.selectByIndex(26);
		//Month
		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		Select S1 = new Select(Month);
				S1.selectByValue("10");
		//year		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select S2 = new Select(year);
		S2.selectByVisibleText("1999");
    	//Gender
		WebElement Gender = driver.findElement(By.xpath("//label[text()='Male']"));
		Gender.click();
		//Signupbutton
		WebElement Signupbutton = driver.findElement(By.xpath("//button[text()='Sign Up']"));
		Signupbutton.click();
	}

}

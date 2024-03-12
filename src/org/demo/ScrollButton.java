package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollButton {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arunk\\git\\SeleniumProject\\AutomationProject\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/login.php/");
		
		// scroll down 
	

	WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		JavascriptExecutor S =(JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		
		//scroll down
WebElement messenger = driver.findElement(By.xpath("//a[text()='Messenger']"));
		S.executeScript("arguments[0].scrollIntoView(true)", messenger);
		
		//scroll up
		Thread.sleep(2000);

		WebElement Scrollup = driver.findElement(By.xpath("//div[text()='Log in to Facebook']"));
S.executeScript("arguments[0].scrollIntoView(false)", Scrollup);


// Scroll end page 
Thread.sleep(2000);
S.executeScript("window.scrollTo(0, document.body.scrollHeight)");

// Scroll top  page 

S.executeScript("window.scroll(0,0)");

	}

}

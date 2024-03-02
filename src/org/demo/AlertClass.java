package org.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("wwebdriver.chrome.driver", "D:\\Users\\Newworkspace\\AutomationProject\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/Alerts.html");
	
	driver.manage().window().maximize();
	WebElement AlertOkButton = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
	AlertOkButton.click();
	
	Alert A1 = driver.switchTo().alert();
	A1.accept();
	
WebElement Alert2 = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
	
Alert2.click();
	WebElement ConfirmalertNo = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
	ConfirmalertNo.click();
	
	Alert AlertNo = driver.switchTo().alert();
	AlertNo.dismiss();
	
	WebElement Confirmalertyes = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
	Confirmalertyes.click();
	
	Alert Alertyes = driver.switchTo().alert();
	Alertyes.accept();
	
	WebElement AlertTextBtn = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	AlertTextBtn.click();
	
	WebElement AlertTextBtn2 = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
	AlertTextBtn2.click();
	
	Alert Alerttextfield = driver.switchTo().alert();
	Alerttextfield.sendKeys("Arun");
	Thread.sleep(2000);
	Alerttextfield.accept();
	
	
	
	}

}

package org.demo;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WindsHandling {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\Users\\Newworkspace\\AutomationProject\\Driver\\chromedriver.exe");


WebDriver driver = new ChromeDriver();

driver.get("https://www.flipkart.com/");

driver.manage().window().maximize();

WebElement SearchBox = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
SearchBox.sendKeys("Nothing2_Phone",Keys.ENTER);

WebElement NothingPhone = driver.findElement(By.xpath("//div[text()='Nothing Phone (2) (Dark Grey, 256 GB)']"));
NothingPhone.click();	
		

String ParentwindowsID = driver.getWindowHandle();

System.out.println("ParentwindowsID "+ParentwindowsID);

Set<String> Windows2 = driver.getWindowHandles();
System.out.println("Windows2 "+Windows2);

for(String X : Windows2)
{
	if(!ParentwindowsID.equals(X))
	{
		driver.switchTo().window(X);
	}
}
WebElement AddToCart_Button = driver.findElement(By.xpath("//button[text()='Add to cart']"));
	AddToCart_Button.click();
	
	Thread.sleep(2000);
driver.switchTo().window(ParentwindowsID);

WebElement WhiteColor = driver.findElement(By.xpath("//div[text()='Nothing Phone (2) (White, 256 GB)']"));
WhiteColor.click();


Set<String> ThirdwindowsID = driver.getWindowHandles();

System.out.println("ThirdwindowsID"+ ThirdwindowsID);

List l1 = new ArrayList();

l1.addAll(ThirdwindowsID);

Object Recentid = l1.get(2);
System.out.println(Recentid);

driver.switchTo().window((String) Recentid);


WebElement AddToCart_Button1 = driver.findElement(By.xpath("//button[text()='Add to cart']"));
AddToCart_Button1.click();

	}
	
}

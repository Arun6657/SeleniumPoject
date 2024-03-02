package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "D:\\Users\\Newworkspace\\AutomationProject\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
      // Launch url 
		driver.get("https://www.greenstechnologys.com/selenium-placement-training-in-chennai.html");
	     WebElement Courses = driver.findElement(By.xpath("//div[@title='Courses']"));
	    Actions A1 = new Actions(driver);
		// Mouse over
		A1.moveToElement(Courses).perform();
		// click
		WebElement AllCourses = driver.findElement(By.xpath("//a[@title='All Courses']"));
	//	A1.click(AllCourses).perform();
		 // drag and drop 
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement drag = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement Drop  = driver.findElement(By.xpath("//ol[@id='amt7']"));
		A1.dragAndDrop(drag, Drop).perform();
		
		driver.navigate().to("https://www.facebook.com/login.php/");
		// Double click
		WebElement Username = driver.findElement(By.id("email"));
		Username.sendKeys("Arun@123");
		A1.doubleClick(Username).perform();
		// Right click 
		A1.contextClick(Username).perform();
		 
		driver.close();

	}

}

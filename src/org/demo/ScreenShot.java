package org.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Newworkspace\\AutomationProject\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		TakesScreenshot S1 = (TakesScreenshot)driver;
		File Screen = S1.getScreenshotAs(OutputType.FILE);
		System.out.println(Screen);
		
		
		FileUtils.copyFile(Screen,new File("D:\\Payments\\FacebookloginPage.png"));
		
		driver.navigate().to("https://www.snapdeal.com/login");
		
		File Redbus = S1.getScreenshotAs(OutputType.FILE);
		
		System.out.println(Redbus);
		
FileUtils.copyFile(Redbus, new File("D:\\Payments\\RedbusloginPage.png"));		
	}

}

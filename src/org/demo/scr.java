package org.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scr {

	public static void main(String[] args) throws IOException {

System.setProperty("webdriver.chrome.driver", "D:\\Users\\Newworkspace\\AutomationProject\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://www.youtube.com/");

//Take ScreenShot 
//Step 1 TypeCasting
TakesScreenshot S1 =(TakesScreenshot)driver;

File ScreenShot = S1.getScreenshotAs(OutputType.FILE);

System.out.println(ScreenShot);

FileUtils.copyFile(ScreenShot, new File("D:\\Payments\\YouTubelogin.png"));



	}

}

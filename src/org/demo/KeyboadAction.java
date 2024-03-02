package org.demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboadAction {

	public static void main(String[] args) throws AWTException {

System.setProperty("webdriver.chrome.driver", "D:\\Users\\Newworkspace\\AutomationProject\\Driver\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/login.php/");
    
    WebElement email = driver.findElement(By.id("email"));
    
    Robot R = new Robot();
    
    R.keyPress(KeyEvent.VK_TAB);
    R.keyRelease(KeyEvent.VK_TAB);
    
    driver.findElement(By.name("pass"));
    
    R.keyPress(KeyEvent.VK_TAB);
    R.keyRelease(KeyEvent.VK_TAB);
    
    WebElement login = driver.findElement(By.name("login"));
    R.keyPress(KeyEvent.VK_ENTER);
    R.keyRelease(KeyEvent.VK_ENTER);

	}

}

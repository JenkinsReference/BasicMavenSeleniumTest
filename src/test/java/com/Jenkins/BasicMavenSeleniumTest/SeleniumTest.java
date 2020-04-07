package com.Jenkins.BasicMavenSeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumTest {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver", "D://Automation//Handson//JenkinsBaseReference//BaseReference//lib//chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	@Test
	public void main() {
		    
			driver.get("https://www.google.com");
			driver.manage().window().maximize(); 	
			String title = driver.getTitle();
			System.out.println("Title = " + title);
	}
	
	@AfterMethod
	public void after() {
		driver.close();
	}
}

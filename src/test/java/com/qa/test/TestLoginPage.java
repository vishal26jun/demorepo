package com.qa.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginPage {

@Test
public void test1()
{
	System.setProperty("webdriver.chrome.driver", "C://Users//visha//eclipse-workspace//DemoGitRepo//chromedriver_win32//chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	//System.out.println("Testone");
	driver.get("https://www.google.com");
	//System.out.println(driver.getTitle());
	driver.close();
}
}

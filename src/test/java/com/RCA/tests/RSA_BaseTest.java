package com.RCA.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RSA_BaseTest {
	protected WebDriver driver = null;
	Properties prop = new Properties();

	public WebDriver getWebdriver() throws IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\mohan\\eclipse-workspace\\automation-RCA-web\\src\\test\\resources\\testData.Properties ");
		prop.load(fis);
		String browsername = prop.getProperty("browser");

		if (browsername.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browsername.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browsername.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;

	}

}

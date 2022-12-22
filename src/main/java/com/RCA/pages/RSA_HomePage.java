package com.RCA.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RSA_HomePage extends RSA_BasePage {

	@FindBy(xpath = "//input[@id='inputUsername']")
	private WebElement usrnme;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement pwd;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement sgninbtn;
	
	@FindBy(xpath="//p[@class='error']")
	private WebElement errmsg;
	
	public RSA_HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public WebElement usernameField() {

		return usrnme;

	}

	public WebElement passwordField() {
		return pwd;
		
	}
	public WebElement clkOnsignBtn() {
		return sgninbtn;
		
	}
	public String ErrMsg() {
		String a=errmsg.getText();
		return a;
		
	}
}

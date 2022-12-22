package com.RCA.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.RCA.pages.RSA_HomePage;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("Rahulshetty Academy")
@Feature("Login Details")

public class RSA_HomepageTest extends RSA_BaseTest {
	private WebDriver driver = null;
	private RSA_HomePage obj = null;

	@BeforeClass
	public void initializing_Driver() throws IOException {
		driver = getWebdriver();
		obj = new RSA_HomePage(driver);
	}

	@Test(priority = 1, description = "Verify Login Details")
	@Description("Verify Login Details")
	@Severity(SeverityLevel.BLOCKER)
	@Story("Verify Login Details")
	public void testCase_1() throws InterruptedException {
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

//		Thread.sleep(3000);
		obj.usernameField().sendKeys("ronaldo");
		obj.passwordField().sendKeys("sreeja@143");
		obj.clkOnsignBtn().click();
		String msg = obj.ErrMsg();
		Assert.assertEquals(msg, "* Incorrect username or password");
		System.out.println(msg);
		// driver.quit();
		// assert.assertEquals(obj.ErrMsg(), "");
	}
}

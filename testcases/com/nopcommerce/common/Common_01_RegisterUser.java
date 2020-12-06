package com.nopcommerce.common;

import commons.AbstractTest;
import pageObjects.nopcommerce.HomePageObject;
import pageObjects.nopcommerce.PageGeneratorManager;
import pageObjects.nopcommerce.RegisterPageObject;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;

public class Common_01_RegisterUser extends AbstractTest {
	private WebDriver driver;
	public static String email, password;
	private String firstName, lastName, day, month, year, company, confirmPassWord;
	private HomePageObject homePage;
	private RegisterPageObject registerPage;

	@Parameters({ "browser"})
	@BeforeSuite
	public void createUser(@Optional("chrome") String browserName) {
		driver = getBrowserDriver(browserName);

		firstName = "John";
		lastName = "Canadi";
		email = "automationFC" + randomNumber() + "@gmail.com";
		company = "Automation Selenium";
		password = "123456";
		confirmPassWord = "123456";
		day = "8";
		month = "July";
		year = "1980";
		homePage = PageGeneratorManager.getHomePage(driver);
		registerPage = homePage.clickToRegisterLink();
		
		registerPage.clickToGenderRadioByID("gender-male");
		registerPage.inputToFirstNameTextbox(firstName);
		registerPage.inputToLastNameTextbox(lastName);
		registerPage.selectDayDropdown(day);
		registerPage.selectMonthDropdown(month);
		registerPage.selectYearDropdown(year);
		registerPage.inputToEmailTextbox(email);
		registerPage.inputToCompanyTextbox(company);
		registerPage.inputToPasswordTextbox(password);
		registerPage.inputToConfirmPasswordTextbox(confirmPassWord);

		registerPage.clickToSubmitButton();

		verifyTrue(registerPage.isRegisterSuccessMsgDisplayed("Your registration completed"));
		registerPage.clickToNopCommerceHeaderLinkByName(driver, "Log out");
		driver.quit();
	}
}

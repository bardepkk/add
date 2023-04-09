package com.learnautomation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {
WebDriver driver;
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement ragister;
	@FindBy(xpath = "//input[@id='customer.firstName']")
	private WebElement fname;
	@FindBy(xpath = "//input[@id='customer.lastName']")
	private WebElement lname;
	@FindBy(xpath = "//input[@id='customer.address.street']")
	private WebElement address;
	@FindBy(xpath = "//input[@id='customer.address.city']")
	private WebElement city;
	@FindBy(xpath = "//input[@id='customer.address.state']")
	private WebElement state;
	@FindBy(xpath = "//input[@id='customer.address.zipCode']")
	private WebElement zipcode;
	@FindBy(xpath = "//input[@id='customer.phoneNumber']")
	private WebElement phoneNumber;
	@FindBy(xpath = "//input[@id='customer.ssn']")
	private WebElement ssn;
	@FindBy(xpath = "//input[@id='customer.username']")
	private WebElement userName;
	@FindBy(xpath = "//input[@id='customer.password']")
	private WebElement password;
	@FindBy(xpath = "//input[@id='repeatedPassword']")
	private WebElement conformPassword;
	@FindBy(xpath = "//input[@value='Register']")
	private WebElement proced;
	@FindBy(xpath = "//input[@name='username']")
	private WebElement userName1;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password1;
	@FindBy(xpath = "//input[@value='Log In']")
	private WebElement login;

	public void selectragister() {
		ragister.click();
	}

	public void enterFirstName() {
		fname.sendKeys("ram");
	}

	public void enterLastName() {
		lname.sendKeys("dhok");
	}

	public void enterAddress() {
		address.sendKeys("abcd");
	}

	public void entercity() {
		city.sendKeys("pune");
	}

	public void enterStsteName() {
		lname.sendKeys("dhok");
	}

	public void enterzipcode() {
		address.sendKeys("abcd");
	}

	public void enterPhoneNumber() {
		phoneNumber.sendKeys("8823455675");
	}

	public void enterssn() {
		ssn.sendKeys("456");
	}

	public void creatUserName() {
		userName.sendKeys("raju");
	}

	public void creatpassword() {
		password.sendKeys("raju123");
	}

	public void enterconformPassword() {
		conformPassword.sendKeys("raju123");
	}

	public void selectProcead() {
		proced.click();
	}

	public void ragisterUser(String fnames, String lnames, String addres, String citys, String states, String zipcodes, String phoneNumbers, String ssns, String userNames, String passwords, String conformPasswords  ) {
		ragister.click();
		fname.sendKeys(fnames);
		lname.sendKeys(lnames);
		address.sendKeys(addres);
		city.sendKeys(citys);
		state.sendKeys(states);
		zipcode.sendKeys(zipcodes);
		phoneNumber.sendKeys(phoneNumbers);
		ssn.sendKeys(ssns);
		userName.sendKeys(userNames);
		password.sendKeys(passwords);
		conformPassword.sendKeys(conformPasswords);
		proced.click();
	}
	public void ragisterNewUser(String name, String LastName,  String add, String cityName, String stateName, String code, String number, String ssnCode, String uname, String pass, String cPassword)
	{
		ragister.click();
		fname.sendKeys(name);
		lname.sendKeys(LastName);
		address.sendKeys(add);
		city.sendKeys(cityName);
		state.sendKeys(stateName);
		zipcode.sendKeys(code);
		phoneNumber.sendKeys(number);
	ssn.sendKeys(ssnCode);
	userName.sendKeys(uname);
	password.sendKeys(pass);
		conformPassword.sendKeys(cPassword);
	proced.click();
	}

	public void enteruserName() {
//		WebDriverWait wait=new WebDriverWait(20,TimeUnit.SECONDS);
//		wait.until("Exception".visibilityOfElementLocated(true),"userName1");
		userName1.sendKeys("Raju");
	}

	public void enterPassword() {
		password1.sendKeys("Raju123");
	}

	public void enterlogin() {
		login.click();
	}
}

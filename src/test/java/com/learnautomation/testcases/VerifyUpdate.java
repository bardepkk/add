package com.learnautomation.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.HomePage;
import com.learnautomation.pages.Loginpage;
import com.learnautomation.pages.UpdateContactInf;
import com.learnautomation.utility.BrowserFactory;
import com.learnautomation.utility.ExcelDataProvider;

public class VerifyUpdate extends BaseClass {


	@Test
	public void loginApp() throws EncryptedDocumentException, IOException, InterruptedException {
		 
		Loginpage loginpage=new Loginpage(driver);
		loginpage.ragisterNewUser("ram","dhok","abcd","pune	","Maharashra","	456	","8823455675","	456","	Raju	","Raju123", "Raju123");

	//	loginpage.ragisterNewUser(ExcelDataProvider.getexclesheetdata(1, 0), ExcelDataProvider.getexclesheetdata(1, 1),  ExcelDataProvider.getexclesheetdata(1, 2),  ExcelDataProvider.getexclesheetdata(1, 3), ExcelDataProvider.getexclesheetdata(1, 4), ExcelDataProvider.getexclesheetdata(1, 5), ExcelDataProvider.getexclesheetdata(1, 6),  ExcelDataProvider.getexclesheetdata(1, 7), ExcelDataProvider.getexclesheetdata(1, 8), ExcelDataProvider.getexclesheetdata(1, 9), ExcelDataProvider.getexclesheetdata(1, 9) );
		Thread.sleep(2000);
		loginpage.enteruserName();
		loginpage.enterPassword();
		loginpage.enterlogin();

		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		if (url.equals("https://parabank.parasoft.com/parabank/overview.htm")
				&& title.equals("ParaBank | Accounts Overview")) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		HomePage homepage = new HomePage(driver);
		homepage.updateContactInf();
		String url0 = driver.getCurrentUrl();
		String title0 = driver.getTitle();
		if (url0.equals("https://parabank.parasoft.com/parabank/billpay.htm") && title0.equals("ParaBank | Bill Pay")) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		UpdateContactInf updatecontactinfo = new UpdateContactInf(driver);
		updatecontactinfo.enterName();
		updatecontactinfo.enterLname();
		updatecontactinfo.enterAddress();
		updatecontactinfo.entercity();
		updatecontactinfo.enterState();
		updatecontactinfo.enterZipCode();
		updatecontactinfo.enterphNo();
		updatecontactinfo.enterUpdate();

	}
}

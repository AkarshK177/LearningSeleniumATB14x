package ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import ex17_DataDrivenTesting_POI.CommonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Link;

public class TestSelenium_ProjectNo1 extends CommonToAll {

	@Description("TC#1 - Verify that a particular text exists on the Katalon website")
	@Link("https://bugzz.atlassian.net/browse/REST-3")
	@Test
	public void  test_verify_text() {
		WebDriver driver = new ChromeDriver();
		
		openBrowser(driver,"https://katalon-demo-cura.herokuapp.com");
		
		if(driver.getPageSource().contains("CURA Healthcare Service")) {
			System.out.println("Test Case PASSED!");
			Assert.assertTrue(true);
		}else{
            System.out.println("Test Case FAILED!");
            Assert.assertTrue(false);
		}
		
		closeBrowser(driver);
	}

}

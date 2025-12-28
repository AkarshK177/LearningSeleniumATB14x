package ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestSelenium09_Assertion_TestNG {
	
	@Test
	public void test_Selenium01() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		
		// TestNG
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");
		// AssertJ Validation
		assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com/");
		
		driver.quit();

	}

}

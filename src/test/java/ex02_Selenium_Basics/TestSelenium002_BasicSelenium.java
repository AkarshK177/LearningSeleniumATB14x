package ex02_Selenium_Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium002_BasicSelenium {
	
	@Test
	public void test_basic() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
}

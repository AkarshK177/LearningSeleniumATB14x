package ex02_Selenium_Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium13_NOHTTPP {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		// driver.get("bing.com"); // HTTPs is important.
		driver.get("https://bing.com"); // HTTPs is important.

	}
}

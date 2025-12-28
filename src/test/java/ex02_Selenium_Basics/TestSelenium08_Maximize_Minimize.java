package ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium08_Maximize_Minimize {
	
	@Test
	public void test1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.manage().window().minimize();
        
        Assert.assertEquals(driver.getTitle(), "Google");
        driver.quit();
        
        
	}

}

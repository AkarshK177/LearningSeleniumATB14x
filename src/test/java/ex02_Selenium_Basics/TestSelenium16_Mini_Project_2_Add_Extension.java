package ex02_Selenium_Basics;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.qameta.allure.Description;

public class TestSelenium16_Mini_Project_2_Add_Extension {

    @Description("Options Class")
    @Test
    public void test_Selenium01() throws Exception{
    	ChromeOptions options = new ChromeOptions();
    	//options.addArguments("--window-size=1920,1080");
    	//options.addArguments("--incognito");
    	
    	File path = new File("E:\\ATB14x\\Selenium\\src\\main\\resources\\AdBlockers.crx");
    	options.addExtensions(path);
    	
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.youtube.com/watch?v=BwTSxsAqlEc");
    	
    	
    	  Thread.sleep(15000);
          driver.quit();
    }
}

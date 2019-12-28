package com.adactin.baseclass;

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
	
	public class Baseclass {
		public static WebDriver driver;
	
		public static WebDriver browserLaunch(String browsername) {

			try {
				if (browsername.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver",
							System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
					driver = new ChromeDriver();

				} else if (browsername.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver",
							System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");
					driver = new FirefoxDriver();

				} else if (browsername.equalsIgnoreCase("ie")) {
					System.setProperty("webdriver.ie.driver",
							System.getProperty("user.dir") + "\\Driver\\IEDriverServer.exe");
					driver = new InternetExplorerDriver();

				} else {
					System.out.println("Invalid browsername");
				}

			} catch (Exception e) {
				e.printStackTrace();
	
			}
			return driver;
		}
		public static void urllaunch(String url) 
		{
			driver.get(url);
		}

		public static void inputOnElement(WebElement element, String value) {
			element.sendKeys(value);
		}

		//---------click------------//
		public static void clickOnElement(WebElement element) {
			element.click();
		}

public static void dropDown(WebElement string, String option, String value) {
			
			Select s = new Select(string);
			try {
				if (option.equals("index")) {
					s.selectByIndex(Integer.parseInt(value));
				} else if (option.equals("value")) {
					s.selectByValue(value);
				} else if (option.equals("text")) {
					s.selectByVisibleText(value);
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
   
}

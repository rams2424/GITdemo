package Cucumber1.Automate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	
	public WebDriver Intializedriver() throws IOException

	{
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\ramesh.dumpati\\eclipse-workspace\\Automate\\src\\test\\java\\Cucumber1\\Automate\\data.properties");
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramesh.dumpati\\Documents\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("Firefox"))
		{
			
		}
		else if(browserName.equals("IE"))
		{
			
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
}

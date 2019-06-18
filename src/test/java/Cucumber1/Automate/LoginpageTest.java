package Cucumber1.Automate;

import java.io.IOException;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class LoginpageTest extends Base{
	
	@Test
	public void login () throws IOException
	{
		
		
		driver=Intializedriver();
		Loginpage Lpage = new Loginpage(driver);
		driver.get("https://test.salesforce.com/");
		driver.manage().window().maximize();
		Lpage.Usernameenter("icc.wholesale08@accenture.sitiw08");
		Lpage.Passwordenter("INS$123");
	
		
	}

	
	
}

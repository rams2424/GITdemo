package Cucumber1.Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
	public WebDriver driver;
	
	public String Username = "(//input[@id=\"username\"])[last()]";
	public String Password ="(//input[@id=\"password\"])[last()]";
	public String Login ="(//input[@id=\"Login\"])[last()]";
	
	public Loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public void Usernameenter(String UserID)
	{
		driver.findElement(By.xpath(Username)).sendKeys(UserID);
		System.out.println(UserID);
		System.out.println("UsedID is entered");
	}

	public void Passwordenter(String PasswordKey) {
	
		driver.findElement(By.xpath(Password)).sendKeys(PasswordKey);
		System.out.println(PasswordKey);
		System.out.println("Password is entered");
	}
	
	public void LoginClick()
	{
		driver.findElement(By.xpath(Login)).click();
	}
}

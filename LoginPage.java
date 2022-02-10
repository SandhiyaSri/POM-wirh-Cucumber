package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass {
	
	@Given("Enter username as {string}")
	public LoginPage enterUserName(String uName)
	{
		getDriver().findElement(By.id("username")).sendKeys(uName);
		return this;
	}
	@Given ("Enter Password as {string}") 
	public LoginPage enterPassword(String password)
	{
		getDriver().findElement(By.id("password")).sendKeys(password);
		return this;
	}
	@When("Click on login button")
	public HomePage clickLogin()
	{
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new HomePage();
	}

}

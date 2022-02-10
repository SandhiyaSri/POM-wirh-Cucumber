package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.BaseClass;
import io.cucumber.java.en.Then;

public class HomePage extends BaseClass{

	public MyHomePage clickCRMSFA()
	{
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}
	@Then("Homepage should be displayed")
	public HomePage verifyHomePage()
	{
		boolean displayed = getDriver().findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;
	}
}

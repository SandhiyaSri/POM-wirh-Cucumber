package pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadPage extends BaseClass {
	@BeforeClass
	public void setUp()
	{
		fileName="CreateLead";
	}
	
	
	public CreateLeadPage clickLink(String link)
	{
		getDriver().findElement(By.linkText(link)).click();
		return this;
	}
	
	public void checkPage(String page)
	{
		boolean displayed = getDriver().findElement(By.linkText(page)).isDisplayed();
		Assert.assertTrue(displayed);
		
	}
	
	public CreateLeadPage enterFirstName(String fName)
	{
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;
	}
	
	public CreateLeadPage enterLastName(String lName)
	{
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		return this;
	}
	
	public CreateLeadPage enterCompanyName(String cName)
	{
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		return this;
	}
	
	public ViewLeadPage clickCreateLeadButton()
	{
		getDriver().findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}

}

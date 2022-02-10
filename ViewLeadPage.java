package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.BaseClass;

public class ViewLeadPage extends BaseClass {
	
	public ViewLeadPage verifyFirstName()
	{
		boolean displayed = getDriver().findElement(By.id("viewLead_firstName_sp")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;
	}

}

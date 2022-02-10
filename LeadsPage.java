package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class LeadsPage extends BaseClass {
	
	public CreateLeadPage clickCreateLead()
	{
		getDriver().findElement(By.linkText(prop1.getProperty("Create_Lead_Link_Text"))).click();
		return new CreateLeadPage();
	}

}

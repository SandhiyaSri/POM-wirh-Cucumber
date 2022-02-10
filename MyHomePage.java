package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class MyHomePage extends BaseClass {
	
	public LeadsPage clickLeadsLink()
	{
		getDriver().findElement(By.linkText(prop1.getProperty("Leads_Link_Text"))).click();
		return new LeadsPage();
	}
	

}

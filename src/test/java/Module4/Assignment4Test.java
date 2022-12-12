package Module4;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.iTechNotion.BaseClass;
import base.iTechNotion.iTechNotionPage;
import base.iTechNotion.vDoctorPage;

public class Assignment4Test extends BaseClass {

	iTechNotionPage iPage;
	vDoctorPage vPage;
	
	
	@BeforeMethod
	public void browserLaunch() {
		launch();
		iPage = new iTechNotionPage();
		vPage = new vDoctorPage();
	}
	
	@AfterMethod
	public void quit() {
		close();
	}
	
	@Test	(priority = 1)
	public void printHeaders() {
		iPage.headerItems();
	}
	
	@Test	(priority = 2)
	public void printFeatures() {
		vPage = iPage.vDoctor();
		vPage.features();
	}
	
	@Test	(priority = 3)
	public void printTechnologies() {
		vPage = iPage.vDoctor();
		vPage.technologies();
	}
	
	@Test	(priority = 4)
	public void testgetQuote() {
		vPage = iPage.vDoctor();
		vPage.getQuote();
	}
}

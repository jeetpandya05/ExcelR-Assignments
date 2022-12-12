package Module4;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.iTechNotion.BaseClass;
import base.iTechNotion.iTechNotionPage;
import base.iTechNotion.vDoctorPage;

public class vDoctorTest extends BaseClass {
	
	iTechNotionPage iPage;
	vDoctorPage vPage;
	
	@BeforeMethod
	public void browserLaunch() {
		launch();
		iPage = new iTechNotionPage();
		vPage = new vDoctorPage();
		vPage = iPage.vDoctor();
	}
	
	@AfterMethod
	public void quit() {
		close();
	}
	
	@Test
	public void printFeatures() {
		vPage.features();
	}
	
	@Test
	public void printTechnologies() {
		vPage.technologies();
	}
	
	@Test
	public void testgetQuote() {
		vPage.getQuote();
	}

}

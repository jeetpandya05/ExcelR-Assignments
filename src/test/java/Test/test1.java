package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {

	WebDriver driver;
	
	@Test
	public void launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://itechnotion.com/what-will-be-the-cost-of-an-app-like-justdial-its-indias-no-1-local-business-directory/");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//ul[@class='navbar-items nav pull-right']//ul[@id='pixzlo-main-menu']")).getText());
		System.out.println("Header Items are:");
//		System.out.println(headerItems.getText());
	}
	
	
}


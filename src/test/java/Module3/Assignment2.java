package Module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	WebDriver driver;
	
	@BeforeMethod
	public void initialize() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
	}
	
	@Test (dataProvider = "loginData")
	public void login(String username, String password) {
		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("passwd")).sendKeys(password);
		driver.findElement(By.id("SubmitLogin")).click();	
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	@DataProvider
	public Object[][] loginData() {
		Object[][] data = new Object[1][2];
		data [0][0] = "abc@gmail.com";
		data [0][1] = "abc123";
		return data;		
	}
}

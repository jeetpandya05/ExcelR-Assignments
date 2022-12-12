package Module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	WebDriver driver;
	
	@BeforeMethod
	public void initialize() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void login() {
		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("abc123");
		driver.findElement(By.id("SubmitLogin")).click();
		
	}
	
	@AfterMethod
	public void close() {
		driver.close();
		
	}
}

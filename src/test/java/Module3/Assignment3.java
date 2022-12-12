package Module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	WebDriver driver;	
	
	@BeforeMethod
	public void initialize() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
	}
	
	@Test (groups = "Smoke")
	public void part1() {
		driver.get("https://demoqa.com/");
		driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
	}
	
	@Test (groups = "Regression")
	public void part2() {
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("Test");
		driver.findElement(By.id("lastName")).sendKeys("abc");
		driver.findElement(By.id("userEmail")).sendKeys("testabc@gmail.com");
		driver.findElement(By.xpath("//label[text()='Male']")).click();		
		driver.findElement(By.id("userNumber")).sendKeys("1234567890");
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		Select dobYear = new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
		dobYear.selectByValue("2000");
		Select dobMonth = new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
		dobMonth.selectByVisibleText("September");
		driver.findElement(By.xpath("//div[@aria-label='Choose Tuesday, September 12th, 2000']")).click();
		driver.findElement(By.id("currentAddress")).sendKeys("Mumbai");
		
		
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();
		
		driver.findElement(By.id("submit")).click();
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}

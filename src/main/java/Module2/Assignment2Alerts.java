package Module2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2Alerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
		
		
	}

}

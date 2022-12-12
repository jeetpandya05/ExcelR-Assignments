package Module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("vfb-7-1")).click();
		
		
		driver.findElement(By.id("vfb-6-1")).click();
		driver.findElement(By.id("vfb-6-2")).click();
		Thread.sleep(3000);

		
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		
		Select dropdown = new Select(driver.findElement(By.name("country")));
		
		dropdown.selectByValue("KUWAIT");
		
		
		
	}

}

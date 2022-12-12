package Module2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		
		List<WebElement>  companylist = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[1]"));
		
		System.out.println("Total no of Companies: " +companylist.size());
		
		System.out.println("Company Names:");

		for (WebElement list : companylist) {
			System.out.println(list.getText());
		}
		Thread.sleep(5000);
		
		
		driver.navigate().to("https://demo.guru99.com/test/login.html");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("abc123");
		driver.findElement(By.id("SubmitLogin")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}

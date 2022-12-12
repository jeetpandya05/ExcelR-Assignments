package Module2;





import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2Windows {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/popup.php");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> window = driver.getWindowHandles();
				
		for (String tab : window) {
			driver.switchTo().window(tab);
		}
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		driver.quit();
	}

}

package Test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		String file = "./src/test/java/Module4/LoginData.xlsx";
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("data");
		
		System.out.println(sheet.getRow(0).getCell(0));
		System.out.println(sheet.getRow(0).getCell(1));
		
		
				//1
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.get("https://itechnotion.com/what-will-be-the-cost-of-an-app-like-justdial-its-indias-no-1-local-business-directory/");
				driver.manage().window().maximize();
				Thread.sleep(3000);
				//2
				WebElement headerItems = driver.findElement(By.xpath("//ul[@class='navbar-items nav pull-right']//ul[@id='pixzlo-main-menu']"));
				System.out.println("Header Items are:");
				System.out.println(headerItems.getText());
				Thread.sleep(3000);
				//3
/*				driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle'][text()='Products']")).click();
				driver.findElement(By.xpath("//ul[contains(@class,'dropdown-menu')]//a[@class='nav-link'][text()='vDoctor']")).click();
				//4
				driver.findElement(By.xpath("//a[text()='Features']")).click();
				Thread.sleep(2000);
				WebElement features = driver.findElement(By.xpath("//div[@class='col-lg-8 col-md-8']"));
				System.out.println("");
				System.out.println("Features are:");
				System.out.println(features.getText());
				//5
				driver.findElement(By.xpath("//a[text()='Technology']")).click();
				Thread.sleep(2000);
				WebElement technologies = driver.findElement(By.xpath("//body[1]/section[3]/div[1]/div[4]/div[1]/div[1]/ul[1]"));
				System.out.println("");
				System.out.println("Technologies are:");
				System.out.println(technologies.getText());
				//6
				driver.findElement(By.xpath("//div[@class='buy-button']//a[@class='btn btn-primary'][text()='Get Quote']")).click();
				Thread.sleep(2000);
				driver.switchTo().activeElement();
				driver.switchTo().frame("hs-form-iframe-0");
				driver.findElement(By.name("firstname")).sendKeys("Test");
				driver.findElement(By.name("email")).sendKeys("test123@gmail.com");
				driver.findElement(By.name("country")).sendKeys("India");
				driver.findElement(By.xpath("//input[@value='Business ($1299)- Android + IOS + Web + Installation & Rebranding + Support']")).click();
				driver.findElement(By.xpath("//input[@value='Submit']")).click();
*/				driver.quit();
		
		
	}
}

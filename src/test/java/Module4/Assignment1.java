package Module4;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	
	@Test
	public void loginTest() throws IOException, InterruptedException {
		
		String file = "./src/test/java/Module4/LoginData.xlsx";
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("data");
		
		String username = sheet.getRow(0).getCell(0).getStringCellValue();
		String password = sheet.getRow(0).getCell(1).getStringCellValue();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/");
		
		driver.findElement(By.name("uid")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		driver.close();
		
		
		
	}
	
	

	
	
}

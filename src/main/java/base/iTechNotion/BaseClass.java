package base.iTechNotion;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	String name;
	String email;
	String country;
	
	
	public void launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://itechnotion.com/what-will-be-the-cost-of-an-app-like-justdial-its-indias-no-1-local-business-directory/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		
	}
	
	public void close() {
		driver.quit();
	}
	
	public void excelFilepath() throws IOException {
		String configpath = "./src/main/java/base/iTechNotion/FormData.xlsx";
		XSSFWorkbook book = new XSSFWorkbook(configpath);
		XSSFSheet sheet = book.getSheet("data");
		
		name = sheet.getRow(1).getCell(0).getStringCellValue();
		email = sheet.getRow(1).getCell(1).getStringCellValue();
		country = sheet.getRow(1).getCell(2).getStringCellValue();
	}
	
}

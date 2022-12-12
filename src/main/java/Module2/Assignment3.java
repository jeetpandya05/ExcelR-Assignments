package Module2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 { 
	
	public static void main(String[] args) throws IOException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		WebElement frame = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frame);		
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
		
		TakesScreenshot ss = (TakesScreenshot)driver;						
		File file = ss.getScreenshotAs(OutputType.FILE);					
		String fileName = "./Screenshots/DragnDrop" + ".png";			
		FileUtils.copyFile(file, new File(fileName));
		
		driver.quit();
		
	}
}

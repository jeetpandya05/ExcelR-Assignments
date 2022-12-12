package base.iTechNotion;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class vDoctorPage extends BaseClass{
	
	
	public void features() {
		driver.findElement(By.xpath("//a[text()='Features']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebElement features = driver.findElement(By.xpath("//div[@class='col-lg-8 col-md-8']"));
		System.out.println("Features are:");
		System.out.println(features.getText());
	}
	
	public void technologies() {
		driver.findElement(By.xpath("//a[text()='Technology']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebElement technologies = driver.findElement(By.xpath("//body[1]/section[3]/div[1]/div[4]/div[1]/div[1]/ul[1]"));
		System.out.println("Technologies are:");
		System.out.println(technologies.getText());
	}
	
	public void getQuote() {
		driver.findElement(By.xpath("//div[@class='buy-button']//a[@class='btn btn-primary'][text()='Get Quote']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.switchTo().activeElement();
		driver.switchTo().frame("hs-form-iframe-0");
		try {
			excelFilepath();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("firstname")).sendKeys(name);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("country")).sendKeys(country);
		driver.findElement(By.xpath("//input[@value='Business ($1299)- Android + IOS + Web + Installation & Rebranding + Support']")).click();
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

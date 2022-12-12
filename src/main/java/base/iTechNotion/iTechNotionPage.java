package base.iTechNotion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class iTechNotionPage extends BaseClass {
	
	
	public void headerItems() {
		WebElement headerItems = driver.findElement(By.xpath("//ul[@class='navbar-items nav pull-right']//ul[@id='pixzlo-main-menu']"));
		System.out.println("Header Items are:");
		System.out.println(headerItems.getText());		
	}
	
	public vDoctorPage vDoctor() {
		driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle'][text()='Products']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("//ul[contains(@class,'dropdown-menu')]//a[@class='nav-link'][text()='vDoctor']")).click();
		return new vDoctorPage();
	}
	
}

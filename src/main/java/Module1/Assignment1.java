package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Amazon HomePage
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		String acttitle = driver.getTitle();
		System.out.println(acttitle);
		
		String exptitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		//Verify Amazon Page Title
		if( exptitle == acttitle ) {
			System.out.println("Amazon Verified");
		}
		else System.out.println("Amazon not Verified");
		
		
		//Facebook HomePage
		driver.navigate().to("https://www.facebook.com/");
		
		String actt = driver.getTitle();
		System.out.println(actt);
		
		String expt = "Facebook – log in or sign up";
		
		//Verify Facebook Page Title
		if( expt == actt ) {
			System.out.println("Facebook Verified");
		}
		else System.out.println("Facebook not Verified");
		
		//Navigate
		driver.navigate().back();
		
		driver.quit();
		
		
	}

}

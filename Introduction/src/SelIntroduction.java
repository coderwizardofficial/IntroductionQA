import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {

		// Invoking Browser
		// Chrome -ChromeDriver = Methods
		//Firefox -FirefoxDriver = methods
		//Safari -SafariDriver =Methods
		
		System.setProperty("webdriver.chrome.driver", "/Users/pramodrai/Documents/chromedriver");
		
		//WebDriver driver = new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
		

	}

}

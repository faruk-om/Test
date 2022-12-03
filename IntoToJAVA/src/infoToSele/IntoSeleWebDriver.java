package infoToSele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntoSeleWebDriver {

	public static void main(String[] args) throws InterruptedException {
	
				// syso(Ctrl+Space) ==// system.println
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Faruk\\\\OneDrive\\\\Documents\\\\QA\\\\chromedriver_win32 (1)\\\\chromedriver.exe");  
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize(); //method changing
		
		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.gmail.com/");
		
		//Thread.sleep(2000);
		
//		driver.get("https://facebook.com/");
//		Thread.sleep(2000);
//		
//		driver.get("https://yahoo.com/");
//		Thread.sleep(2000);
//		
//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
//		
//		String currentURL = driver.getCurrentUrl();
//		System.out.println(currentURL);
//		driver.navigate().to("https://accounts.google.com/");
//		driver.navigate().to("https://login.yahoo.com/");
//		currentURL = driver.getCurrentUrl();
//		System.out.println(currentURL);
//		Thread.sleep(3000);
//		//Thread.sleep(5000);
//		// sendkeys  let you type diff charter 
//		
//		
//		driver.close();
		
	}

}
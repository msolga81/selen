package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// deal what window side and position management
		driver.get("http://google.com");// load a web page
		System.out.println(driver.getCurrentUrl()); // capture current available URL	
		System.out.println(driver.getTitle()); //capture title of the page
		System.out.println(driver.getWindowHandle()); //capture window id of current window
		System.out.println(driver.getWindowHandles());//capture all active windows ids
		driver.navigate().forward();//basic navigation functions
		driver.navigate().back();
		driver.navigate().refresh();
		driver.quit();
			}
	}

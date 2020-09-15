package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class initialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("http://google.com");
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());
System.out.println(driver.getLocalStorage());
 System.out.println(driver.location());
driver.quit();
	}

}

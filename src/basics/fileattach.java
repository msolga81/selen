package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileattach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://naukri.com");
		driver.findElement(By.id("file_upload")).sendKeys("/Users/msolga81/Desktop/resume.pdf"); //must look for "input type id" in Inspect  not actual inspect path as usual
		

	}

}

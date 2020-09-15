package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.echoecho.com/javascript4.htm");
		driver.findElement(By.name("B1")).click();
		Thread.sleep(5000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept(); //accept alert code
		//driver.switchTo().alert().dismiss();
		driver.findElement(By.name("B2")).click();
		Thread.sleep(5000);
		System.out.println(driver.switchTo().alert().getText());
//driver.switchTo().alert().accept(); //NOT WORKING, code runs up to this line ok
		//driver.findElement(By.name("B3")).click();
	//	driver.switchTo().alert().sendKeys("Test Data");//code to enter text into pop up window
	//Thread.sleep(5000);
	//	System.out.println(driver.switchTo().alert().getText());
	//	driver.switchTo().alert().accept();
		
		
	}

}

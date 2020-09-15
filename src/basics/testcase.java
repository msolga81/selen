package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.openemr.io/a/openemr");
		driver.findElement(By.id("authUser")).clear();
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div[1]/div[5]/button")).click();//works so far
		driver.findElement(By.className("fa-sign-in\"")); //class locator used
		driver.findElement(By.xpath("//*[@id=\"menu_logo\"]/div/div/span[5]/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_logo\"]/div/div/span[5]/div/ul/li[2]/div")).click();
	   driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"framesDisplay\"]/div[3]/iframe")));
	   driver.findElement(By.id("form_fname")).sendKeys("olga");
	   driver.findElement(By.id("form_lname")).sendKeys("nelson");
	   driver.findElement(By.id("form_DOB")).click();
	 driver.findElement(By.id("form_DOB")).sendKeys("2020-09-09");
	 driver.findElement(By.id("form_sex")).click();
	  Select sex = new Select(driver.findElement(By.id("form_sex")));
		sex.selectByIndex(1);
		driver.findElement(By.id("create")).click();
		//driver.switchTo().defaultContent();
	//	driver.switchTo().alert().accept();

	}

}

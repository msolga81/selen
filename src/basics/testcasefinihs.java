package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class testcasefinihs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.openemr.io/a/openemr");
		driver.findElement(By.id("authUser")).clear();
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div[1]/div[5]/button")).click();//works so far
		driver.findElement(By.className("fa-sign-in")).click(); //class locator used
		Actions act = new Actions(driver);// mouse over
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu_logo\"]/div/div/span[5]/div/div"))).perform();// mouse over menu to open drop down
		driver.findElement(By.xpath("//*[@id=\"menu_logo\"]/div/div/span[5]/div/ul/li[2]/div")).click();//Clicking on new patient 
			driver.switchTo().frame(driver.findElement(By.name("pat")));
		///driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"framesDisplay\"]/div[3]/iframe")));
			Select sal = new Select(driver.findElement(By.id("form_title")));
			sal.selectByVisibleText("Mrs.");
	   driver.findElement(By.id("form_fname")).sendKeys("olga");
	   driver.findElement(By.id("form_lname")).sendKeys("nelson");
	   driver.findElement(By.id("form_DOB")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.className("xdsoft_today")).click();//enter date by Class name of todays date (whatever the date is)
	// driver.findElement(By.id("form_DOB")).sendKeys("2020-09-09");
	 driver.findElement(By.id("form_sex")).click();
	  Select sex = new Select(driver.findElement(By.id("form_sex")));
		sex.selectByValue("Female");
		driver.findElement(By.id("create")).click();
		//driver.switchTo().defaultContent();
	//	driver.switchTo().alert().accept();
driver.switchTo().defaultContent();
driver.switchTo().frame(driver.findElement(By.id("modalframe")));
driver.findElement(By.xpath("/html/body/center/input")).click();
Thread.sleep(3000);
System.out.println(driver.switchTo().alert().getText());
driver.switchTo().alert().dismiss();
Actions logout = new Actions(driver);

logout.moveToElement(driver.findElement(By.xpath("//*[@id=\"username\"]/span[2]"))).perform();
driver.findElement(By.xpath("//*[@id=\"username\"]/div/ul/li[4]")).click();
	}

}

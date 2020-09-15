package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class magentoregister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait (driver,30);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://magento.com");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")));
		driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")).click();
		
		driver.findElement(By.xpath("//*[@id=\"register\"]/span")).click();		
		driver.findElement(By.id("firstname")).sendKeys("Olga");
		driver.findElement(By.id("lastname")).sendKeys("nelson");
		driver.findElement(By.id("email_address")).sendKeys("olgaz@jonesmotor.com");
		
		Select cp = new Select (driver.findElement((By.id("company_type"))));
		//cp.selectByIndex(2); code to use to pick position staring zero
		// cp.selectByValue("development"); matching word
		cp.selectByVisibleText("Tech Partner"); //mathicng visible text in drop down
		Select role = new Select (driver.findElement(By.id("individual_role")));
		role.selectByIndex(1);
		Select country = new Select(driver.findElement(By.id("country")));
		country.selectByIndex(10);
		driver.findElement(By.id("password")).sendKeys("password1");
		driver.findElement(By.id("password-confirmation")).sendKeys("password1");
		//if(!driver.findElement(By.id("agree_terms")).isSelected()) - this code to use if select disselect
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"msp-recaptcha-d84b65fc916e7398083ea5f17089d8f1\"]/div/div/iframe")));//Going into iframe of the inserted element
		driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]")).click();//clicking the check box
		driver.switchTo().defaultContent();//going out of the embedded element
		driver.findElement(By.id("agree_terms")).click();

	driver.quit();
		
		
		
		

	}

}

package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class spicejet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait (driver,30);
		driver.manage().window().maximize();
		driver.get("http://spicejet.com");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		Select origin = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]"))); 
		origin.selectByIndex(4);
		Select tod = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_destinationStation1_CTXT\"]")));
		tod.selectByIndex(7);
		Select departure = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_view_date1\"]")));
		//departure.deselectByValue(arg0);
			
	}

}

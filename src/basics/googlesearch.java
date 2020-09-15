package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();//Instantiation driver
driver.manage().window().maximize();//maximize window
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//allowing system to wait for program to respond before throwing error
driver.get("http://google.com");//open web page
driver.findElement(By.name("q")).clear();//loacte box ("inspect and find "name) and clear the box
driver.findElement(By.name("q")).sendKeys("selenium");//type name into search box
driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div/div[2]/div[1]/span")).click();//Clicking required option
driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/a/h3")).click();
System.out.println(driver.getTitle());
if (driver.getTitle().equals("SeleniumHQ Browser Automation"))
{
	System.out.println("Test Pass");
	
}
driver.quit();
	}

}

package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// wait period to allow page to load
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		WebElement table = driver.findElement(By.id("example")).findElement(By.tagName("tbody"));//creating variable "table" that symbolizes all table and locating one section of table - only contant here
		//System.out.println(table.getText()); //this is code to print selecte tabel data only (no header) 
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (int i=0; i<rows.size();i++)
		{
			System.out.println("Row " +(i+1)+": "+rows.get(i).getText());
				}

		for (int i=0; i<rows.size();i++)
		{
			rows.get(i).findElements(By.tagName("td")).get(0).click();
			System.out.println("Row " +(i+1)+": "+rows.get(i).findElements(By.tagName("td")).get(1).getText());
				}
		System.out.println(driver.findElement(By.id("example")).findElement(By.tagName("tbody")).findElements(By.tagName("tr")).get(3).findElements(By.tagName("td")).get(2).getText());
		System.out.println(rows.size());
		driver.quit();
	}

}

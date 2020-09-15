package basics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();//Instantiation driver
		driver.manage().window().maximize();//maximize window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//allowing system to wait for program to respond before throwing error
		driver.get("http://google.com");//open web page
		String parent=driver.getWindowHandle();//setting up variable parent window
		driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).click();
		driver.findElement(By.linkText("Sign in")).click();//locator as link text, if a is expandable it will be partial link text
		Set<String> winids=driver.getWindowHandles();//identify window id
		driver.switchTo().window((String) winids.toArray()[1]);//convert window id to array and choose its place in array zero is 1st window
		driver.findElement(By.name("identifier")).sendKeys("msolga81@gmail.com"+Keys.ENTER);//entering value and clicking Enter +Keys.Enter 
		//driver.switchTo().window((String) winids.toArray()[0]);//1st method original window
		driver.switchTo().window(parent);//going back to originaa window via setting up parent variable
		driver.findElement(By.linkText("For Work")).click();
		winids=driver.getWindowHandles();//identify window ids
		driver.switchTo().window((String) winids.toArray()[2]);//go to window in the array
		driver.close();//close latest window
		
		
		
	}

}

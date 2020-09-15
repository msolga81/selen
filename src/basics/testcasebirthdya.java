package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class testcasebirthdya {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// wait period to allow page to load
		driver.get("https://demo.openemr.io/a/openemr");// open page
		driver.findElement(By.id("authUser")).clear();// delete or clear existing entry
		driver.findElement(By.id("authUser")).sendKeys("admin"); //enter login
		driver.findElement(By.id("clearPass")).sendKeys("pass");// enter password
	
		driver.findElement(By.className("fa-sign-in")).click(); //class locator used 
		Actions act = new Actions(driver);// mouse over to section I need
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu_logo\"]/div/div/span[5]/div/div"))).perform();// mouse over menu to open drop down
		driver.findElement(By.xpath("//*[@id=\"menu_logo\"]/div/div/span[5]/div/ul/li[2]/div")).click();//Clicking on new patient, option in drop down I need
			driver.switchTo().frame(driver.findElement(By.name("pat")));//switch to necessary frame, locate frame ID or Name in parent section
		
			Select sal = new Select(driver.findElement(By.id("form_title"))); //create select variable to choose drop down item
			sal.selectByVisibleText("Mrs.");// select by name
	   driver.findElement(By.id("form_fname")).sendKeys("olga");//enter into box
	   driver.findElement(By.id("form_lname")).sendKeys("nelson");//data entry
	   driver.findElement(By.id("form_DOB")).click();// click on DOB section
	  
	driver.findElement(By.id("form_DOB")).sendKeys("2020-09-10");// enter date by entry
	 driver.findElement(By.id("form_sex")).click();//click on sex section
	  Select sex = new Select(driver.findElement(By.id("form_sex")));//select variable to pick sex
		sex.selectByValue("Female");//make selection by value, lookup value in code (inspect)
		driver.findElement(By.id("create")).click(); //enter "create" button
		//driver.switchTo().defaultContent();
	//	driver.switchTo().alert().accept();
driver.switchTo().defaultContent();//exit frame
driver.switchTo().frame(driver.findElement(By.id("modalframe")));//switch to different frame
driver.findElement(By.xpath("/html/body/center/input")).click();
Thread.sleep(3000);// wait time if you have pop-up, may not be able to locate fast enough
System.out.println(driver.switchTo().alert().getText());//print message on pop-up

String warning = driver.switchTo().alert().getText();//create variable to manipulate message displayed
if(warning.equals("New Due Clinical Reminders\n" + 
		"\n" + 
		"Assessment: Tobacco\n" + 
		"\n" + 
		"(See the Clinical Reminders widget for more details)")) {
	System.out.println("Test Passed");
}
else {System.out.println("Test failed");}// text validation, condition
driver.switchTo().alert().dismiss();//close alert or pop-up

driver.switchTo().frame(driver.findElement(By.id("modalframe")));//switch to current frame
System.out.println(driver.findElement(By.xpath("/html/body/div/p")).getText());//print message on the pop-up

String bday = ("Happy Birthday");
if (bday.equals("Happy Birthday")) {
	System.out.println("Test Complete");
}
else {System.out.println("Total Failure");
}// text validation
Thread.sleep(3000);//extra wait
driver.switchTo().defaultContent();//exit frame
driver.findElement(By.xpath("//*[@id=\"bdayreminder\"]/div/div/div[1]")).click();//close the popup (close icon outside frame in this case)

Actions logout = new Actions(driver);// create variabel to perform mouse over

logout.moveToElement(driver.findElement(By.xpath("//*[@id=\"username\"]/span[2]"))).perform();//mouse over needed section
driver.findElement(By.xpath("//*[@id=\"username\"]/div/ul/li[4]")).click();//click on logout

driver.close();//close window
	}

}


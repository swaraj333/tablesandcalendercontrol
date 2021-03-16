package tableandcalendercontrol;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_javaScript {
	public static WebElement departCal;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/swaraj/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/resources/demos/datepicker/dropdown-month-year.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
driver.get("https://jqueryui.com/resources/demos/datepicker/dropdown-month-year.html");
		
		// Locating departure date calendar
		 departCal= driver.findElement(By.id("datepicker"));
		String dateval="20/09/2019";
		selectdatebyjs(driver, departCal, dateval);
		
		
	}

	
	public static void selectdatebyjs(WebDriver driver,WebElement element,String dateval){
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		String script= "arguments[0].setAttribute('value','"+dateval+"');";
		jse.executeScript(script, departCal);
		}
}

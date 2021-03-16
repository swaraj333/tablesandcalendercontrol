package tableandcalendercontrol;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/Users/swaraj/Desktop/AutomationChallengeIDC/index.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[@class='btn btn-info btn-lg']")).click();
	
	driver.findElement(By.id("name")).sendKeys("Swaraj");
	driver.findElement(By.id("city")).sendKeys("hyderabad");
	driver.findElement(By.xpath("//button[@id='enter']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	String name=driver.findElement(By.id("nameVal")).getText();
	String city=driver.findElement(By.id("cityVal")).getText();
	if(name.toLowerCase().contains("swaraj") && city.toLowerCase().contains("hyderabad")  )
	{
		System.out.println("test case passed");
	}
	
	}

}

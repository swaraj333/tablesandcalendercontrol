package tableandcalendercontrol;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/Users/swaraj/Desktop/AutomationChallengeIDC/index.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='btn btn-primary dropdown-toggle']")).click();
		List<WebElement> list=	driver.findElements(By.xpath("//*[@id='test-2-div']/div/div/ul/li"));
		System.out.println(list);
		for(int i=0; i<list.size();i++)
		{
		String listvalues=	list.get(i).getText();
		System.out.println(listvalues);
		}
		
		
	}

}

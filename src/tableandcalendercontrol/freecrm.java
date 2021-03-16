package tableandcalendercontrol;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class freecrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://classic.crmpro.com/login.cfm/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='loginForm']/input[1]")).sendKeys("swaraj");
		driver.findElement(By.xpath(".//*[@id='loginForm']/input[2]")).sendKeys("swaraj");
		driver.findElement(By.xpath(".//*[@id='loginForm']/input[3]")).click();
		
		driver.switchTo().frame("mainpanel");
		String  date="September-11-2019";
		String dateArr[]=date.split("-");
		String month=dateArr[0];
		String day=dateArr[1];
		String year=dateArr[2];
		List<WebElement> dropdowns=driver.findElements(By.tagName("Select"));
		System.out.println(dropdowns.size());
		
		Select monthlist=new Select(driver.findElement(By.name("slctMonth")));
		monthlist.selectByVisibleText(month);
		Select yearlist=new Select(driver.findElement(By.name("slctYear")));
		yearlist.selectByVisibleText(year);
		String beforexpath=".//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
		String afterxpath="]/td[";
		final int totalweekdays=7;
		boolean flag=false;
		for (int rownum = 2; rownum< 7; rownum++) {
			for (int colnum=1; colnum < totalweekdays; colnum++) {
				
				String dayval=driver.findElement(By.xpath(beforexpath+rownum+afterxpath+colnum+"]")).getText();
				if(dayval.equals(day)){
					driver.findElement(By.xpath(beforexpath+rownum+afterxpath+colnum+"]")).click();
					flag=true;
					break;
				}
					
			}
			if(flag){
				break;
			}
			
		}
		
		

	}

}

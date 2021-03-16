package tableandcalendercontrol;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cleartrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath(".//*[@id='DepartDate']")).click();
		String dateoffly="20-June-2019";
		String temp[]=dateoffly.split("-");
		String date,month,year;
		date=temp[0];
		month=temp[1];
		year=temp[2];
		String calyear,calmonth,calday;
		calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		while(!calyear.equals(year))
		{
			driver.findElement(By.className("nextMonth")).click();
			
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!calmonth.equals(month))
		{
			driver.findElement(By.className("nextMonth")).click();
			
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		WebElement calender=driver.findElement(By.className("calendar"));
		List<WebElement> rows=calender.findElements(By.tagName("tr"));
		boolean flag=false;
		for(int i=1; i<rows.size();i++ )
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size(); j++)
			{
				calday=cols.get(j).getText();
				if(calday.equals(date))
				{
					cols.get(j).click();
					flag=true;
					break;
				}
			}
			if(flag)
			{
				break;
			}
		}
	}

}

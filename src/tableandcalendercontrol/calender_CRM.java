package tableandcalendercontrol;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class calender_CRM {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/swaraj/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 String date,month,year;
		String DOJ="18/November/2019";
			String [] temp =DOJ.split("/");
			date=temp[0];
			month=temp[1];
			year=temp[2];
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://classic.crmpro.com/");
		
		driver.findElement(By.name("username")).sendKeys("swaraj");
		driver.findElement(By.name("password")).sendKeys("swaraj"); 
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		driver.switchTo().frame("mainpanel");
		Select month_select=new Select(driver.findElement(By.xpath("//select[@name='slctMonth']")));
		month_select.selectByVisibleText(month);
		Select year_select= new Select(driver.findElement(By.xpath("//select[@name='slctYear']")));
		year_select.selectByVisibleText(year);
	//	driver.findElement(By.xpath("//table[@class='crmcalendar']"));
		String before_xpath="//table[@class='crmcalendar']/tbody/tr[2]/td/table/tbody/tr[";
		String after_xpath="]/td[";
		int total_weekdays =7;
		String dayvalue = null;
		boolean flag=false;
		for(int rownum=2;rownum<=7;rownum++){
			for(int colnum=1;colnum<=total_weekdays;colnum++){
				try{
				dayvalue=	driver.findElement(By.xpath(before_xpath+rownum+after_xpath+colnum+"]")).getText();
				}
				catch(NoSuchElementException e){
					System.out.println("please enter correct date format");
					flag=false;
					break;
				}
				
				if(dayvalue.equals(date)){
					driver.findElement(By.xpath(before_xpath+rownum+after_xpath+colnum+"]")).click();
					flag=true;
					break;
				}
				
			}
			if(flag){
				break;
			}
		}
	//	driver.quit();
		
		
	}

}

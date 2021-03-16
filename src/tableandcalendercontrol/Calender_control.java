package tableandcalendercontrol;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 String date,month,year;
		String DOJ="18/November/2019";
		String [] temp =DOJ.split("/");
		date=temp[0];
		month=temp[1];
		year=temp[2];
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("DepartDate")).click();
		String Calmonth,Calyear,Caldate;
		 Calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!month.equals(Calmonth))
		{
			driver.findElement(By.className("nextMonth ")).click();
			Calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		Calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		while(!year.equals(Calyear)){
			driver.findElement(By.className("nextMonth ")).click();
			Calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
			}
	WebElement Calender=driver.findElement(By.className("calendar"));
	List<WebElement> rows;
	List<WebElement> cols;
	boolean flag=false;
	rows = Calender.findElements(By.tagName("tr"));
	
	for(int i=1;i<rows.size();i++){
		cols=rows.get(i).findElements(By.tagName("td"));
		for(int j=0;j<cols.size();j++){
			Caldate=cols.get(j).getText();
			if(Caldate.equals(date)){
				cols.get(j).click();
				flag=false;
				break;
				}
			}
		if(flag){
			break;
		}
	}
	
		
	}

}

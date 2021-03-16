package tableandcalendercontrol;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmpidTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:/Users/swaraj/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://orangehrm.qedgetech.com");
	
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.className("button")).click();
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		WebElement emptable;
		List<WebElement> rows;
		List<WebElement> cols;
		
		emptable=driver.findElement(By.id("resultTable"));
		rows=emptable.findElements(By.tagName("tr"));
		for(int i=1;i<rows.size();i++)
		{
		WebElement empid=	driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]"));
		String empidlink=empid.findElement(By.tagName("a")).getText();
		
		while(! empidlink.contains("2352")){
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/form[1]/div[1]/ul[1]/li[9]/a[1]")).click();
			WebElement chkboxcell=	driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]/input"));
			WebElement	chkbox=chkboxcell.findElement(By.tagName("input"));
			chkbox.click();
		}
		//if(empidlink.contains("1702")){
		//WebElement chkboxcell=	driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]/input"));
		//WebElement	chkbox=chkboxcell.findElement(By.tagName("input"));
		//chkbox.click();
		
		//}
		}




	}

}

package tableandcalendercontrol;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffTable {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize(); 
	driver.get("https://money.rediff.com/tools/forex");
	WebElement currencytable=driver.findElement(By.xpath("//table[@class='dataTable']"));
	List<WebElement> tr,td;
	
	String Curname,Currate;
	tr=currencytable.findElements(By.tagName("tr"));
	System.out.println(tr.size());
	for(int i=1;i<tr.size();i++) {
		td=tr.get(i).findElements(By.tagName("td"));
		System.out.println("row no: "+i+"no of per cols: "+td.size());
		
	Curname=td.get(0).getText();
	Currate=td.get(1).getText();
	System.out.println(Curname+"-"+Currate);
	
		}
	
}
	
}


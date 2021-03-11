import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Webdriver path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='flightSearchContainer']/div[4]/div[1]/following-sibling::button")).click();
	
	//String month=driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']/div/span[1]")).getText();
	
	while(!driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']/div/span[1]")).getText().contains("June"))
	{
		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/div/a/span")).click();
		
	}
Thread.sleep(5000);
	List<WebElement> dates=driver.findElements(By.xpath("//td[@data-handler='selectDay']/a"));
		for(WebElement date :dates)
		{
			
			
			if(date.getText().equalsIgnoreCase("23"))
			{
				date.click();
				break;
			}
		}
			

	}

}

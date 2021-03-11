import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Autosuggestivedropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Webdriver path\\chromedriver.exe");
	
		
		//Create prefs map to store all preferences 
		Map<String, Object> prefs = new HashMap<String, Object>();

		//Put this into prefs map to switch off browser notification
		prefs.put("profile.default_content_setting_values.notifications", 2);

		//Create chrome options to set this prefs
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		//Now initialize chrome driver with chrome options which will switch off this browser notification on the chrome browser
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		//driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//input[@title='Any worldwide city or airport' and @data-selectionhandler='originAirlineSelectionHandler']" )).sendKeys("Indi");;
		Thread.sleep(4000);
		
		List<WebElement> countries=driver.findElements(By.xpath("//li[@role='presentation']"));
		for(WebElement Country :countries)
			
		{
			if(Country.getText().contains("Lindi, TZ - Kikwetu (LDI)"))
			{
				Country.click();
			break;
		}
		}
		Thread.sleep(4000);
		driver.quit();
	
	
	
	}

}

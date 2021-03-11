import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownwithincrement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Webdriver path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goindigo.in/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[contains(@class,'padd-left pax')]")).click();
		//driver.findElement(By.cssSelector("label[for='roundTrip']")).click();
		Thread.sleep(3000);
		int i=1;
		while(i<4)
		{
			driver.findElement(By.xpath("//*[@id=\'bookFlightTab\']/form/div[5]/div[1]/div[2]/ul/li[1]/div/button[2]")).click();;
			i++;
		}
		Thread.sleep(3000);
		driver.quit();
				
	}
}
		
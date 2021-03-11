import java.lang.reflect.Array;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ArraycontentstoNextsearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Webdriver path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.next.co.uk/");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);		
        String DressList[]= {"dresses","leggins","Shirts"};
        Actions a=new Actions(driver);
        for (int i=0;i<DressList.length;i++)
        {

		driver.findElement(By.xpath("//input[@placeholder='Search product or brand']")).sendKeys(DressList[i]);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();;
		driver.navigate().back();
		
	}

}
}
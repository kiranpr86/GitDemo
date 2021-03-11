import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class footerlinkscountandopening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Webdriver path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.marksandspencer.com/");
		WebElement footerdriver=	driver.findElement(By.xpath("//div[@class='navfooter-textlinks']"));

	List<WebElement> links=	footerdriver.findElements(By.tagName("a"));
	int count =links.size();
	
	System.out.println(count);
	String opentab=Keys.chord(Keys.CONTROL,Keys.ENTER);
	
	for(WebElement link :links)
		
	{
		link.sendKeys(opentab);
	
	}
	
	
	
	}

}

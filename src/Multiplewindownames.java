import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindownames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Webdriver path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.marksandspencer.com/");
		WebElement footerdriver = driver.findElement(By.xpath("//div[@class='navfooter-textlinks']"));

		List<WebElement> links = footerdriver.findElements(By.tagName("a"));
		int count = links.size();
	

		// System.out.println(count);
		String opentab = Keys.chord(Keys.CONTROL, Keys.ENTER);

		for (WebElement link : links)

		{
			link.sendKeys(opentab);
			Thread.sleep(3000);
		}
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}

		Thread.sleep(3000);

		driver.quit();

	}

}

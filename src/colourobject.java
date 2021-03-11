import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class colourobject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Webdriver path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.marksandspencer.com/");
		
		Thread.sleep(5000);
		
	String colour=	driver.findElement(By.xpath("//span[text()='Sign in']")).getCssValue("color");
	
System.out.println(colour);
	
	driver.quit();
	
	}

}

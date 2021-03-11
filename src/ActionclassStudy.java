import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionclassStudy {
		
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Webdriver path\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.marksandspencer.com/");
			Actions act=new Actions(driver);
			
			//WebElement mousehover=driver.findElement(By.id("SC_Level_1_462464_menu"));
			
		//	act.moveToElement(mousehover).build().perform();//Mousehover an element
			
		driver.findElement(By.className("navigation-search-bar--search")).click();
		WebElement Search=	driver.findElement(By.cssSelector("input[aria-label='suggestions appear below']"));
		Search.click();
		//act.keyDown(Keys.SHIFT).sendKeys("Leggins").sendKeys(Keys.ENTER).build().perform();//Typing in capital letters and hitting ENTER
		
		//act.contextClick(driver.findElement(By.linkText("Help"))).build().perform();//Right click
			
			//String newtab=Keys.chord(Keys.CONTROL,Keys.ENTER);//open in a new tab
			
			//driver.findElement(By.linkText("Help")).sendKeys(newtab);// Open in a new tab
			
		//	act.keyDown(Keys.SHIFT).sendKeys("Leggins").build().perform();
			
	//	String l=	Keys.chord(Keys.CONTROL,"a");//Select All
		//Search.sendKeys(l);//Select All
		
			
			Thread.sleep(3000);
			
			driver.quit();

	}

}

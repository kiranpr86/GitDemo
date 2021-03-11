import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdropdownstudy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Webdriver path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
	WebElement selectdropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	Select dropdown = new Select(selectdropdown);
	//First identifying the WE of Select dropdown then passing as argument 
	dropdown.selectByIndex(2);//Selecting by providing index
	dropdown.selectByValue("INR");//Selecting by providing Value
	dropdown.selectByVisibleText("USD");////Selecting by providing Visible text

	}

}

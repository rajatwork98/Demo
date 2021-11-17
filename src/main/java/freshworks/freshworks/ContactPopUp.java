package freshworks.freshworks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactPopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rkuma395\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Jump to website
		driver.get("https://www.freshworks.com/");
		
		//max window size
		driver.manage().window().maximize();
		
		//implicit wait for 5 sec.
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//click on accept all
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();	//conatct popup window
		
		driver.findElement(By.xpath("//*[@class='button button--solid button--small button--contact-sales fixed-float']")).click();
		
		//filling popup form
		
		//selectiong from dropdown
		WebElement testDropDown = driver.findElement(By.xpath("//*[@name='what-are-you-looking-for?']"));
		Select dropdown = new Select(testDropDown);  
		dropdown.selectByValue("ITSM Software"); 
		
		driver.findElement(By.xpath("/html/body/div[2]/div/form/fieldset[1]/div[2]/div[1]/div/input")).sendKeys("Rajat");
		driver.findElement(By.xpath("//*[@class='last-name-form']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//*[@class='company-form']")).sendKeys("Capgemini");
		driver.findElement(By.xpath("//*[@class='email-form']")).sendKeys("rajatkumar@gmail.com");
		driver.findElement(By.xpath("//*[@class='phone-form']")).sendKeys("8979055365");
		
		//submit
		driver.findElement(By.id("contact-sales-submit")).click();
		
		driver.close();		
		
		

	}

}

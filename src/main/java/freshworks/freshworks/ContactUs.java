package freshworks.freshworks;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactUs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rkuma395\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Jump to website
		driver.get("https://www.freshworks.com/");
		//max window size
		driver.manage().window().maximize();
		
		//implicit wait for 5 sec.
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		//jump to contact us page from the navigation bar
	    driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[3]")).click();
		driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[3]/ul/li[9]/a/span")).click();

		//getting some text for confirmation
		String text=driver.findElement(By.xpath("//*[@class='mb-md']")).getText();
		System.out.println(text);

		//schrollling js code
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1300)");
		
		
        //sending data to the contact form
		driver.findElement(By.xpath("//*[@class='first-name-form']")).sendKeys("Rajat");
		driver.findElement(By.xpath("//*[@class='last-name-form']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//*[@class='email-form']")).sendKeys("rajatkumar@gmail.com");
		
		//for dropdown and selecting 
		WebElement testDropDown = driver.findElement(By.xpath("//*[@name='query-contact']"));
		Select dropdown = new Select(testDropDown);  
		dropdown.selectByValue("Sales");  

		driver.findElement(By.xpath("//*[@class='phone-form']")).sendKeys("8979055365");
		driver.findElement(By.xpath("//*[@class='message-form']")).sendKeys("Testing message only for automation fillups ");	
		
		//click on submit
		driver.findElement(By.xpath("//*[@value='submit']")).click();
		
        //back to homepage
		driver.findElement(By.xpath("//*[@class='logo logo-fworks ']")).click();


	}

}

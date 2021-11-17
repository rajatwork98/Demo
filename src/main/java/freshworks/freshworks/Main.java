package freshworks.freshworks;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rkuma395\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Jump to website
		driver.get("https://www.freshworks.com/");
		//max window size
		driver.manage().window().maximize();
		
		//implicit wait for 5 sec.
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//clicking on register
		driver.findElement(By.xpath("//*[@class='banner-notification']")).click();
		
		//scrolling
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
        Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]
		
		//Get parent and child window id
		Iterator<String>it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		//switch to child window
		driver.switchTo().window(childId);
		Thread.sleep(5000);
		driver.close();

		//Swich to parent window
		driver.switchTo().window(parentId);
		//click on logo
		driver.findElement(By.xpath("//*[@class='logo logo-fworks ']")).click();
		
		driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[7]/i")).click();
		//for chinies text
		driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[7]/div/div/div[5]/a[3]/span[2]")).click();
		
		
		//for english text again
		driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[7]/i")).click();
		driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[7]/div/div/div[1]/a/span[2]")).click();
		
		//getting text from banner
		String text1=driver.findElement(By.xpath("//*[@class='h0-80']")).getText();
		System.out.println(text1);
		
		driver.findElement(By.xpath("/html/body/section[1]/div[2]/div/div[1]/div/a[1]")).click();
		
		
		//String registertext=driver.findElement(By.xpath("//*[@class='carina-rte-public-DraftStyleDefault-block']")).getText();
		//System.out.println(registertext);
		
		
		driver.findElement(By.xpath("/html/body/section[1]/div[2]/div/div[1]/div/a[2]")).click();
		
		//back to main page
		driver.switchTo().window(parentId);
		
		String text2=driver.findElement(By.xpath("//*[@class='align-center']")).getText();
		System.out.println(text2);
		
		//functional simple block
		//first block
		driver.findElement(By.xpath("//span[text()='Start free trial']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='logo logo-fworks ']")).click();
		
		//second functional box
		driver.findElement(By.xpath("//span[text()='See pricing']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='logo logo-fworks ']")).click();
		
		//third functional box
		driver.findElement(By.xpath("//span[text()='Visit marketplace']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='logo logo-fworks']")).click();
		
		//forth functional box
		driver.findElement(By.xpath("//span[text()='Start free trial']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='logo logo-fworks nav-super-logo']")).click();
		
		//Trusted by 50K+ customers big and small block
		String text3=driver.findElement(By.xpath("//*[@class='l-section-heading align-center']")).getText();
		System.out.println(text3);
		
		//for sliderbar text 
		driver.findElement(By.xpath("//*[@id=\"16361006216950\"]/div[2]/div/ol/li[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"16361006216950\"]/div[2]/div/ol/li[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"16361006216950\"]/div[2]/div/ol/li[1]")).click();
		
		
	    //see life at fresher work 
		driver.findElement(By.xpath("//a[text()=' See life at freshworks']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='logo logo-fworks ']")).click();
		
		//see all news
	
		driver.findElement(By.xpath("//a[text()='See all news']")).click();
		WebElement testDropDown = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div[1]/select"));
		Select dropdown = new Select(testDropDown);  
		dropdown.selectByValue("2015"); 
		js.executeScript("window.scrollBy(0,500)");
		
		//backtohomepage
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='logo logo-fworks ']")).click();
		
		
		//eof
		driver.quit();
		
		
	
		

	}

}

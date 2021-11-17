package freshworks.freshworks;

import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class SocialMediaLinks{



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rkuma395\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Jump to website
		driver.get("https://www.freshworks.com/");

		//max window size
		driver.manage().window().maximize();

		//facebook
		driver.findElement(By.xpath("//*[@class='icon-facebook']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		
		//after switching gettng some data from facebook page
		
		String Text=driver.findElement(By.xpath("//*[text()='+1 866-832-3090']")).getText();
		//printing phone number
		System.out.println("from facebook getting phone numner:"+Text);
		
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parentId);

		//twitter
		driver.findElement(By.xpath("//*[@class='icon-twitter']")).click();
		Set<String> windows2 = driver.getWindowHandles();
		Iterator<String> it2 = windows2.iterator();
		String parentId2 = it2.next();
		String childId2 = it2.next();
		driver.switchTo().window(childId2);
		
		//after switching gettng some data from Twitter page

		//String Text1=driver.findElement(By.xpath("//span/span/span[text()='Freshworks Inc']")).getText();
		//printing some text
		//System.out.println(Text1);
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parentId2);

		//youtube
		driver.findElement(By.xpath("//*[@class='icon-youtube']")).click();
		Set<String> windows3 = driver.getWindowHandles();
		Iterator<String> it3 = windows3.iterator();
		String parentId3 = it3.next();
		String childId3 = it3.next();
		driver.switchTo().window(childId3);
		
		
		//after switching gettng some data from Youtube page
		
		String Text2=driver.findElement(By.xpath("//yt-formatted-string[text()='Freshworks Inc.']")).getText();
		//printing youtube channel name
		System.out.println("from youtube channel name :"+Text2);
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parentId3);

		//linkedin
		driver.findElement(By.xpath("//*[@class='icon-linkedin']")).click();
		Set<String> windows4 = driver.getWindowHandles();
		Iterator<String> it4 = windows4.iterator();
		String parentId4 = it4.next();
		String childId4 = it4.next();
		driver.switchTo().window(childId4);
		
		//using assertion here for checking specific text
		//String actualString = driver.findElement(By.xpath("")).getText();
		//assertTrue(actualString.contains("Freshworks"));
		
		driver.close();
		driver.switchTo().window(parentId4);
		
		//gloassdoor
		driver.findElement(By.xpath("//*[@class='icon-glassdoor']")).click();
		Set<String> windows5 = driver.getWindowHandles();
		Iterator<String> it5 = windows5.iterator();
		String parentId5 = it5.next();
		String childId5 = it5.next();
		driver.switchTo().window(childId5);
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parentId5);


		driver.close();
	}

	private static void assertTrue(boolean contains) {
		// TODO Auto-generated method stub
		
	}
}
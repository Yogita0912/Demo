package MyMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ABCD 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");//method overriding- same method name parameter should be same
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().minimize();
		
		String Title=driver.getTitle();
		System.out.println(Title);
		
	    String PageSource=driver.getPageSource();
	    System.out.println(PageSource);
		
		String CurrentURL=driver.getCurrentUrl();
		System.out.println(CurrentURL);
		
		driver.findElement(By.id("src")).sendKeys("Wai");
		Thread.sleep(2000);//method overloading- same method name parameter should be different
		driver.findElement(By.id("dest")).sendKeys("Pune");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='fl button']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("manageHeaderdd")).click();
		Thread.sleep(2000);
		//driver.close();
		//Thread.sleep(2000);
		
	}
}

package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.magento.com");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.id("email")).sendKeys("kamohammed@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("i4fwYs8tM4DNY!t");
		
		driver.findElement(By.id("send2")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log Out")).click();
		Thread.sleep(3000);
		driver.close();
	}
}

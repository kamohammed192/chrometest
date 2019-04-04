package p1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		//InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.close();
	}

}

package packag;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test11 {

	public static void main(String[] args) 
	{
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter a Name");
	     String x=sc.nextLine();
		//Launch site
		System.setProperty("webdriver.chrome.driver", "D:\\MINDQ\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://angularjs.org/");
		driver.manage().window().maximize();
		//wait for page ready
		WebDriverWait w=new WebDriverWait(driver,2);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@ng-model='yourName']")));
		driver.findElement(By.xpath("//*[@ng-model='yourName']")).sendKeys(x);
		driver.close();

	}

}

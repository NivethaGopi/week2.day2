package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://acme-test.uipath.com/login");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("leaf@12");
		 driver.findElement(By.xpath("//div[@class='main-container']//button[@type='submit']")).click();
		 System.out.println("Title of the page is: "+ driver.getTitle());
		 driver.findElement(By.linkText("Log Out")).click();
		//driver.close();

	}

}

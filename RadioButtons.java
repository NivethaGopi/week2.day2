package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://www.leafground.com/pages/radio.html");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/input[@id='yes']")).click();
		 Thread.sleep(5000);
		 Boolean Que1 = driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/input[@id='yes']")).isSelected();
		 System.out.println("Selected option is:" + Que1);
		 Boolean Que2 = driver.findElement(By.xpath("//label[text()='Find default selected radio button']/following-sibling::input[@value='1']")).isSelected();
		 System.out.println("Default select Radio Button is:" + Que2);
		 boolean Que3 = driver.findElement(By.xpath("//div[@class='example']//input[@name='age'][2]")).isSelected();
		 System.out.println("Selected age group is:" + Que3);
		 //driver.close();
	}

}

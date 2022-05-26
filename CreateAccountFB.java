package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccountFB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://en-gb.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.linkText("Create New Account")).click();
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("User1");
		 driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input[@name='reg_email__']")).sendKeys("9484820296");
		 driver.findElement(By.xpath("//div[@id='password_field']//input[@id='password_step_input']")).sendKeys("User1@test");
		 WebElement Day = driver.findElement(By.xpath("//div[@class='_5k_5']//select[@id='day']"));
		 Select val = new Select(Day);
		 val.selectByVisibleText("1");
		 WebElement Month = driver.findElement(By.xpath("//div[@class='_5k_5']//select[@id='month']"));
		 Select val1 = new Select(Month);
		 val1.selectByVisibleText("Jul");
		 WebElement Year = driver.findElement(By.xpath("//div[@class='_5k_5']//select[@id='year']"));
		 Select val2 = new Select(Year);
		 val2.selectByVisibleText("1995");
		 driver.findElement(By.xpath("//label[text()='Female']")).click();

	}

}

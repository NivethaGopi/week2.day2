package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		 driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		 driver.findElement(By.id("firstNameField")).sendKeys("FN");
		 driver.findElement(By.id("lastNameField")).sendKeys("LN");
		 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Local FN");
		 driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Local LN");
		 driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing Dept");
		 driver.findElement(By.id("createContactForm_description")).sendKeys("Description Box");
		 driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("FNLN@gmail.com");
		 WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		 Select val = new Select(state);
		 val.selectByVisibleText("New York");
		 driver.findElement(By.className("smallSubmit")).click();
		 driver.findElement(By.linkText("Edit")).click();
		 driver.findElement(By.id("updateContactForm_description")).clear();
		 driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Page Edited");
		 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		 System.out.println("Title of the page is: "+ driver.getTitle());

	}

}

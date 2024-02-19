package PracticeAutomationTestingMyAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyAccountEditAddressFunctionality {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();  //Open the browser
		
		driver.get("http://practice.automationtesting.in/");
		
		driver.manage().window().maximize(); 
		
		driver.findElement(By.partialLinkText("Account")).click();   //Click on My Account Menu
		
		driver.findElement(By.id("username")).sendKeys("a1b2c3@gmail.com"); //Enter registered username
		
		driver.findElement(By.name("password")).sendKeys("A1@b2@c3@"); //Enter password
		
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();  //Click on login button
		
		driver.findElement(By.partialLinkText("Address")).click();   //Click on Address link
		
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/div/div[2]/header/a")).click();  //Click on Edit button

	}

}

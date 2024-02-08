package PracticeAutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithIncorrrectUsernameAndPassword {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();  //Open the browser
		
		driver.get("http://practice.automationtesting.in/");
		
		driver.manage().window().maximize(); 
		
		driver.findElement(By.partialLinkText("Account")).click();   //Click on My Account Menu
		
		driver.findElement(By.id("username")).sendKeys("a1r2y3a@gmail.com"); //Enter incorrect username
		
		driver.findElement(By.name("password")).sendKeys("A1rc3@"); //Enter incorrect password
		
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();  //Click on login button
	}

}

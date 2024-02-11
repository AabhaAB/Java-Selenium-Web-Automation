package PracticeAutomationTestingRegistration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationWithEmptyEmailid {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("http://practice.automationtesting.in/");
		
		driver.manage().window().maximize(); 
		
		driver.findElement(By.partialLinkText("Account")).click();   //Click on My Account Menu
		
		driver.findElement(By.xpath("//*[@id=\"reg_email\"]")).sendKeys(""); //Enter Email address

		driver.findElement(By.xpath("//*[@id=\"reg_password\"]")).sendKeys("A1@b2@c3@d4@"); //Enter password
		
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]")).click();  //Click on Register button

	}

}

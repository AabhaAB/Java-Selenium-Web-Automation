package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifySubscriptionInHomePage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver(); //Launch browser

		//Navigate to url 'http://automationexercise.com'
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		
		//Enter email address in input and click arrow button
		driver.findElement(By.id("susbscribe_email")).sendKeys("abc321@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"subscribe\"]")).click();
	}

}

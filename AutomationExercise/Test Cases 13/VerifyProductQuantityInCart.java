package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyProductQuantityInCart {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver(); //Launch browser

		//Navigate to url 'http://automationexercise.com'
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		
		//Click 'View Product' for any product on home page
		driver.findElement(By.xpath("/html/body/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div/div[2]/ul/li/a")).click();

		//Increase quantity to 4
		driver.findElement(By.xpath("//*[@id=\"quantity\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"quantity\"]")).sendKeys("4");
		
		//Click 'Add to cart' button
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
		
		//Click 'View Cart' button
		driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u")).click();
	}

}

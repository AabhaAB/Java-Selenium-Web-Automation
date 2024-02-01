package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchProduct {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver(); //Launch browser

		//Navigate to url 'http://automationexercise.com'
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();

		//Click on 'Products' button
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
		
		//Enter product name in search input and click search button
		driver.findElement(By.id("search_product")).sendKeys("Top");
		driver.findElement(By.xpath("//*[@id=\"submit_search\"]/i")).click();


	}

}

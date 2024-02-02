package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddProductsInCart {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver(); //Launch browser

		//Navigate to url 'http://automationexercise.com'
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();

		//Click on 'Products' button
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
		
		//Hover over first product and click 'Add to cart'
		WebElement element = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/a")).click();
		
		//Click 'Continue Shopping' button
		driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[1]/div/div/div[3]/button")).click();

		//Hover over second product and click 'Add to cart'
		WebElement element1 = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]/div[1]"));
		Actions a = new Actions(driver);
		a.moveToElement(element1).perform();
		driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]/div[2]/div/a")).click();

		//Click 'View Cart' button
		driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u")).click();
		
	}

}

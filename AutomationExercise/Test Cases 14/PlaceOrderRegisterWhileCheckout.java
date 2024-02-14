package AutomationExercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlaceOrderRegisterWhileCheckout {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]"));
		
		Actions action = new Actions(driver); 
		action.moveToElement(element).perform();	
		
		driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/a")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='cartModal']/div/div/div[2]/p[2]/a/u"))).click();
		
		//Proceed to Checkout
		driver.findElement(By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a")).click(); 
		driver.findElement(By.xpath("//*[@id=\"checkoutModal\"]/div/div/div[2]/p[2]/a/u")).click();

		//Enter name and email address
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("abc");  
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("abc321@gmail.com"); 

		//Click 'Signup' button
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		
		//Fill details: Title, Name, Email, Password, Date of birth
		driver.findElement(By.id("id_gender2")).click();    //id Locator
		driver.findElement(By.id("password")).sendKeys("abc@321");
		driver.findElement(By.id("days")).sendKeys("10");
		driver.findElement(By.id("months")).sendKeys("March");
		driver.findElement(By.id("years")).sendKeys("2000");
		
		// Select checkbox 'Sign up for our newsletter!'
		driver.findElement(By.id("newsletter")).click();
		
		// Select checkbox 'Receive special offers from our partners!'
		driver.findElement(By.id("optin")).click();

		//Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
		driver.findElement(By.id("first_name")).sendKeys("abc");
		driver.findElement(By.id("last_name")).sendKeys("xyz");
		driver.findElement(By.id("company")).sendKeys("alpha");
		driver.findElement(By.id("address1")).sendKeys("Pune");
		driver.findElement(By.id("address2")).sendKeys("Delhi");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("state")).sendKeys("Maharastra");
		driver.findElement(By.id("city")).sendKeys("Pune");
		driver.findElement(By.id("zipcode")).sendKeys("411002");
		driver.findElement(By.id("mobile_number")).sendKeys("8000000000");
		
		// Click 'Create Account button'
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
		// Click 'Continue' button
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();	
		driver.findElement(By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"ordermsg\"]/textarea")).sendKeys("Deliver Product on Time");
		driver.findElement(By.xpath("//*[@id=\"cart_items\"]/div/div[7]/a")).click();

		//Enter payment details: Name on Card, Card Number, CVC, Expiration date
		driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[1]/div/input")).sendKeys("ABC");
		driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[2]/div/input")).sendKeys("12345678");
		driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[1]/input")).sendKeys("112");
		driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[2]/input")).sendKeys("10");
		driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[3]/input")).sendKeys("2028");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();  //Delete account
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click(); //Continue button

	}

}

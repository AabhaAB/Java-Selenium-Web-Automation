package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterUser {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver(); //Launch browser

		//Navigate to url 'http://automationexercise.com'
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		
		//Click on Signup button
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();  //xpath locator
		
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
	}
}

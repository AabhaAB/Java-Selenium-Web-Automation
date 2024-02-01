package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginUserWithIncorrectEmailAndPassword {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver(); //Launch browser

		//Navigate to url 'http://automationexercise.com'
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		
		//Click on Login button
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();  
		
		// Enter Incorrect email address and password
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("abc009987@gmail.com");  
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("abc@009987"); 

		//Click 'login' button
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click(); 
	}

}

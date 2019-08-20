package start;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Practice\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mplifytech.com/#!/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement contact = driver.findElement(By.linkText("Contacts"));
		contact.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement email = driver.findElement(By.linkText("contact@mplifytech.com"));
		String emailID = email.getText();
		System
		.out.println("email id is :-" +emailID );
		


	}

}

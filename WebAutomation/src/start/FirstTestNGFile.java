package start;

import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNGFile {
	private static final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
	
	// non-static Matcher object because it's created from the input String
	private Matcher matcher;
	
	// static Pattern object, since pattern is fixed
	private static Pattern pattern;
	
  @Test
  
  public void f() {
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
		System.out.println("email id is :- " +emailID );
		String ActualemailID = "contact@mplifytech.com";
		Assert.assertEquals(emailID, ActualemailID);
		System.out.println("email id is valid " );
		driver.close();
		
		pattern = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);
		
		//String invaliDEmail = "contactmplifytech.com";
		matcher = pattern.matcher(emailID);
		 boolean value = matcher.matches();
		 if (value==true)
		 {
			 System.out.println("valid email");
		 }
		 else
			 
		 {
			 System.out.println("Invalid email");
		 }
		
  }
}

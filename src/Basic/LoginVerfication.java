package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginVerfication {

	WebDriver driver;
	public LoginVerfication() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://webapp.qedgetech.com/login.php");
		
	}
}

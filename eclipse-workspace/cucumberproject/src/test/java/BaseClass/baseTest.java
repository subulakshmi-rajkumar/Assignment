package BaseClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class baseTest {
         public static WebDriver driver;
	static 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subul\\eclipse-workspace\\Hello-selenium\\src\\test\\resources\\driver\\chromedriver.exe");
		try {
			driver=new ChromeDriver();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);		
		
	}
	public baseTest() {
		// TODO Auto-generated constructor stub
		//driverinitiation();
		//this.driver=driver;
		//PageFactory.initElements(driver, this);
	}
}

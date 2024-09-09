package MVNO_Login;

import java.util.concurrent.TimeUnit;

import org.bouncycastle.util.Arrays;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	private static final String TimesUnit = null;
	WebDriver driver;
	
	@Parameters("BrowserName")
	@BeforeMethod
	
	public void BrowserOpen(String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase("chrome"))  {
			WebDriverManager.chromedriver()	.setup();		
		    driver=new ChromeDriver();
		    
		}else {
			if(BrowserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}else {
				if(BrowserName.equalsIgnoreCase("edge")) {
					WebDriverManager.edgedriver().setup();
					driver=new EdgeDriver();
		}
			
			}
		}
		
			
			driver.get("https://mvnoconnect.telgoo5.com/api/telgoo5/index.php?TwUm+NtXUKcPsFebTXxJYucsXxh8mohjh3FyijY5mRw=");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			
		}
		
	
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
		}
		




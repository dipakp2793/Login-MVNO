package MVNO_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://mvnoconnect.telgoo5.com/api/telgoo5/index.php?TwUm+NtXUKcPsFebTXxJYucsXxh8mohjh3FyijY5mRw=#");
		
		driver.manage().window().maximize();
		WebElement user=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		user.sendKeys("Dipak");
		WebElement pass=driver.findElement(By.xpath("//input[@type=\"password\"]"));
		pass.sendKeys("Dvish@123");
		
		WebElement enter=driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		enter.click();
		WebElement grap=driver.findElement(By.xpath("//img[@src=\"images/01-graph.jpg\"]"));
		grap.click();
		
		
	

	}

}

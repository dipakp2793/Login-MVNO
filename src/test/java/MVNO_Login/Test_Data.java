package MVNO_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_Data extends BaseClass {
	
	@Test(dataProvider="testdata")
	
	public void loginTest(String username, String password, String exp) {
		
	WebElement username1=driver.findElement(By.xpath("//input[@id=\"email_input\"]"));
	 username1.sendKeys(username);
		
	WebElement pass=	driver.findElement(By.xpath("//input[@id=\"chkYes\"]"));
	pass.sendKeys(password);
		
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		
		
		String expected_title="Telgoo5 - MVNO";
		String Actual=driver.getTitle();
		
		if(exp.equals("Valid_data")) {
			if (expected_title.equals(Actual)) {
				
				driver.findElement(By.xpath("//a[contains(@class,'dropdown-toggle')]")).click();
				driver.findElement(By.xpath("//a[contains(@class,'btn btn-info btn-flat')]")).click();
				Assert.assertTrue(true);
			}else {
				Assert.assertTrue(false);
			}
		}
		else if(exp.equals("Invalid_Data")) {
			if(expected_title.equals(Actual)) {
				
			
				
				driver.findElement(By.xpath("//a[contains(@class,'dropdown-toggle')]")).click();
				driver.findElement(By.xpath("//a[contains(@class,'btn btn-info btn-flat')]")).click();
				
				Assert.assertTrue(false);
			}else {
				Assert.assertTrue(true);
				
			}
		}
		
	
	}
	@DataProvider(name="testdata")
	public Object[][] tData() {
		
		return new Object[][] {
			{"Dipak","Dvish@123","Valid_data"},
			{"Patil","Test123", "Invalid_data"},
			{"Vivek","Test@147","Invalid_data"}
		};
	}
	
	

}

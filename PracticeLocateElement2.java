package automation.testsuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.comon.CommonBase;
public class PracticeLocateElement2 extends CommonBase{
	@BeforeMethod
	public void openBrowserTest()
	{
		driver = initBrowser("https://automationfc.github.io/basic-form/index.html");
	}
	@Test
	public void locateById()
	{
	WebElement textName = driver.findElement(By.id("name"));
	System.out.println("User Email Element is: " + textName);	
	WebElement textAddress = driver.findElement(By.id("address"));
	System.out.println("Password Element is: " + textAddress);
}
	@Test
	public void locateByName()
	{
		//driver = initBrowser("https://alada.vn/tai-khoan/dang-nhap.html");
		WebElement textEmail = driver.findElement(By.name("email"));
		System.out.println("Username Element is: " + textEmail);	
		WebElement textPassword = driver.findElement(By.name("password"));
		System.out.println("Password Element is: " + textPassword);
		
	}
	
}
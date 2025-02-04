package automation.testsuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.comon.CommonBase;
public class PracticeLocateElement extends CommonBase{
	@BeforeMethod
	public void openBrowserTest()
	{
		driver = initBrowser("https://selectorshub.com/xpath-practice-page/");
	}
	//@Test
	public void locateById()
	{
	WebElement textEmail = driver.findElement(By.id("shub86"));
	System.out.println("User Email Element is: " + textEmail);	
	WebElement textPassword = driver.findElement(By.id("pass"));
	System.out.println("Password Element is: " + textPassword);
}
	@Test
	public void locateByName()
	{
		//driver = initBrowser("https://alada.vn/tai-khoan/dang-nhap.html");
		WebElement textUsername = driver.findElement(By.name("email"));
		System.out.println("Username Element is: " + textUsername);	
		WebElement textPassword = driver.findElement(By.name("Password"));
		System.out.println("Password Element is: " + textPassword);
		WebElement textCompany = driver.findElement(By.name("company"));
		System.out.println("Password Element is: " + textCompany);
		WebElement textMobile = driver.findElement(By.name("mobile number"));
		System.out.println("Password Element is: " + textMobile);
	}
	
}
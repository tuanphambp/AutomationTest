package automation.testsuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.comon.CommonBase;
public class LoginTest extends CommonBase{
	@BeforeMethod
	public void openBrowserTest()
	{
		driver = initBrowser("https://alada.vn/tai-khoan/dang-nhap.html");
	}
	
	@Test
public void locateById()
{
	//driver = initBrowser("https://alada.vn/tai-khoan/dang-nhap.html");
	WebElement textUsername = driver.findElement(By.id("txtLoginUsername"));
	System.out.println("Username Element is: " + textUsername);	
	WebElement textPassword = driver.findElement(By.id("txtLoginPassword"));
	System.out.println("Password Element is: " + textPassword);
}
	@Test
	public void locateByName()
	{
		//driver = initBrowser("https://alada.vn/tai-khoan/dang-nhap.html");
		WebElement textUsername = driver.findElement(By.name("txtLoginUsername"));
		System.out.println("Username Element is: " + textUsername);	
		WebElement textPassword = driver.findElement(By.name("txtLoginPassword"));
		System.out.println("Password Element is: " + textPassword);
	}
	@Test
	public void locateByClassName()
	{
		//driver = initBrowser("https://alada.vn/tai-khoan/dang-nhap.html");
		WebElement btnFaceBook = driver.findElement(By.className("btn_face"));
		System.out.println("Button facebook element is: "+btnFaceBook);
	}
	@Test
	public void locateByLinkText()
	{
		//driver = initBrowser("https://alada.vn/tai-khoan/dang-nhap.html");
		WebElement linkQuenMatKhau = driver.findElement(By.linkText("Quên mật khẩu?"));
		System.out.println("Link forgot password is: " +linkQuenMatKhau);
		WebElement linkGiangVien = driver.findElement(By.partialLinkText("giảng viên"));
		System.out.println("Link Login for trainer is: " +linkGiangVien);
	}
	@Test
	public void locateByTagName()
	{
		//driver = initBrowser("https://alada.vn/tai-khoan/dang-nhap.html");
		WebElement textInput = driver.findElement(By.tagName("input"));
		System.out.println(textInput);
	}
}

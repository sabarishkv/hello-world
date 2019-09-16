package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mercuryregister {

	public static void main(String[] args) throws Exception {
	

		System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://www.newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstName")).sendKeys("abx");
		driver.findElement(By.name("lastName")).sendKeys("xyz");
		driver.findElement(By.name("phone")).sendKeys("112233444");
		driver.findElement(By.id("userName")).sendKeys("sabarish547");
		driver.findElement(By.name("address1")).sendKeys("new st");
		driver.findElement(By.name("address2")).sendKeys("hyd");
		driver.findElement(By.name("city")).sendKeys("bcxgs");
		driver.findElement(By.name("state")).sendKeys("12345");
		driver.findElement(By.name("postalCode")).sendKeys("530020");
		new Select(driver.findElement(By.name("country"))).selectByVisibleText("UNITED STATES");
		driver.findElement(By.id("email")).sendKeys("sabrish@mail.com");
		driver.findElement(By.name("password")).sendKeys("12345345");
		driver.findElement(By.name("confirmPassword")).sendKeys("12345345");
		driver.findElement(By.name("register")).click();
		driver.quit();
		

	}

	private static Object findElement(By name) {
		// TODO Auto-generated method stub
		return null;
	}

}

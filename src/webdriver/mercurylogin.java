package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mercurylogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://www.newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("mercury");//for username
		driver.findElement(By.name("password")).sendKeys("mercury");//for password 
		driver.findElement(By.name("login")).click();
		// TODO Auto-generated method stub

	}

}

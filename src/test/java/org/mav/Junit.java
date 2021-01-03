package org.mav;

import java.sql.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit {
	static WebDriver driver;
	@BeforeClass
	public static void launch() {
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\gange\\eclipse-workspace\\Maven\\src\\div\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.get("https://www.facebook.com/");
	}
	
@Before
public void before() {
  Date d=new Date(0);
  System.out.println(d);
}


@Test
public void test() throws InterruptedException {
	Thread.sleep(5000);
WebElement email = driver.findElement(By.id("email"));
email.sendKeys("Gangesh@gmail.com");
WebElement pass = driver.findElement(By.id("pass"));
pass.sendKeys("123456");
driver.findElement(By.xpath("//button[@type='submit']")).click();

}

@After
public void after() {
 Date d=new Date(0);
 System.out.println(d);
}
@AfterClass
public static void afterClass() {
	driver.quit();
}

}

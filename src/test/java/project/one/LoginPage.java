package project.one;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	WebDriver driver;
	public void start() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\project.one\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://zenjadeautomation.com/software/");
	}
	public void scroll() throws Exception {
		Robot rb = new Robot();
		for (int i = 0;i<10;i++) {
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);
		}
	}
	public WebElement getUname() {
		WebElement uname = driver.findElement(By.xpath("//input[@id='username']"));
		return uname;
	}
	public WebElement getPass() {
		return driver.findElement(By.xpath("//input[@id='password']"));
	}
	public WebElement getSubmit() {
		return driver.findElement(By.xpath("//button[@id='submit']"));
	}
	public  void tearDown() {
		driver.quit();
	}
}

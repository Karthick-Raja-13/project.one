package project.one;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KeyControls {
@Test
public void testRobot() throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\project.one\\src\\test\\resources\\drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://zenjadeautomation.com/software/");
	driver.manage().window().maximize();
	Robot rb = new Robot();
	for (int i=0;i<15;i++) {
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
	}
	
}
}

package project.one;

import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class SikuliTest {
@Test
public void test() throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\project.one\\src\\test\\resources\\drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://zenjadeautomation.com/");
	driver.manage().window().maximize();
	Screen s = new Screen();
	Pattern home = new Pattern("‪src/test/resources/snaps2/home.png");
	Pattern enroll = new Pattern("C:\\Users\\Admin\\eclipse-workspace\\project.one\\src\\test\\resources\\snaps2\\enroll.png");
	Pattern inp = new Pattern("C:\\Users\\Admin\\eclipse-workspace\\project.one\\src\\test\\resources\\snaps2\\inp1.png");
	s.wait(home,3);
	s.click(home);
	s.wait(enroll,3);
	s.click(enroll);
	s.wait(inp,3);
	s.type(inp,"Something");
}
}

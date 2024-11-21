package project.one;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class First {

	public static void main(String[] args) throws Exception {
		
		/*ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setCapability("browserVersion", "130");
		chromeOptions.setCapability("browserName", "chrome");
		chromeOptions.setCapability("platformName", "Windows");
		chromeOptions.setCapability("se:name", "My simple test");
		 * System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\project.one\\src\\test\\resources\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://zenjadeautomation.com/");
		driver.manage().window().maximize();
		WebElement enquire = driver.findElement(By.linkText("Enquire Now"));
		System.out.println(enquire.isDisplayed());
		System.out.println(enquire.getText());
		enquire.click();
		WebElement name = driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-09a69c2 elementor-widget__width-initial elementor-widget elementor-widget-wpforms']//input[@id='wpforms-1666-field_2']"));
		System.out.println(name.isDisplayed());
		name.sendKeys("Zenjade");
		WebElement training = driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-09a69c2 elementor-widget__width-initial elementor-widget elementor-widget-wpforms']//select[@id='wpforms-1666-field_5']"));
		System.out.println(training.isDisplayed());
		Select s = new Select(training);
		s.selectByVisibleText("Core Training");
		WebElement close = driver.findElement(By.xpath("//a[@aria-label='Close']//*[name()='svg']"));
		close.click();
		try {
			Thread.sleep(Duration.ofSeconds(3));
		}
		catch (Exception e){
			System.out.println("Error Caused");
		}
		driver.findElement(By.linkText("About Us")).click();
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.56.1:4444"), cap);
		driver.get("http://www.google.com");
		driver.quit();
		*/
		
		
		
		
	}

}

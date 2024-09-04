package DemoTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub		
		
		WebDriver driver = null;
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Subasri\\Downloads\\geckodriver\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.navigate().to("https://uat.karkakasadara.in/");
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();

	}

}

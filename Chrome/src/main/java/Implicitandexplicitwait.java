import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitandexplicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/dv/chromedriver.exe");
		//co.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//implicit will affect the function find element and find elements \
		//it is common for all elements ,whenever there is a time take to detect te element implicit wait will affect 
		driver.findElementByLinkText("Log in").click();
		driver.findElementByXPath("//input[@name= 'ema']").sendKeys("pnave469@gmail.com");
		//driver.findElementByXPath("//input[@name= 'email']").sendKeys("pnave469@gmail.com");
		driver.findElementByXPath("//button[.= 'Forgotten password?']").click();
		driver.findElementByXPath("//input[@name= 'fgEmail']").sendKeys("pnave469@gmail.com");
		driver.findElementByXPath("//button[.= 'RESET']").click();
		System.out.println("nave");
		}

}

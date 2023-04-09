import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.html5.AddApplicationCache;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/dv/chromedriver.exe");
		//co.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.findElementByLinkText("Log in").click();
		driver.findElementByXPath("//input[@name= 'email']").sendKeys("pnave469@gmail.com");
		//driver.findElementByXPath("//input[@name= 'email']").sendKeys("pnave469@gmail.com");
		driver.findElementByXPath("//button[.= 'Forgotten password?']").click();
		driver.findElementByXPath("//input[@name= 'fgEmail']").sendKeys("pnave469@gmail.com");
		driver.findElementByXPath("//button[.= 'RESET']").click();
		System.out.println("nave");
		}

}

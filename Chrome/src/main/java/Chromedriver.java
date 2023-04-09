import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedriver extends ChromeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		//login
		driver.findElementByLinkText("Sign up").click();
		//driver.findElementByName("email").sendKeys("pnave469@gmail.com");
		//driver.findElementByName("name").sendKeys("pnave46com");
		//driver.findElementByName("password").sendKeys("pnave469@gmai");
		//driver.findElementByXPath("//button[.='LOGIN']").click();
		driver.findElementByXPath("//input[@id='name']").sendKeys("Naveena");
		driver.findElementByXPath("//input[@id='email']").sendKeys("pnave469@gmail.com");
		driver.findElementByXPath("//input[@type='password']").sendKeys("Selenium@1");
		driver.findElementByXPath("//input[@id='agree']").click();
		driver.findElementByXPath("//button[.='SIGN UP']").click();
	}

}

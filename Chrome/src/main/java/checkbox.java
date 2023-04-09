import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/dv/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/radio");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//to click the radiobutton
		driver.findElementByXPath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[1]/div/label[1]").click();
		
	WebElement e=	driver.findElementByXPath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[1]/div/label[1]");
	System.out.println(e.isSelected());
	WebElement e3=driver.findElementById("yes");
	System.out.println("to check the button which is selected" +e3.getText());
	WebElement e1=	driver.findElementByXPath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[6]/label[2]/input");
	System.out.println(e1.isSelected());
	
	Boolean tr= driver.findElementById("maybe").isEnabled();
	System.out.println(tr);
	driver.quit();
	}

}

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/dv/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		//driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		WebElement e=driver.findElementById("fruits");
		Select build = new Select (e);
		build.selectByVisibleText("Apple");
		WebElement e1=driver.findElementById("country");
		Select build1 = new Select (e1);
	build1.selectByValue("India");
	WebElement e2=driver.findElementById("superheros");
	Select build2 = new Select (e2);
build2.selectByValue("bt");

Select build3 = new Select (e2);
build3.selectByValue("ta");

Select build4 = new Select (e2);
build4.getAllSelectedOptions();
Select build5 = new Select (e2);
build5.deselectByValue("ta");

Select build6 = new Select (e2);
build6.selectByIndex(1);
build6.getFirstSelectedOption();

	}

	
}

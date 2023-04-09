import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.Point;;
public class Buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://letcode.in/buttons");
		//Getting the color of the field
		WebElement ele =Driver.findElementById("color");
		String cl=ele.getCssValue("background-color");
		System.out.println(cl);
		Driver.close();
	Rectangle Rect= Driver.findElementById("property").getRect();
	 System.out.println(Rect.getHeight());
	 System.out.println(Rect.getWidth());
	
	//System.out.println("Height:"+c);
	//System.out.println("Width:"+n);
	Driver.close();
	}

}

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/dv/chromedriver.exe");
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://letcode.in/buttons");
		Driver.navigate().refresh();
		Driver.findElementById("home").click();
		String Url1=Driver.getCurrentUrl();
		System.out.println("Homepage:"+Url1);
		Driver.navigate().back();
		Driver.navigate().forward();
		Driver.navigate().refresh();
		String Url2=Driver.getCurrentUrl();
	//	System.out.println("Back:"+Url2);
				if (Url2.equals("https://letcode.in/buttons"))
			{
					System.out.println("-----Test case is pass------");
			}
				
				
		else {
			System.out.println("Test case is faile");
			}
				
				
		Driver.quit();
		}

}

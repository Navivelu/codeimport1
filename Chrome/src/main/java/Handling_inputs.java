import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_inputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/dv/chromedriver.exe");
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://letcode.in/edit/");
		
	Driver.findElementById("fullName").sendKeys("Nave");
		//to append the values in the field & keyboard button 
	
	Driver.findElementById("join").sendKeys("Nave",Keys.BACK_SPACE);
	

	// to obtain the values from the field
	String gtvlues =Driver.findElementById("join").getAttribute("value");
	System.out.println(gtvlues);
	//clear the text
	
	//Driver.findElementById("fullName").clear
	String gtvlues1 =Driver.findElementById("fullName").getAttribute("value");
	System.out.println(gtvlues1);
	// to confirm the field is enabled 
	boolean noedit=Driver.findElementById("noEdit").isEnabled();
	System.out.println(noedit);
	boolean noedit1=Driver.findElementById("fullName").isEnabled();
	System.out.println(noedit1);
	Driver.quit();// to close the browser
	}

}

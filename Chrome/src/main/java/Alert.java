import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Alert {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/dv/chromedriver.exe");
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://letcode.in/alert");
	//andling the simple alert 
		
		File f1=		Driver.getScreenshotAs(OutputType.FILE);
		File f2=new File ("./Screenshots/Alert1.png");
		FileHandler.copy(f1, f2);
		
		Driver.findElementById("accept").click();
		//thread.sleep(3000);
		org.openqa.selenium.Alert Al =Driver.switchTo().alert();// to andle the simple alert
		String tex=Al.getText();
		if(tex.equals("Hey! Welcome to LetCode")){
			
			Al.accept();
			//Dismiss --> to cancel the alert
			System.out.println("Error code is correct able to handle te alert");
		}
		else {
			System.out.println("Error code is incorrect unable to handle");
		}
		//Prompt alert
		Driver.findElementById("prompt").click();
		org.openqa.selenium.Alert Al2 =Driver.switchTo().alert();
		Al2.sendKeys("Navee:-(");
		System.out.println(Al2.getText());
		Al2.accept();
		
		String t1=Driver.findElementById("myName").getText();
	//	=text.getText();
	System.out.println("After printing te value in Alert ppage:"+t1);

	Driver.close();
		
	}

}

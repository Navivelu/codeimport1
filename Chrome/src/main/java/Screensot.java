import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screensot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://letcode.in/buttons");
		File Fr=Driver.getScreenshotAs(OutputType.FILE);  // Take te screenshort of the wole driver and store it in File format
		File des=new File("./Screenshots/image.png"); // Provide the location details to store the screensot
		FileHandler.copy(Fr, des); // Copying the file data
		
		
		//element screenshot
		WebElement ele =Driver.findElementById("color");
		File Fr1=ele.getScreenshotAs(OutputType.FILE);
		File des1=new File("./Screenshots/element1.png");
	FileHandler.copy(Fr1, des1);
	
	//Section Screensot
	WebElement ele3 =Driver.findElementByClassName("navbar-brand");
	File Fr2=ele3.getScreenshotAs(OutputType.FILE);
	File des2=new File("./Screenshots/element3.png");
FileHandler.copy(Fr2, des2);
	
	
	Driver.quit();
		
		
		
	}

}

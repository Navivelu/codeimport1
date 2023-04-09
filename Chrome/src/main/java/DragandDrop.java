import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/dv/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().fullscreen();
		//WebElement s=driver.findElementById("draggable"); // storing in one webelemt
		//WebElement n= driver.findElementById("droppable"); //storing te target location one webelemnt
	//	Actions ac = new Actions(driver); 
		// drag and drop function will come under action so we in action fucntion calling the construction of webdriver
		//ac.dragAndDrop(s,n).perform();
		//------drag and move the box into te frame
		driver.switchTo().frame(0);
		WebElement src =driver.findElementById("draggable");
		Actions ac1=new Actions(driver);
		int x = (src).getLocation().getX();
		System.out.println(x);
		int y = (src).getLocation().getY();
		System.out.println(y);
		System.out.println(src);
	ac1.dragAndDropBy(src, x+90, y+100).perform();
	
	
	//To perform Right click
	
//ac1.contextClick(Weblement of click button)ac1.perform();
driver.close();
	}

}


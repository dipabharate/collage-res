package genericPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class worklib extends BaseTest {
	public void handleFrameByIndex(int index)
	{
		driver.switchTo().frame(index);
	}

	public void handleFrameByIndex(WebElement frameElement)
	{
		driver.switchTo().frame(frameElement);
	}
	
	public void handleFramebyNameorId(String name)
	{
		driver.switchTo().frame(name);
	}
	
	public void rightClick(WebElement target)
	{
		Actions act = new Actions(driver);
		act.contextClick().perform();
		
	}

}

package zoomcar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zoomcar 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.zoomcar.com/");
		driver.navigate().refresh();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		try{
		WebElement findElement = driver.findElement(By.xpath("//*[@id='home']/div[1]/div/div/div/div/div[4]/div[1]/img"));
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			System.out.println("error");
		}
		
	}
}

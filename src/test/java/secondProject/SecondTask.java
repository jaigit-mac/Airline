package secondProject;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class SecondTask extends BaseClass
{
	@Before
	public void startTime()
	{
		Date date = new Date();
		System.out.println("Launching Time: " + date);
	}
	@After
	public void endTime()
	{
		Date date1 = new Date();
		System.out.println("Ending Time: " + date1);
	}
	@Test
	public void airWays() throws Throwable
	{
		driver.findElement(By.id("ide")).click();	
		driver.findElement(By.xpath("//option[text()='EN']")).click();	
		driver.findElement(By.id("id15")).click();
		Robot r = new Robot();
		for(int i=1;i<=5;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			if(i == 5)
			{
				r.keyPress(KeyEvent.VK_ENTER);
			}
		}
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		WebElement des = driver.findElement(By.id("id14"));	
		des.sendKeys("Olbia (OLB)");
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		for(int j=1;j<=2;j++)		
		{
			r.keyPress(KeyEvent.VK_DOWN);							
			r.keyRelease(KeyEvent.VK_DOWN);			
			if(j == 2)
			{
				r.keyPress(KeyEvent.VK_ENTER);
			}
		}		
	    Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(7000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);	
	}
}

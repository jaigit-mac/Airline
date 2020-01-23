package secondProject;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass
{
	static WebDriver driver;
	@BeforeClass
	public static void beforLaunch() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jai\\eclipse-workspace\\HelveticProject\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.helvetic.com/en");
		driver.manage().window().maximize();
		TakesScreenshot tk =(TakesScreenshot)driver;
		File temp = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(temp);
		File desc = new File("C:\\Users\\Jai\\eclipse-workspace\\HelveticProject\\Screenshot\\temp.helvetic.png");
		FileUtils.copyFile(temp, desc);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}	
	@Test
	public void Test1() throws Throwable
	{
		JavascriptExecutor j = (JavascriptExecutor)driver;
		 WebElement oneway = driver.findElement(By.id("id54-w-lbl"));
		 j.executeScript("arguments[0].click()", oneway);
		 Thread.sleep(5000);
//		 driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/form/div[2]/div/div[5]/div[1]/span[2]/input")).sendKeys("30/05/2020");;
		 driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("");
//		 j.executeScript("arguments[0].setAttribute('value','16.05.2020')", date);		 
	}	
	@Test
	public void Test2() throws Throwable
	{
		JavascriptExecutor l = (JavascriptExecutor)driver;
		WebElement adult = driver.findElement(By.name("searchContainer:travellersContainer:adults"));
		l.executeScript("arguments[0].setAttribute('value','2')", adult);	
//		Assert.assertEquals("2", adult);
		Thread.sleep(5000);
		Robot k = new Robot();
		k.keyPress(KeyEvent.VK_TAB);
		k.keyRelease(KeyEvent.VK_TAB);
		k.keyPress(KeyEvent.VK_TAB);
		k.keyRelease(KeyEvent.VK_TAB);
		k.keyPress(KeyEvent.VK_TAB);
		k.keyRelease(KeyEvent.VK_TAB);
		k.keyPress(KeyEvent.VK_TAB);
		k.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(7000);
		k.keyPress(KeyEvent.VK_ENTER);
		k.keyRelease(KeyEvent.VK_ENTER);
//		WebElement search = driver.findElement(By.id("id80"));
//	    l.executeScript("arguments[0].click()",search);	    
	}
	@Test
	public void Test3() throws Throwable
	{
		JavascriptExecutor n = (JavascriptExecutor)driver;
		WebElement flightSelet = driver.findElement(By.xpath("(//div[@class='fullSize flightResultRow'])[1]"));
		n.executeScript("arguments[0].click()", flightSelet);
		TakesScreenshot tk =(TakesScreenshot)driver;
		File temp = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(temp);
		File desc = new File("C:\\Users\\Jai\\eclipse-workspace\\HelveticProject\\Screenshot\\temp.flightselect.png");
		FileUtils.copyFile(temp, desc);
		WebElement next = driver.findElement(By.xpath("//a[@class='buttonStyle stepNext']"));
		n.executeScript("arguments[0].click()", next);
		Thread.sleep(7000);
		WebElement Title = driver.findElement(By.name("paxList:0:paxCode"));
		Title.click();
		Robot g = new Robot();
		g.keyPress(KeyEvent.VK_DOWN);
		g.keyRelease(KeyEvent.VK_DOWN);
		g.keyPress(KeyEvent.VK_DOWN);
		g.keyRelease(KeyEvent.VK_DOWN);
		g.keyPress(KeyEvent.VK_ENTER);
		g.keyRelease(KeyEvent.VK_ENTER);		
	}
	@Test
	public void Test4() throws Throwable
	{
		WebElement frstName = driver.findElement(By.xpath("//input[@placeholder='First name']"));
		frstName.sendKeys("Jai");
		String name = frstName.getAttribute("value");
		Assert.assertEquals("Jai", name);
		WebElement lastName = driver.findElement(By.xpath("(//input[@placeholder='Last name'])[1]"));
		lastName.sendKeys("G");
		String name1 = lastName.getAttribute("value");
		Assert.assertEquals("G", name1);
		Thread.sleep(5000);
		WebElement Title1 = driver.findElement(By.name("paxList:1:paxCode"));
		Title1.click();
		Robot y = new Robot();
		y.keyPress(KeyEvent.VK_DOWN);
		y.keyRelease(KeyEvent.VK_DOWN);
		y.keyPress(KeyEvent.VK_DOWN);
		y.keyRelease(KeyEvent.VK_DOWN);
		y.keyPress(KeyEvent.VK_ENTER);
		y.keyRelease(KeyEvent.VK_ENTER);
	}
	@Test
	public void Test5() throws IOException
	{
		WebElement fstName = driver.findElement(By.xpath("(//input[@placeholder='First name'])[2]"));
		fstName.sendKeys("Kumar");
		String name21 = fstName.getAttribute("value");
		Assert.assertEquals("Kumar", name21);
		WebElement lstname = driver.findElement(By.xpath("(//input[@placeholder='Last name'])[2]"));
		lstname.sendKeys("J");
		String name22 = lstname.getAttribute("value");
		Assert.assertEquals("J", name22);
		TakesScreenshot tk =(TakesScreenshot)driver;
		File temp = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(temp);
		File desc = new File("C:\\Users\\Jai\\eclipse-workspace\\HelveticProject\\Screenshot\\temp.passdetails.png");
		FileUtils.copyFile(temp, desc);
		WebElement next2 = driver.findElement(By.xpath("//a[@class='buttonStyle stepNext']"));
		next2.click();
		WebElement guest = driver.findElement(By.xpath("//a[text()='Continue as guest']"));
		guest.click();
	}
	@Test
	public void Test6() throws Throwable
	{
		WebElement titles = driver.findElement(By.xpath("//select[@placeholder='Title']"));
		titles.click();
		Robot z = new Robot();
		z.keyPress(KeyEvent.VK_DOWN);
		z.keyRelease(KeyEvent.VK_DOWN);
		z.keyPress(KeyEvent.VK_DOWN);
		z.keyRelease(KeyEvent.VK_DOWN);
		z.keyPress(KeyEvent.VK_DOWN);
		z.keyRelease(KeyEvent.VK_DOWN);
		z.keyPress(KeyEvent.VK_ENTER);
		z.keyRelease(KeyEvent.VK_ENTER);
		WebElement fstName1 = driver.findElement(By.xpath("//input[@placeholder='First name']"));
		fstName1.sendKeys("JAI");
		String name31 = fstName1.getAttribute("value");
		Assert.assertEquals("JAI", name31);
		WebElement lstname1 = driver.findElement(By.xpath("//input[@placeholder='Last name']"));
		lstname1.sendKeys("G");
		String name32 = lstname1.getAttribute("value");
		Assert.assertEquals("G", name32);
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='E-mail address']"));
		email.sendKeys("jaimca457@gmail.com");
		String name33 = email.getAttribute("value");
		Assert.assertEquals("jaimca457@gmail.com", name33);
		WebElement company = driver.findElement(By.xpath("//input[@placeholder='Company']"));
		company.sendKeys("cts");
		String name37 = company.getAttribute("value");
		Assert.assertEquals("cts", name37);		
		WebElement address = driver.findElement(By.xpath("//input[@placeholder='Address']"));
		address.sendKeys("Romont");
		String name34 = address.getAttribute("value");
		Assert.assertEquals("Romont", name34);
		WebElement zip = driver.findElement(By.xpath("//input[@placeholder='Zip, City']"));
		zip.sendKeys("16xx,Bulle");
//		String name35 = zip.getAttribute("value");
//		Assert.assertEquals("16xx,Bulle", name35);
		driver.findElement(By.name("contactPanel:countryCode:countryCode")).click();
		z.keyPress(KeyEvent.VK_DOWN);
		z.keyRelease(KeyEvent.VK_DOWN);
		z.keyPress(KeyEvent.VK_ENTER);
		z.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.name("contactPanel:languageCode")).click();
		z.keyPress(KeyEvent.VK_DOWN);
		z.keyRelease(KeyEvent.VK_DOWN);
		z.keyPress(KeyEvent.VK_DOWN);
		z.keyRelease(KeyEvent.VK_DOWN);
		z.keyPress(KeyEvent.VK_ENTER);
		z.keyRelease(KeyEvent.VK_ENTER);
		WebElement phone = driver.findElement(By.xpath("//input[@placeholder='Mobile phone']"));
		phone.sendKeys("9941638355");
		String name36 = phone.getAttribute("value");
		Assert.assertEquals("9941638355", name36);
		z.keyPress(KeyEvent.VK_TAB);
		z.keyRelease(KeyEvent.VK_TAB);
		z.keyPress(KeyEvent.VK_TAB);
		z.keyRelease(KeyEvent.VK_TAB);
		TakesScreenshot tk =(TakesScreenshot)driver;
		File temp = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(temp);
		File desc = new File("C:\\Users\\Jai\\eclipse-workspace\\HelveticProject\\Screenshot\\temp.guest.png");
		FileUtils.copyFile(temp, desc);
		WebElement next4 = driver.findElement(By.xpath("//a[@class='buttonStyle stepNext']"));
		next4.click();	
	}
	@Test
	public void Test7() throws Throwable
	{
		driver.findElement(By.xpath("(//a[@class='buttonStyle reservationBlockOpener'])[1]")).click();
//		Thread.sleep(7000);
		driver.findElement(By.xpath("(//span[@data-seatnumber='8'])[1]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//span[@data-seatnumber='8'])[2]")).click();
		Thread.sleep(7000);
		WebElement terms = driver.findElement(By.xpath("//div[@class='checkboxStyle floatLeft']"));
		terms.click();
		Thread.sleep(7000);
//		JavascriptExecutor p = (JavascriptExecutor)driver;
//		WebElement baggage = driver.findElement(By.xpath("(//a[@class='buttonStyle reservationBlockOpener'])[1]"));
//		p.executeScript("arguments[0].click()", baggage);
//		WebElement first = driver.findElement(By.xpath("(//div[@class='fullSize fontSmaller90 passengerRow increaseFreeB'])[1]"));
//		p.executeScript("arguments[0].click()", first);
//		WebElement second = driver.findElement(By.xpath("(//a[@class='buttonStyle reservationBlockOpener'])[1]"));
//		p.executeScript("arguments[0].click()", second);
//		WebElement third = driver.findElement(By.xpath("(//div[@class='fullSize fontSmaller90 passengerRow increaseFreeB'])[5]"));
//		p.executeScript("arguments[0].click()", third);
//		WebElement four = driver.findElement(By.xpath("(//a[@class='buttonStyle reservationBlockOpener'])[3]"));
//		p.executeScript("arguments[0].click()", four);
//		Thread.sleep(7000);
//		WebElement five = driver.findElement(By.xpath("(//div[@class='fullSize fontSmaller90 passengerRow'])[1]"));		
//		p.executeScript("arguments[0].click()", five);
//		WebElement six = driver.findElement(By.xpath("(//a[@class='buttonStyle reservationBlockOpener'])[2]"));
//		p.executeScript("arguments[0].click()", six);
//		WebElement seven = driver.findElement(By.xpath("//div[@class='fullSize fontSmaller90 passengerRow booked']"));
//		p.executeScript("arguments[0].click()", seven);
////		Thread.sleep(7000);
//		WebElement eig = driver.findElement(By.xpath("(//a[@class='buttonStyle reservationBlockOpener'])[3]"));
//		p.executeScript("arguments[0].click()", eig);
//		WebElement nine = driver.findElement(By.xpath("//div[@class='fullSize fontSmaller90 passengerRow booked']"));
//		p.executeScript("arguments[0].click()", nine);
//		WebElement ten = driver.findElement(By.xpath("(//div[@class='checkboxStyle floatLeft'])[2]"));
//		p.executeScript("arguments[0].click()", ten);
		TakesScreenshot tk =(TakesScreenshot)driver;
		File temp = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(temp);
		File desc = new File("C:\\Users\\Jai\\eclipse-workspace\\HelveticProject\\Screenshot\\temp.reserveticket.png");
		FileUtils.copyFile(temp, desc);
		WebElement button = driver.findElement(By.xpath("//a[@class='buttonStyle stepNext']"));
		button.click();
	}
	@Test
	public void Test8() throws Throwable
	{
		driver.findElement(By.name("paymentInfoPanel:paymentMethod")).click();
		Robot b = new Robot();
		b.keyPress(KeyEvent.VK_DOWN);
		b.keyRelease(KeyEvent.VK_DOWN);
		b.keyPress(KeyEvent.VK_DOWN);
		b.keyRelease(KeyEvent.VK_DOWN);
		b.keyPress(KeyEvent.VK_DOWN);
		b.keyRelease(KeyEvent.VK_DOWN);
		b.keyPress(KeyEvent.VK_ENTER);
		b.keyRelease(KeyEvent.VK_ENTER);
		b.keyPress(KeyEvent.VK_TAB);
		b.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(7000);
		JavascriptExecutor o = (JavascriptExecutor)driver;
		WebElement condition = driver.findElement(By.xpath("//input[@type='checkbox']"));
		o.executeScript("arguments[0].click()", condition);
		TakesScreenshot tk =(TakesScreenshot)driver;
		File temp = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(temp);
		File desc = new File("C:\\Users\\Jai\\eclipse-workspace\\HelveticProject\\Screenshot\\temp.payment.png");
		FileUtils.copyFile(temp, desc);	
		WebElement sumbit = driver.findElement(By.xpath("//a[@class='buttonStyle stepNext']"));
		o.executeScript("arguments[0].click()", sumbit);
		TakesScreenshot tks =(TakesScreenshot)driver;
		File temp1 = tks.getScreenshotAs(OutputType.FILE);
		System.out.println(temp);
		File descn = new File("C:\\Users\\Jai\\eclipse-workspace\\HelveticProject\\Screenshot\\temp.card.png");
		FileUtils.copyFile(temp1, descn);
		
		WebElement total = driver.findElement(By.xpath("//span[text()='391.00']"));
		String text = total.getText();
//		Assert.assertEquals("verify total cost", "391.00", text);
		
		WriteExcel.printTotalCost("391.00"+text);
	}
	@AfterClass
	public static void quit()
	{
		driver.quit();
	}
}

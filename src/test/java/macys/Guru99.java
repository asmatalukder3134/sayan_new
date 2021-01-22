package macys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Guru99 {
	WebDriver dr;
	@Test
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asmat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("http://demo.guru99.com/Agile_Project/Agi_V1/");
		String title=dr.getTitle();
		System.out.println("title is:"+title);
		
		dr.findElement(By.name("uid")).sendKeys("Asma");
		dr.findElement(By.name("password")).sendKeys("123");
		dr.findElement(By.xpath("//input[@type=\'submit\']")).click();
		
	}

}

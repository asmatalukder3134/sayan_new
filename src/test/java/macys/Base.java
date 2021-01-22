package macys;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Base {
	 WebDriver dr;

	@BeforeSuite
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asmat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("https://www.macys.com/");
		//String title = dr.getTitle();
		//System.out.println("current page title is:" + "" + title);
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Log logy=new Log();
		logy.logger();
		Logger log=logy.log;
		log.fatal("base fatal is ok");
		log.info("base info method is ok");
		
}}
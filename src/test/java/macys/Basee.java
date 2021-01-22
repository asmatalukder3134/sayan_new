package macys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Basee {
	final String uname="as";
	static String pasword;
	WebDriver dr;
	public int login() {
		String uname="Asma";
		String pasword="123";
		dr.findElement(By.id("")).sendKeys(uname);
		System.out.println();
		dr.findElement(By.id("")).sendKeys(pasword);
		return 100;
		
	}

}

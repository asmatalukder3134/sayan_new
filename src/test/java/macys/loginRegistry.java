package macys;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class loginRegistry {
	WebDriver dr;
	loginRegistry(WebDriver dr){
		this.dr=dr;
	}
	
public void loginregistry(){
	Log log=new Log();
	log.logger();
	Logger logy=log.log;
	dr.findElement(By.id("email")).sendKeys("sayan@nycstudents.net");
	logy.info("email is ok");
	
	dr.findElement(By.id("pw-input")).sendKeys("sayan2016");
	logy.info("sendKeys is ok");
	dr.findElement(By.id("stay-signedin")).click();
	dr.findElement(By.id("sign-in")).click();
	
}
	

}

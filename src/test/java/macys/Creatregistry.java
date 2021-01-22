package macys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Creatregistry {
	WebDriver dr;
	Creatregistry(WebDriver dr){
		this.dr=dr;
	}
	
public loginRegistry creatRegistry() {
	dr.findElement(By.xpath("href=\'/wgl/registry/signin?cm_sp=navigation-_-top_nav-_-create_registry&lid=glbtopnav_create_registry-reg\'")).click();
	return new loginRegistry(dr);
}
}

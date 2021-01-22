package macys;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Home {
	WebDriver dr;

	Home(WebDriver dr) {
		this.dr = dr;
	}
    
	public Creatregistry click_registry() {
		dr.findElement(By.xpath("href=\'/social/registry-top-reasons/?cm_sp=navigation-_-top_nav-_-wedding_registry&lid=glbtopnav_wedding_registry-us\'")).click();
		return new Creatregistry(dr);

	}

}

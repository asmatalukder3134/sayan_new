package macys;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MM implements K {
	WebDriver dr;

	public void login(String common) {
		List<WebElement> ele = dr.findElements(By.xpath(""));
		ele.get(1).click();
		
		
		
		
		// or
		Iterator it = ele.iterator();
		it.hasNext();
		it.next();
		
		
		
		
		
		
		// or
		for (WebElement we : ele) {
			String text = we.getText();
			if (text.contains("sharee")) {
				we.click();
				System.out.println("sharee have");
			} else {
				System.out.println("no sharee");
			}
		}
		
		
		
		
		
		
		
		// or
		for (int i = 0; i < ele.size(); i++) {
			String text = ele.get(i).getText();
			if (text.contains("s")) {
				ele.get(i).click();
				System.out.println("element found");
			} else {
				System.out.println("element not found");

			}
		}
	}

}

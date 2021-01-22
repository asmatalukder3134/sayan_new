package macys;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class NotePad {
	File f=new File("C:\\Users\\asmat\\eclipse-workspace\\macys\\src\\test\\resources"
			+ "\\com");
	File ff=new File(f,"\\shamim.properties");
	@Test
	public String getPropety() throws IOException, InterruptedException {
	//System.out.println(System.getProperty("user.dir"));
	FileInputStream f=new FileInputStream(ff.getAbsolutePath());
	
		//FileInputStream f=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\com\\asma.properties");
		Properties pro=new Properties();
		pro.load(f);
	String name=pro.getProperty("userName");
	Thread.sleep(3000);
	System.out.println(name);
	return name;
		//C:\Users\asmat\eclipse-workspace\macys\src\test\resources\com\asma.properties
	}

}

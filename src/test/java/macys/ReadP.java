package macys;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadP {
	@Test
	public String readProperty(String name ,String p) throws IOException {
		File f = new File( "C:\\Users\\asmat\\eclipse-workspace\\macys\\src\\test\\resources"+ "\\com");
		File f2=new File(f,"\\sweety.properties");
		FileInputStream fis = new FileInputStream(f2.getAbsolutePath());
		Properties prop = new Properties();
		prop.load(fis);
		String uname = prop.getProperty("userName");
		String pw=prop.getProperty("passWord");
		System.out.println("user name is:" + " " + uname);
		System.out.println("password is:" + " " + pw);
		return readProperty(name, p);

	}

}

package macys;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SqlConnection extends NotePad {
	WebDriver dr;
	String name;
	
	
	void sqlConnector() throws SQLException, IOException, InterruptedException  {
		Connection connect=DriverManager.getConnection("url", "un", "pw");
		Statement state=connect.createStatement();
		ResultSet rs=state.executeQuery("select * table name");
		rs.next();
		
	
		//int i=rs.getInt(1);
	String city=rs.getString("cityName");
	if(city.contains("dhaka")) {
		String myCity=rs.getString("cityName");
	String city1=myCity.concat("Bangladesh");
	
 name=getPropety();
	
		Assert.assertEquals(city1, name);
		{
			System.out.println("this is pass i hope");
		}
		XlSheets x=new XlSheets();
	String a=x.readExcel(2, 1);
	
		
	
		


		
		
	}

}}

package macys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;

public class DataBase extends  Xll {
	
	String value;
	public void getData() throws Throwable {
		Connection connect = DriverManager.getConnection("url", "un", "pw");
		Statement statement = connect.createStatement();
		ResultSet rs = statement.executeQuery("select * from table");
		rs.next();

		String s = rs.getString("city");
		String s1 = rs.getString("country");
		if (s.contains("dhaka")) {
			System.out.println("dhaka is here");

		}
		String x=collect_data_xl(1, 1);
		Assert.assertEquals(s, x);
		{
			System.out.println("both data are equal");
		}
		ReadP rp= new ReadP();
		String read=rp.readProperty("uname", "pw");
	}

}

package macys;

import org.testng.annotations.Test;

public class Examin {
	@Test
	public void test() {
		UU u=new UU();
		String common="abc";
		u.login(common);
		u.click();
	}

}

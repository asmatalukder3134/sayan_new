package macys;

import org.testng.annotations.Test;

public class TestAll extends Base {
	@Test
	public void testloginRegistry(){
	Home home=new Home(dr);
	home.click_registry();
	Creatregistry registry=new Creatregistry(dr);
	registry.creatRegistry();
	loginRegistry login=new loginRegistry(dr);
	login.loginregistry();
	
	

}
}
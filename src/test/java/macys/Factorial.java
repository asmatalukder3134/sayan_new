package macys;

import org.testng.annotations.Test;

public class Factorial {
	@Test
	public void factorial() {
		int i, fact = 1;
		int x = 5;
		for (i = 1; i<= x; i++) {
			fact = fact * i;

		}
		System.out.println("factorial no is:" + fact);

	}

}

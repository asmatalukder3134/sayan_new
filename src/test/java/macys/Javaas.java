package macys;

import org.testng.annotations.Test;

public class Javaas {
	public static void main(String[] args) {
		int array[] = { 44, 66, 77, 88, 102, 33, 70 };
		int max = array[0];
		int secondmax = array[0];
		for (int a : array) {
			if (a > max) {
				secondmax = max;
				max = a;
			} else if (a > secondmax) {
				secondmax = a;

			}
		}
		System.out.println("max is:" + max);
		System.out.println("secondmax is:" + secondmax);
	}

	@Test
	public void factorial() {
		int i,fact = 1;
		int x = 9;
		for ( i = 0; i <=x; i++) {
			fact = fact * i;

		}
		System.out.println("factorial no is:" + fact);
		
	}
}

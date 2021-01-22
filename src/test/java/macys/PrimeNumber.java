package macys;

import org.testng.annotations.Test;

public class PrimeNumber {
@Test
	public static void main(String[] args) {
		int x = 5;
		int count = 0;
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				count++;
				break;

			}
		}

		if (count == 0) {
			System.out.println("its prime");

		} else {
			System.out.println("not");
		}
	}

}

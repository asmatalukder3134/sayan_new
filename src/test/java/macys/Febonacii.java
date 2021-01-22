package macys;

public class Febonacii {

	public static void main(String[] args) {
		int febo1 = 1, febo2 = 1, febonaci = 1;
		int x = 6;
		for (int i = 1; i <= x; i++) {
			febonaci = febo1 + febo2;
			febo1 = febo2;
			febo2 = febonaci;
		}
		System.out.println("febonaci no is :" + febonaci);
	}

}

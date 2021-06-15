package pp06_05_21;

public class zadatak5 {

	public static void main(String[] args) {

//		5.Zadatak
//		Napisati metodu koja stampa sve brojeve izmeju M i N. M i N su parametri metode.
//		Ako se za M unese 2 a za N 6, stampa se:
//		2, 3, 4, 5, 6

		sviParni(2, 10);

	}

	public static void sviParni(int m, int n) {
		for (int i = m; i <= n; i++) {
				System.out.println(i);
		}
	}

}

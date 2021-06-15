package pp06_05_21;

public class zadatak2 {

	public static void main(String[] args) {
		
//		2.Zadatak
//		Napisati metodu stampajApsolutnuVrednost,
//		koja stampa apsolutnu vrednost prosledjene vrednosti.

		stampajApsolutnuVrednost(-1);
		stampajApsolutnuVrednost(2);
		stampajApsolutnuVrednost(-3);
		
	}

	public static void stampajApsolutnuVrednost(int a) {
		if (a < 0) {
			a = -a;
		} 
		System.out.println("Apsolutna vrednost je :" + a);
	}
	
}

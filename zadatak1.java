package pp06_05_21;

public class zadatak1 {

	public static void main(String[] args) {
		
//		1.Zadatak
//		Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
//		Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

		stampajVrednostZa10Vecu(10);
		stampajVrednostZa10Vecu(2);
		stampajVrednostZa10Vecu(4);

	}

	public static void stampajVrednostZa10Vecu(int a) {
		a = a + 10;
		System.out.println("Vrednost A je :" + a);
	}
	
}

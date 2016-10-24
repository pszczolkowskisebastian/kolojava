import java.sql.Array;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] tab = new int[2];
		int[] tab2 = { 1, 2, 3, 4, 5 };
		int[] tabPusta = new int[0];

		// int suma = tab2[0] + tab2[1] + tab2[2] + tab2[3] + tab2[3] + tab2[4]
		// + tab2[5];
		int nowaSuma = 0;

		for (int i = 0; i < tab2.length; i++) {
			nowaSuma += tab2[i];
			System.out.println("Powiekszona nowa suma: " + nowaSuma);
		}

		// System.out.println("Suma = " + suma);
		System.out.println("Nowa suma = " + nowaSuma);

		int nowaSumaAleOdwrotnie = 0;
		for (int i = tab2.length - 1; i >= 0; i--) {
			nowaSumaAleOdwrotnie += tab2[i];
		}

		System.out.println("nowaSumaAleOdwrotnie: " + nowaSumaAleOdwrotnie);

		int sumaForEach = 0;
		// ELEMNET W TEJ CHWILI ITEROWANY : TO CO ITERUJEMY
		for (int element : tab2) {
			sumaForEach += element;
		}

		System.out.println("sumaForEach = " + sumaForEach);

		int sumaWhile = 0;
		int i = 0;
		while (i < tab2.length) {
			sumaWhile += tab2[i];
			i++;
			System.out.println("COS");
		}

		//Array.sort(liczby);

		//System.out.println(Arrays.toString(liczby));

		String[] tabString = {};

		boolean[][] macierz = new boolean[2][2];

		int[][] macierz2 = { { 1, 2 }, { 3, 4 } };
		
		/**
		 * 1    2
		 * 
		 * 3    4
		 */

		for (int k = 0; k < macierz2.length; k++) {
			for (int n = 0; n < macierz2[k].length; n++) {
				System.out.println("["+k+"]"+"["+n+"] = " + macierz2[k][n] );
			}
		}

		int[] stoIntow = new int[100];
		
		System.out.println(Arrays.toString(stoIntow));
		Arrays.fill(stoIntow, 55);
		System.out.println(Arrays.toString(stoIntow));
		
		int[] rok = {2, 0, 1, 4};
		System.out.println(Arrays.toString(rok));
		rok[3] = 6;
		System.out.println(Arrays.toString(rok));
		
	}

}

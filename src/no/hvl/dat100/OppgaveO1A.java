package no.hvl.dat100;

import java.util.Arrays;

public class OppgaveO1A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tabell[] = { 0, 1, 2, 3, 4, 5 };
		int tab2[] = { 42, 67, 89 };
		int tab1[] = { 20, 23, 62 };
		skrivUt(tabell);
		System.out.println(tilStreng(tab2));
		System.out.println(summer(tab2));
		System.out.println(finnesTall(tabell, 3));
		System.out.println(finnesTall(tabell, 7));
		System.out.println(posisjonTall(tabell, 7));
		System.out.println(posisjonTall(tabell, 4));
		skrivUt(reverser(tab2));
		System.out.println(erSortert(tab2));
		skrivUt(settSammen(tab2,tab1));
	}

	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
		}

	}

	public static String tilStreng(int[] tabell) {

		String t = "[";

		for (int i = 0; i < tabell.length - 1; i++) {
			t += tabell[i] + ",";
		}
		t += tabell[tabell.length - 1] + "]";
		return t;
	}

	public static int summer(int[] tabell) {

		int s = 0;

		// for loop
//		for (int i = 0; i < tabell.length; i++) {
//			s = s + tabell[i];
//		}

		// while loop
//		int j = 0;
//		while (j<tabell.length) {
//			s = s + tabell[j];
//			j++;
//		}

		// utvidet for loop
		for (int i : tabell) {
			s = s + i;
		}
		return s;
	}

	public static boolean finnesTall(int[] tabell, int tall) {

		boolean f = false;
		for (int i = 0; i < tabell.length; i++) {
			if (tall == tabell[i]) {
				f = true;
			}
		}
		return f;
	}

	public static int posisjonTall(int[] tabell, int tall) {
		int p = -1;
		for (int i = 0; i < tabell.length; i++) {
			if (tall == tabell[i])
				p = tabell[i];
		}
		return p;
	}

	public static int[] reverser(int[] tabell) {

		int[] r = Arrays.copyOf(tabell, tabell.length);
		for (int i = tabell.length - 1; i >= 0; i--) {
			r[tabell.length - i - 1] = tabell[i];
		}
		return r;
	}

	public static boolean erSortert(int[] tabell) {

		boolean s = true;

		int i = 0;
		while (s && i < tabell.length - 1) {
			if (tabell[i] > tabell[i + 1]) {
				s = false;
			}
			i++;
		}
		return s;
	}
	public static int[] settSammen(int[] tabell1, int[]tabell2) {
		
	int[] t = Arrays.copyOf(tabell1, tabell1.length+tabell2.length);	
		for (int i = tabell1.length;i <t.length; i++) {
			t[i] += tabell2[i-tabell1.length];
		}
		return t;
	}
}

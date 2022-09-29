package no.hvl.dat100;

public class OppgaveO1B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] tabell = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] tabell2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 10 } };
		
		skrivUtv1(tabell);
		System.out.println(tilStreng(tabell));
		skrivUtv1(skaler(2,tabell));
		System.out.println(erLik(tabell, tabell2));
	}
	
	public static void skrivUtv1(int[][] matrise) {

		for (int i = 0; i < matrise.length; i++) {
			System.out.println("Collum " + (i + 1));
			for (int j = 0; j < matrise[i].length; j++) {
				System.out.print(matrise[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

	public static String tilStreng(int[][] matrise) {

		String s = "";
		for (int i = 0; i < matrise.length; i++) {

			for (int j = 0; j < matrise[i].length; j++) {
				s = s + matrise[i][j] + " ";
			}
			s = s + "\n";
		}
		return s;
	}
	public static int[][] skaler(int tall, int[][] matrise){
		
		int[][] output = new int [matrise.length][matrise[0].length];
		for (int i = 0; i < matrise.length; i++) {

			for (int j = 0; j < matrise[i].length; j++) {
				output[i][j] = matrise[i][j]* tall;
			}
			
		}
		return output;
	}
	public static boolean erLik(int[][] mat1, int[][] mat2) {
		
		boolean l = false;
		if(mat1 == mat2) {
			l = true;
		}
		return l;
	}
	//Ikke gjort e og f
}

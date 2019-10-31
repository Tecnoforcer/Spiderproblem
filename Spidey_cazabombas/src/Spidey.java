import java.util.Scanner;

public class Spidey {

	public static void separarNumeros(String vCasos[], int casos, String mNumeroString[][]) {
		for (int i = 0; i < vCasos.length; i++) {
			String partes[] = vCasos[i].split(" ");
			mNumeroString[i][0] = partes[0];
			mNumeroString[i][1] = partes[1];
			mNumeroString[i][2] = partes[2];
		}
	}
	public static void convertrirNumero(String mNumeroString[][], int mNumeros[][]) {
		for (int i = 0; i < mNumeros.length; i++) {
			mNumeros[i][0] = Integer.parseInt(mNumeroString[i][0]);
			mNumeros[i][1] = Integer.parseInt(mNumeroString[i][1]);
			mNumeros[i][2] = Integer.parseInt(mNumeroString[i][2]);
		}
	}
	public static int diferencia(int mNumeros[][], int i) {
		int difer = 0;
		int difer1 = 0;
		int difer2 = 0;
		
		difer1 = (Math.abs(mNumeros[i][0] - mNumeros[i][1]) + Math.abs(mNumeros[i][1] - mNumeros[i][2]));
		difer2 = (Math.abs(mNumeros[i][0] - mNumeros[i][2]) + Math.abs(mNumeros[i][2] - mNumeros[i][1]));
		
		if (difer1 < difer2) {
			difer = difer1;
		}else {
			difer = difer2;
		}
		return difer;
	}
	public static void main(String[] args) {
		Scanner leerCaso = new Scanner(System.in);
		Scanner leer = new Scanner(System.in);
		
		System.out.println("numero de casos");
		int casos = leerCaso.nextInt();
		String vCasos[] = new String[casos];
		int mNumeros[][] = new int[casos][3];
		String mNumeroString [][]= new String[casos][3];
		
		for (int i = 0; i < vCasos.length; i++) {

			vCasos[i] = leer.nextLine();
		}
		separarNumeros(vCasos, casos, mNumeroString);
		convertrirNumero(mNumeroString, mNumeros);
		for (int i = 0; i < casos; i++) {
			System.out.println(diferencia(mNumeros, i));
		}
	}
}

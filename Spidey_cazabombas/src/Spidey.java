import java.util.Scanner;

public class Spidey {

	public static void main(String[] args) {
		Scanner leerCaso = new Scanner(System.in);
		Scanner leer = new Scanner(System.in);
		
		System.out.println("numero de casos");
		int casos = leerCaso.nextInt();
		String vCasos[] = new String[casos];
		for (int i = 0; i < vCasos.length; i++) {
			System.out.println("escribe posiciones");
			vCasos[i] = leer.nextLine();
		}
		
		
		
		
	}

}

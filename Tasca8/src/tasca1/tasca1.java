package tasca1;
import java.util.Scanner;

public class tasca1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[5];

			for (int i = 0; i < 5; i++) {
		            System.out.print("Introdueix el nombre " + (i + 1) + ": ");
		            numeros[i] = scanner.nextInt();
		        }

		        System.out.println("Nombres en ordre invers:");
		        for (int i = 4; i >= 0; i--) {
		            System.out.println(numeros[i]);
		        }
		        
		    scanner.close();
	    }
	}
package tasca5;
import java.util.Random;
import java.util.Scanner;

public class Tasca5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random ran = new Random();
	
		
		System.out.println("Especifica la longitud de la matriu [2 - 100]: ");
		int l = in.nextInt();
		
		int[] m = new int[l];
		
		System.out.print("Matriu generada: [ ");
        for (int i = 0; i < m.length - 1; i++) {
            System.out.print(m[i] + ",");
        	
    	}
            System.out.println(m[m.length - 1] + "]");
		int parells = 0;
		int senars = 0;

		for (int i = 0; i < l; i++) {
			m[i] = ran.nextInt(100);
			if (m[i] % 2 == 0) {
				parells++;
			} else {
				senars++;
			}
					
		}		int[] vS = new int [senars];
		int[] vP = new int [parells];
		System.out.print("Numeros Parells: [ ");
        for (int i = 0; i < vP.length - 1; i++) {
            System.out.print(m[i] + ",");
        	
    	}
            System.out.println(m[m.length - 1] + "]");
    		
            System.out.print("Numeros senars: [ ");
            for (int i = 0; i < vS.length - 1; i++) {
                System.out.print(m[i] + ",");
            	
        	}
                System.out.println(m[m.length - 1] + "]");
	}
	
	

}


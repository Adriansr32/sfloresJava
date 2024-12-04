package tasca3;
import java.util.Scanner;
public class Tasca3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Introdueix un numero: ");
		int n = in.nextInt();
		System.out.println("la longitud de la matriu es: " + n );
		int[] m = new int[n];
		int[] m2 = new int [n];
		
		System.out.println("Introdueix un numero per omplir la matriu: ");
        for (int i = 0; i < n - 1; i++) {
        	System.out.print((i + 1) + "."  + " Numeros: ");
            m[i] = in.nextInt();
            
        }
        for (int i = 0; i < m.length - 1; i++) {
        System.out.print(m[i] + ",");
        
    	
	}
        System.out.println(m[n - 1]);
        System.out.print("Dime una numero: "); 
       	int num = in.nextInt(); 
        
        System.out.print("Dime una posicion (0 - " + (n - 1) + "): ");
        int pos = in.nextInt();
        
        for (int i = 0; i < n; i++) {
        	if (i < pos) {
        		m2[i] = m[i]; 
        	}
        	else if (i == pos) {
        		m2[i] = num;
        	}
        	else {
        		m2[i] = m[i - 1];
        	}
        }
        System.out.print("[");
        for (int i = 0; i < m2.length - 1; i++) {
        	System.out.print(m2[i] + ",");
        }
        System.out.print(m2[m2.length - 1] + "]");
	}
}
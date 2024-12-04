package tasca4;
import java.util.Scanner;
public class tasca4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Introdueix un numero: ");
		int n = in.nextInt();
		int[] m = new int[n];
		int parell = 0;
		int senar = 0;
		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + "." + "Numeros: ");
			m[i] = in.nextInt();
			if (m[i] % 2 == 0) {
			parell++;
			}else {
			senar++;
			}
			}
	
			int[] vS = new int [senar];
			int[] vP = new int [parell];
			int indexP = 0; 
	        int indexS = 0; 
	        for (int i = 0; i < m.length; i++) {
	        	if (m[i] % 2 == 0) {
	        		vP[indexP++] = m[i]; 
	        	} else {
	        		vS[indexS++] = m[i];
	        	}
	        }			
	        System.out.println("---------Numeros Parells---------");
	        System.out.print("[");
			for (int i = 0; i < vP.length - 1; i++) {
				System.out.print(vP[i] + ",");
				}
			System.out.println(vP[vP.length - 1] + "]");
			
			System.out.println("--------- Numeros Senars ---------");
			System.out.print("[");
			for (int i = 0; i < vS.length - 1; i++) {
				System.out.print(vS[i] + ",");
			}
			System.out.println(vS[vS.length - 1] + "]");
		    in.close();
			}	

}
package Tasca8b;
import java.util.Random;

public class Ex2_8b {
    public static void main(String[] args) {
        int[][] matriu = new int[10][10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriu[i][j] = random.nextInt(10);
            }
        }

        int[] fila1 = new int[10];
        int[] suma = new int[10];
        for (int i = 0; i < 10; i++) {
            int fila2 = 0;
            for (int j = 0; j < 10; j++) {
                System.out.printf("%3d", matriu[i][j]);
                fila2 += matriu[i][j];
                suma[j] += matriu[i][j];
            }
            fila1[i] = fila2;
            System.out.println(" | " + fila2);
        }

        System.out.println("-------------------------------+");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%3d", suma[i]);
        }
    }
}
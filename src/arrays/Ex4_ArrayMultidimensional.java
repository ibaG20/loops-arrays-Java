package arrays;

import java.util.Random;

/*
 * Gere e imprima uma matriz 4x4 com valores
 * aleatórios entre 0-9.
 */

public class Ex4_ArrayMultidimensional {
	public static void main (String[] args) {
		Random random = new Random ();
		
		int[][] matriz = new int[4][4];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matriz[i][j] = random.nextInt(9);
			}
		}
		
		System.out.println ("Valores aleatorios...");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print (matriz[i][j] + " ");
			}
			System.out.print ("\n");
		}
		
	}
}

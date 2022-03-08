package arrays;

import java.util.Scanner;

/*
 * Crie um vetor de 6 números inteiros 
 * e mostre-os na ordem inversa.
 */

public class Ex1_OrdemInversa {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		
//		int[] vetor = {1, 2, 3, 4, 5, 6};
		int[] vetor = new int[6];
		
		System.out.println ("Digite os 6 elementos do vetor:");
		for (int i = 0; i < 6; i++) {
			vetor[i] = scan.nextInt();
		}

		System.out.println ("\nAqui está o vetor ao contrario:");
		for (int i = vetor.length - 1; i >= 0 ; i--) {
			System.out.print (vetor[i] + " ");
		}
	}

}

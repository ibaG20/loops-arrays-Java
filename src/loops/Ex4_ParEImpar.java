package loops;

import java.util.Scanner;

/*
 Fa�a um programa que pe�a N n�meros inteiros,
 calcule e mostre a quantidade de n�meros pares
 e a quantidade de n�meros �mpares.
 */

public class Ex4_ParEImpar {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int numero, qnt;
		int somaPar = 0, somaImpar = 0;
		
		System.out.println("Quantos n�meros ser�o analizados?");
		qnt = scan.nextInt();
		
		System.out.println ("Digite " + qnt + " n�meros:");
		for (int i = 0; i < qnt; i++) {
			numero = scan.nextInt();
			if (numero % 2 == 0) {
				somaPar++;
			}else {
				somaImpar++;
			}
		}
		
		System.out.println ("N. pares: " + somaPar);
		System.out.println ("N. impares: " + somaImpar);
	}

}

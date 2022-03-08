package loops;

import java.util.Scanner;

/*
 Faça um programa que peça N números inteiros,
 calcule e mostre a quantidade de números pares
 e a quantidade de números ímpares.
 */

public class Ex4_ParEImpar {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int numero, qnt;
		int somaPar = 0, somaImpar = 0;
		
		System.out.println("Quantos números serão analizados?");
		qnt = scan.nextInt();
		
		System.out.println ("Digite " + qnt + " números:");
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

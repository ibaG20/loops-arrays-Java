package loops;

import java.util.Scanner;

/*
 Fa?a um programa que leia 5 n?meros
 e informe o maior n?mero
 e a m?dia desses n?meros
 */

public class Ex3_MaiorEMedia {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int numero, maior = 0, soma = 0;
		
		System.out.println ("Digite 5 numeros: ");
		for (int i = 0; i < 5; i++) {
			numero = scan.nextInt();
			if (numero > maior) {
				maior = numero;
			}
			soma += numero;
		}
		
		System.out.println ("Maior n?mero: " + maior);
		System.out.println ("M?dia: " + soma / 4);
		
	}

}

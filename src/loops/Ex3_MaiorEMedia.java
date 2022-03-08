package loops;

import java.util.Scanner;

/*
 Faça um programa que leia 5 números
 e informe o maior número
 e a média desses números
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
		
		System.out.println ("Maior número: " + maior);
		System.out.println ("Média: " + soma / 4);
		
	}

}

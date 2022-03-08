package loops;

import java.util.Scanner;

/*
 Faça um programa que calcule o fatorial de um numero
 inteiro fornecido pelo usuário.
 */

public class Ex6_Fatorial {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int mult = 1;
		 
		System.out.print("Qual valor deve ser calculado o fatorial?");
		int valor = scan.nextInt();
		
		System.out.print(valor + "!" + "= ");
		for (int i = valor; i >= 1; i--) {
			mult *= i;
		}
		System.out.println (mult);
	}

}

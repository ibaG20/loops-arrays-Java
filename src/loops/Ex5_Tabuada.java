package loops;

import java.util.Scanner;

/*
 Desenvolva um gerador de tabuada
 capaz de gerar a tabuada de qualquer número inteiro 
 entre 1 e 10;
 O usuário deve informar de qual número ele deseja ver 
 a tabuada;
 */

public class Ex5_Tabuada {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int tab;
		
		System.out.println ("Você deseja conhecer a tabuada de qual número de 1 a 10?");
		do {
			tab = scan.nextInt();
			if (tab < 1 || tab > 10)
				System.out.println("Valor inválido, tente novamente!");
		}while(tab < 1 || tab > 10);
		
		for (int i = 1; i <= 10; i++) {
			System.out.println (tab + " X " + i + " = " + tab*i);
		}
	}

}

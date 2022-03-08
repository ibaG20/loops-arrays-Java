package loops;

import java.util.Scanner;

/*
 Faça um programa que peça uma nota entre 0 e 10.
 Mostre uma msg caso o valor seja inválido
 e continue pedindo até que o usuário informe um
 valor válido.
 */

public class Ex2_Nota {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int nota;
		
		do {
			System.out.print ("Digite o valor da nota: ");
			nota = scan.nextInt();
			if (nota < 0 || nota > 10)
				System.out.println("Valor inválido, tente novamente");
		}while(nota < 0 || nota > 10);
	}

}

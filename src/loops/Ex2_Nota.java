package loops;

import java.util.Scanner;

/*
 Fa�a um programa que pe�a uma nota entre 0 e 10.
 Mostre uma msg caso o valor seja inv�lido
 e continue pedindo at� que o usu�rio informe um
 valor v�lido.
 */

public class Ex2_Nota {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int nota;
		
		do {
			System.out.print ("Digite o valor da nota: ");
			nota = scan.nextInt();
			if (nota < 0 || nota > 10)
				System.out.println("Valor inv�lido, tente novamente");
		}while(nota < 0 || nota > 10);
	}

}

package arrays;

import java.util.Scanner;

/*
 * Faça um programa que leia um vetor de 6 caracteres
 * e diga quantas consoantes foram lidas.
 * Imprima as consoantes
 */

public class Ex2_Consoantes {

	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		
		String[] consoantes = new String[6];	
		int qntConsoantes = 0;
		
		System.out.println ("Digite as 6 letras: ");
		for (int i = 0; i < consoantes.length; i++) {
			String letra = scan.next();
			
			if(!(letra.equalsIgnoreCase ("a") ||
				 letra.equalsIgnoreCase ("e") ||
				 letra.equalsIgnoreCase ("i") ||
				 letra.equalsIgnoreCase ("o") ||
				 letra.equalsIgnoreCase ("u") )) {
				qntConsoantes++;
				consoantes[i] = letra;
			}
		}
		
		System.out.println("Consoantes: ");
		for (String consoante : consoantes) {
			if (consoante != null)
				System.out.print (consoante + " ");
		}
		System.out.println ("\nExistem " + qntConsoantes + " consoantes!");
	
	}
}

package arrays;

import java.util.Random;

/*
 * Faça um programa que leia 20 numeros inteiros 
 * aleatorios (entre 0 e 100), armazene-os num vetor
 * e ao final mostre os numeros e seus sucessores.
 */

public class Ex3_NumerosAleatorios {
	public static void main (String[] args) {
		Random random = new Random();
		
		int[] numerosAleatorios = new int[20];
		
		for (int i = 0; i < numerosAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		
		System.out.print ("Numeros aleatórios: ");
		for (int numero : numerosAleatorios) {
			System.out.print (numero + " ");
		}
		
		System.out.print ("\nSucessores dos numeros aleatórios: ");
		for (int numero : numerosAleatorios) {
			System.out.print (numero+1 + " ");
		}
	}

}

package AtividadesAula4;

import java.util.Scanner;

public class Exercicio2 {
/* Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados. */
	
	public static void main(String[] args) {
		int [] array = new int [6];
		int npar=0, nimp=0, somapar=0, contimp=0, i=0;
		Scanner leia = new Scanner (System.in);
		
		for (i=0; i<6; i++) {
			System.out.println("Digite os valores do array");
			array[i] = leia.nextInt();
		}
		
		System.out.println("\nNumeros pares: ");
		for (i=0; i<6; i++) {
			if (array[i] % 2 == 0 && array[i] != 0) {
				somapar += array[i];
				System.out.print(array[i]+ " ");
			}
		}
		System.out.println("\nNumeros impares: ");
		for (i=0;i<6;i++) {
			if (array [i] % 2 != 0) {
				contimp++;
				System.out.print(array[i]+" ");
			}
		}
		
		System.out.println("\nSoma de numeros pares: "+somapar);
		System.out.println("Quantidade de n�meros impares: "+contimp);
	}
}


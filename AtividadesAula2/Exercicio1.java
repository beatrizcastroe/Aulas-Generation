package AtividadesAula2;

import java.util.Scanner;

public class Exercicio1 {
/*Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		
		Scanner leia = new Scanner (System.in);
		System.out.printf("Escreva um numero inteiro: ");
		a = leia.nextInt();
		System.out.printf("Escreva um numero inteiro: ");
		b = leia.nextInt();
		System.out.printf("Escreva um numero inteiro: ");
		c = leia.nextInt();
		
		if (a > b && a > c)
		{
			System.out.printf("O maior n�mero � %d",a);
		}
		if (b > a && b > c)
		{
			System.out.printf("O maior n�mero � %d",b);
		}
		if (c > a && c > b)
		{
			System.out.printf("O maior numero �: %d",c);
		}
				
	}
}

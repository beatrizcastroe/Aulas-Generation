package AtividadesAula2;

import java.util.Scanner;

public class Exercicio2 {
//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int a, b, c;
		
		System.out.printf("Digite o primeiro n�mero: ");
		a = leia.nextInt();
		System.out.printf("Digite o segundo n�mero: ");
		b = leia.nextInt();
		System.out.printf("Digite o terceiro n�mero: ");
		c = leia.nextInt();
		
		if (a<b && a<c)
		{
			System.out.printf("%d - ",a);
			if (b < c)
			{
				System.out.printf("%d - %d",b,c);
			}
			else
			{
				System.out.printf("%d - %d ",c,b);
			}
		}
		if (b<a && b<c)
		{
			System.out.printf("%d - ",b);
			if (a<c)
			{
				System.out.printf("%d - %d ",a,c);
			}
			else
			{
				System.out.printf("%d  - %d ",c,a);
			}
		}
		if (c<a && c<b)
		{
			System.out.printf("%d - ",c);
			if (a<b)
			{
				System.out.printf("%d  - %d ",a,b);
			}
			else
			{
				System.out.printf("%d - %d ",b,a);
				
			}
		}
	}
}



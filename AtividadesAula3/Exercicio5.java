package AtividadesAula3;
import java.util.Scanner;

public class Exercicio5 {
	/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int i, soma=0;
		
		do 
		{
			System.out.println("DIGITE UM N�MERO DO TECLADO: ");
			i = leia.nextInt();
			
			soma = soma + i;
			
		}
		while (i != 0);
		System.out.println("Soma dos n�meros = "+soma);
	}

}

package AtividadesAula1;

import java.util.Scanner;

public class Exercicio1 {
	/*Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
	dias e mostre-a expressa apenas em dias.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float ianos, imeses, idias, dias;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Voc� tem quantos anos?: ");
		ianos= leia.nextFloat();
		System.out.println("Quantos meses?: ");
		imeses=leia.nextFloat();
		System.out.println("Quantos dias? :");
		idias=leia.nextFloat();
		
		dias = ((ianos * 365) + (imeses * 30) + idias);

		System.out.println("Voc� tem "+dias+" dias de vida.");
	}

}

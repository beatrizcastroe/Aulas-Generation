package AtividadesAula2;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/
		
		Scanner leia = new Scanner(System.in);
		double i, raiz, pow;
		
		System.out.println("Digite um n�mero qualquer: ");
		i = leia.nextDouble();
		
		if (i %2 == 0)
		{
			System.out.println("O n�mero � par");
			raiz = Math.sqrt(i);
			System.out.println("Sua raiz �: "+raiz);
		}
		else if (i %2 != 0)
		{
			System.out.println("O n�mero � impar.");
			pow = Math.pow(i, 2);
			System.out.println("Sua pot�ncia ao quadrado �: "+pow);
		}
	}
}

package AtividadesAula1;

import java.util.Scanner;

public class Exercicio5 {
	//5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
	//aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,//
	//respectivamente.//
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1,nota2,nota3,media,mp;

		Scanner leia = new Scanner (System.in);
		
		System.out.println("Escreva a nota 1: ");
		nota1 = leia.nextFloat();
		System.out.println("Escreva a nota 2: ");
		nota2 = leia.nextFloat();
		System.out.println("Escreva a nota 3: ");
		nota3 = leia.nextFloat();
		
		media = (nota1+nota2+nota3)/3;
		mp = (nota1*2+nota2*3+nota3*5)/10;
		
		System.out.println("M�dia: "+media);
		System.out.printf("\n M�dia arredondada: %2.2f", media);
		System.out.println("M�dia ponderada: "+mp);
	}

}

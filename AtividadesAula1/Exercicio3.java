package AtividadesAula1;

import java.util.Scanner;

public class Exercicio3 {

	/*Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ehoras, emin, eseg, seg;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite o tempo de dura��o do evento em segundos: ");
		seg = leia.nextInt();
		
		ehoras=(seg/3600);
				
		emin=(seg%3600)/60;

		eseg=(seg%3600)%60;
		
		System.out.println("O evento tem: "+ehoras+" horas, "+emin+" minutos e "+eseg+" segundos.");
	}

}

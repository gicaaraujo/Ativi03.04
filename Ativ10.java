package abril03;

import java.util.Scanner;

public class Ativ10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int dia;
		System.out.println("Informe o dia da semana: ");
		dia=ler.nextInt();
		
		switch (dia) {
		case 1: 
			System.out.println("O dia da semana é domingo.");
		    break;
		case 2:
			System.out.println("O dia da semana é segunda.");
		    break;
		case 3:
		    System.out.println("O dia da semana é terça.");
		    break;
		case 4:
			System.out.println("O dia da semana é quarta.");
		    break;
		case 5:
			System.out.println("O dia da semana é quinta.");
		    break;
		case 6:
			System.out.println("O dia da semana é sexta.");
		    break;
		case 7: 
			System.out.println("O dia da semana é sábado.");
		    break;
		default:
			System.out.println("O dia da semana é inválido!");	
		}
		
	
	
		
	}

}

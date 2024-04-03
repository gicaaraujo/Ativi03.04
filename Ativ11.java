package abril03;

import java.util.Scanner;

public class Ativ11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String dia;
		System.out.println("Informe o dia da semana: ");
		dia=ler.next();
		
		switch (dia) {
		case "domingo": 
			System.out.println("O dia da semana é 1.");
		    break;
		case "segunda":
			System.out.println("O dia da semana é 2.");
		    break;
		case "terça":
		    System.out.println("O dia da semana é 3.");
		    break;
		case "quarta":
			System.out.println("O dia da semana é 4.");
		    break;
		case "quinta":
			System.out.println("O dia da semana é 5.");
		    break;
		case "sexta":
			System.out.println("O dia da semana é 6.");
		    break;
		case "sábado": 
			System.out.println("O dia da semana é 7.");
		    break;
		default:
			System.out.println("O dia da semana é inválido!");	
		}     
	}

}

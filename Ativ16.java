package abril03;

import java.util.Scanner;

public class Ativ16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salario,tempo, bonus, total;
		
		System.out.println("Informe o salário: ");
		salario = ler.nextDouble();
		
		System.out.println("Informe o tempo de trabalho: ");
		tempo = ler.nextDouble();
		
	   double resultado= tempo % 7 >= 3 ? (salario*0.07) + salario : (salario*0.05) + salario;
	   System.out.println (resultado);
		
		
		
		
		
		
		
		
		
		
		
	}

}

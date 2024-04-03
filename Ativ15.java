package abril03;

import java.util.Scanner;

public class Ativ15 {
    
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salario,tempo, bonus, total;
		
		System.out.println("Informe o salário: ");
		salario = ler.nextDouble();
		
		System.out.println("Informe o tempo de trabalho: ");
		tempo = ler.nextDouble();
		
		if (tempo <= 3) {
			bonus = (salario*0.05);
			total = (salario + bonus);
	System.out.println("O bônus é de: " + total);
		}
		else if(tempo > 3){
			bonus = (salario*0.07);
			total = (salario + bonus);
			System.out.println("O bônus é de: " + total);
		}

	}
}
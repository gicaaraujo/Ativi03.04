package abril03;

import java.util.Scanner;

public class Ativ14 {

	public static void main(String[] args) {
		double valor;
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe um valor: ");
		valor = ler.nextDouble();

		String mensagem = valor % 5 == 0 ? "O número é múltiplo de 5." :"O número não é múltiplo de 5";
		System.out.println(mensagem);
	}

}

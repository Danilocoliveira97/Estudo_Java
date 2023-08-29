package curso_pragramacao;

import java.util.Locale;
import java.util.Scanner;

import entities.contaBanco;

public class exe30_ContaBancaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		contaBanco pessoa;
		System.out.println("Entre com o Nome da conta");
		String nome = sc.nextLine();
		System.out.println("Entre com o numero da conta");
		int numero = sc.nextInt();
		System.out.println("Deseja fazer um Deposito?[S]/[N]");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 's') {
			System.out.println("Valor de deposito:");
			double InicialDeposito = sc.nextDouble();
			pessoa = new contaBanco(nome,numero,InicialDeposito);
		}
		else {
			pessoa = new contaBanco(nome,numero);
		}
		System.out.println();
		System.out.println(pessoa);
		System.out.println();
		
		System.out.println("Entre com valor a ser depositado");
		double novoDeposito = sc.nextDouble();
		pessoa.deposito(novoDeposito);
		System.out.println("Dados da conta Atualizado :");
		System.out.println(pessoa);
		
		System.out.println("Valor de retirada");
		double retirada = sc.nextDouble();
		pessoa.saque(retirada);
		System.out.println("Dados da conta Atualizado :");
		System.out.println(pessoa);
	


		
		
		
		
		
		
		
		sc.close();
		

	}

}

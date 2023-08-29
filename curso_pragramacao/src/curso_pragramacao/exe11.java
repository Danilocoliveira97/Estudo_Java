package curso_pragramacao;

import java.util.Locale;
import java.util.Scanner;

public class exe11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Digite o condigo do produto que deseja\r\n"
				+ "		1-  Cachorro Quente = 4.00;\r\n"
				+ "		2- X-saladA = 4.50;\r\n"
				+ "		3- X-bacon = 5.00;\r\n"
				+ "		4- Torrada-simples = 2.00;\r\n"
				+ "		5- refrigerante = 1.50;");
		int codigo = sc.nextInt();
		System.out.println("Qual a quantidade : ");
		int quantidade= sc.nextInt() ;
		double total;
		if (codigo == 1) {
			total = quantidade * 4.00;
		}
		else if (codigo == 2){
				total = quantidade * 4.50 ;
		}
		else if (codigo == 3){
			total = quantidade * 5.00 ;
		}
		else if (codigo == 4){
			total = quantidade * 2.00 ;
		}
		else {total=quantidade *1.50;
		}
		
		System.out.printf("Total R$  %.2f" ,total);
		sc.close();
	}

}

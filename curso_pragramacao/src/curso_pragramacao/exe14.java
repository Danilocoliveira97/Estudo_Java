package curso_pragramacao;

import java.util.Locale;
import java.util.Scanner;

public class exe14 {

	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salario,juros = 0;
		salario = sc.nextDouble();
		if (salario <= 2000.00){
			juros = 0 ;
		}
		else if (salario > 2000.00 && salario < 3000.00) {
			juros = (salario * 0.08);
		}
		else if ( salario <= 4500.00) {
			juros = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else{ juros = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;;
		}
		if (juros == 00) {
			System.out.println("Isento");
		}
		else {System.out.printf("R$%.2f%n",juros);}
		sc.close();
	}
	}	
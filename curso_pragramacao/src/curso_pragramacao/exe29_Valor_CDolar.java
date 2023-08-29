package curso_pragramacao;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class exe29_Valor_CDolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyConverter conversao = new CurrencyConverter();

		System.out.println("What is the dollar price?");
		conversao.valordolar = sc.nextDouble();
		System.out.println();
		System.out.println("How many Dollars will be bought");
		conversao.quantidadedolar =sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f", conversao.total());
		
		sc.close();

	}

}

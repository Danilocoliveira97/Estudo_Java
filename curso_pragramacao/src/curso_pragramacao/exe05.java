package curso_pragramacao;

import java.util.Locale;
import java.util.Scanner;

public class exe05 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in) ;
		double n1 = sc.nextDouble();
		double v1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double v2 = sc.nextDouble();
		sc.close();
		double valor_pagar = (n1*v1)+ (n2*v2);
		System.out.printf("Valor a pagar :%.2f ",valor_pagar);
		
		

	}

}

package curso_pragramacao;

import java.util.Locale;
import java.util.Scanner;

public class exe12 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n;
		n = sc.nextDouble();
		if (n <= 25 && n > 0) {
			System.out.println("Intervalo (0.25)");
		}
			
		else if (n>25 && n <50){
			System.out.println("Intervalo (25,50)");
		}
		else if (n>50 && n < 75){
			System.out.println("Intervalo (50.75)");
		}
		else if (n>75) {
			System.out.println("Intervalo (75,100)");
		}
		else {System.out.println("Fora do Intervalo");
		
			
		}
		sc.close();

	}

}

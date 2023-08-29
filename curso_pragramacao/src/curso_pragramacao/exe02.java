package curso_pragramacao;

import java.util.Locale;
import java.util.Scanner;

public class exe02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double tt = 3.14159;
		double A,a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		sc.close();
		A = Math.pow(a,2);
		double area = tt * A;
		System.out.printf("A =    %.4f%n ", area);
		;

	}

}

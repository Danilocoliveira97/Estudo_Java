package curso_pragramacao;

import java.util.Locale;
import java.util.Scanner;

public class exe06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in) ;
		double a,b,c,triangulo,circulo,trapezio,quadrado,retangulo;
		double pi = 3.14159;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		sc.close();
		triangulo = a * c / 2;
		circulo = c* pi * c;
		trapezio = (a + b) / 2 *c ;
		quadrado = b*b ;
		retangulo = a*b;
		System.out.printf("Triangulo = %.3f%n" ,triangulo);
		System.out.printf("Circulo = %.3f%n" ,circulo);
		System.out.printf("trapezio = %.3f%n" ,trapezio);
		System.out.printf("quadrado = %.3f%n" ,quadrado);
		System.out.printf("retangulo = %.3f%n" ,retangulo);
	

		
	

	}

}

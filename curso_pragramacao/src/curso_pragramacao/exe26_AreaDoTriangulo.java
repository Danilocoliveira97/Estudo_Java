package curso_pragramacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class exe26_AreaDoTriangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rect;
		rect = new Rectangle();
		
		System.out.println("Entre com as medidas do Retangulo");
		
		rect.A = sc.nextDouble();
		rect.L = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n" , rect.area());
		System.out.printf("Perimetro = %.2f%n" , rect.perimeter());
		System.out.printf("Diagonal = %.2f%n" , rect.diagonaL());

		
		
		
	
	
		
		
		
		
		
		
		
		
		sc.close();

	}

}

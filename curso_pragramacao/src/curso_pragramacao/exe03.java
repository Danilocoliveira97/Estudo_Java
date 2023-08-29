package curso_pragramacao;

import java.util.Scanner;

public class exe03 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in) ;
			int a,b,c ,d;
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			int diferenca = (a*b  - c*d);
			System.out.println("Diferença = " + diferenca);
			sc.close();
		
		

		
		

	}

}

package curso_pragramacao;

import java.util.Locale;
import java.util.Scanner;

public class exe38_Vetor_Media_Pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n,cont,nPares;
		double mediaPar;
		nPares = 0 ;
		cont = 0 ;
		System.out.println("Quantos elementos vai ter o vetor ? ");
		n = sc.nextInt();
		
		int num[] = new int[n];
		
		for (int i=0; i<n ; i++) {
			System.out.println("Digite um número : ");
			num[i]= sc.nextInt();
		}
			
			
		for (int i=0; i<n ; i++) {
			if (num[i] % 2 == 0) {
				nPares += num[i];
				cont ++;
			}
		}
		
		if (nPares == 0) {
				System.out.println("Nenhum numero par");
				
			}
		else {
			mediaPar = (double)nPares /cont ;

			System.out.printf("Media dos pares = %.1f\n  " , mediaPar);}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}

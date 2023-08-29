package curso_pragramacao;

import java.util.Locale;
import java.util.Scanner;

public class exe34_Vetor_NumerosPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n,cont;
		cont = 0;
		System.out.println("Quantos Números você vai digitar : ");
		n = sc.nextInt();
		
		int numeros[] = new int[n];
		
		for(int i =0 ; i<n ; i++) {
			System.out.println("Digite um número : ");

			numeros[i] = sc.nextInt();
			if (numeros[i]%2 == 0) {
				cont = cont + 1;
			}
		}
		

		System.out.println("Numeros Pares :");

		for(int i =0 ; i<n ; i++) {
			if (numeros[i]%2 == 0) {
				System.out.printf("%d ",numeros[i]);
		}
		
			
		}
		System.out.println();
		System.out.println("Quantidade de pares = : " + cont);
		sc.close();
	}
}

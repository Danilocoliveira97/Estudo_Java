package curso_pragramacao;

import java.util.Locale;
import java.util.Scanner;

public class exe37_Vetor_Abaixo_da_media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;
		double cont,soma,media;
		cont = 0 ;
		soma = 0;
			
		System.out.println("Quantos elementos vai ter o Vetor?");
		n = sc.nextInt();
		
		double vetor[] = new double[n];
		
		for (int i=0; i<n ; i++) {
			System.out.println("Digite um número : ");
			vetor[i] = sc.nextDouble();
			if(vetor[i]> 9.0) {
			soma = soma + vetor[i];
			cont++;
			
		}
		}
		media = soma/cont;
		System.out.printf("Media Do Vetor : %.3f\n", media);
		
		System.out.println("Elementos abaixo da média");

		for (int i=0; i<n ; i++) {
			if(vetor[i]< media ) {
				System.out.printf("%.1f\n" , vetor[i]);}
			}
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}

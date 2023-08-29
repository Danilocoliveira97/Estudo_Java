package curso_pragramacao;

import java.util.Locale;
import java.util.Scanner;

public class exe33_Vetor_Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n,nMenorIdade;
		double soma,mediaAltura,porcentagemMenor;
		soma = 0.0;
		nMenorIdade = 0;
		
		System.out.println("Quantas pessoas serão digitadas?");
		n = sc.nextInt();
		
		String nomes [] = new String [n];
		int idades [] = new int [n];
		double alturas [] = new double [n];

		for(int i = 0 ; i < n ; i++) {
			System.out.printf("Dados da %d pessoa " , i+1 );
			System.out.print("Nome :");
			nomes[i] = sc.next();
			System.out.print("idade :");
			idades[i] = sc.nextInt();
			System.out.print("altura :");
			alturas[i] = sc.nextDouble();
		}
		
		for (int i = 0 ; i < n ; i++) {
			soma = soma + alturas[i];
		}
		
		mediaAltura = soma/n;
		System.out.printf("Altura Média : %.2f", mediaAltura );
		
		System.out.println();
		
		for (int i = 0 ; i < n ; i++) {
			if(idades[i]<16) {
				nMenorIdade ++;
			}
		}
		
		
		porcentagemMenor = ((double)nMenorIdade / n )*100.0;

		
		System.out.println("Pessoas com menos de 16 anos : " + porcentagemMenor + "%");
		
		for (int i = 0 ; i < n ; i++) {
			if(idades[i]<16) {
			System.out.printf("%s\n", nomes[i]);;	
			}
		}
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}

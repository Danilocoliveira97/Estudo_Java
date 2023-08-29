package curso_pragramacao;

import java.util.Locale;
import java.util.Scanner;
public class exe32_SomaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double soma,media;
		System.out.println("Quantos numeros você vai digitar?");
		int n = sc.nextInt();
		double vetor[] = new double [n];
		
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Digite um número : ");
			vetor[i]=sc.nextDouble();
		}
		
		soma = 0;
	    for (int i=0; i<n; i++) {
	        soma = soma + vetor[i];
	    }
		media = soma / n;
		
		System.out.print("Valores = ");
		for(int i = 0 ; i < n ; i++) {
			System.out.printf("%.1f  ",vetor[i]);}
		
		System.out.println();
		System.out.printf("Soma = %.2f\n",soma);
		System.out.printf("Media = %.2f\n ",media);


		
			sc.close();
	}

}

package curso_pragramacao;

import java.util.Locale;
import java.util.Scanner;

public class exe35_Vetor_MaiorPosicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double maiorValor;
		int n,posicaoMaior;
		System.out.println("Quantos Números você vai digitar : ");
		n = sc.nextInt();
		maiorValor= 0;
		posicaoMaior=0;
		
		double numeros[] = new double[n];
		
		for (int i = 0 ; i<n ; i++){
			numeros[i] = sc.nextDouble();
			if (maiorValor < numeros[i]) {
				maiorValor = numeros[i];
				posicaoMaior = i;
			}
			
			
		}
		System.out.println("Maior valor " + maiorValor);
		System.out.println("Posição do Maior valor = " + posicaoMaior);

		
		
		sc.close();
	}
		

}

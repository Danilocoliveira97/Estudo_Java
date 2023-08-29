package curso_pragramacao;

import java.util.Locale;
import java.util.Scanner;

public class exe36_Vetor_SomaDosVetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Quantos valores vai ter cada Vetor?");
		n = sc.nextInt();
		
		int vetorA[] = new int[n];
		int vetorB[] = new int[n];
		int vetorC[] = new int[n];
		
		System.out.println("Digite os Valores Do Vetor A:");
		for (int i=0; i<n ; i++) {
			vetorA[i]= sc.nextInt();
		}
		System.out.println("Digite os Valores Do Vetor B:");

		for (int i=0; i<n ; i++) {
			vetorB[i]= sc.nextInt();
		}
		
		for (int i=0; i<n ; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];}
		
		System.out.println("Vetor Resultante : ");
		for (int i=0; i<n ; i++) {
			System.out.printf("%d\n" , vetorC[i]);}
		
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}

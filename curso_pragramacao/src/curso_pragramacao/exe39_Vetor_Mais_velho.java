package curso_pragramacao;

import java.util.Locale;
import java.util.Scanner;

public class exe39_Vetor_Mais_velho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n,idadeVelho,posicaoMaior;
		
		
		System.out.println("Quantas pessoas você vai digitar ? ");
		n = sc.nextInt();
		
		String nomes[] = new String[n];
		int idade[] = new int[n];
		
		for (int i=0 ; i < n ; i++) {
			System.out.printf("Dados da %da pessoa : ",i+1);
				System.out.print("Nome : ");
				nomes[i]= sc.next();
				System.out.println();
				System.out.print("Idade : ");
				idade[i]= sc.nextInt();
			
		}
		
		idadeVelho = idade[0];
		posicaoMaior = 0;
		
		for (int i=0 ; i < n ; i++) {
			if(idade[i]> idadeVelho){
				idadeVelho = idade[i];
				posicaoMaior = i;
			}
		}
		
		System.out.println("pessoa mais velha " + nomes[posicaoMaior]);

		sc.close();
	}
}

package curso_pragramacao;

import java.util.Locale;
import java.util.Scanner;

public class exe40_Vetor_Alunos_Aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos sera digitados ?");
		int n ;
		n =sc.nextInt();
		
		String[] nomes = new String[n];
		double[] semestre1 = new double[n];
		double[] semestre2 = new double[n];
		double[] media = new double[n];
		
		
		for (int i =0 ; i<n ; i++) {
			System.out.printf("Digite nome,primeira e segunda nota do %d aluno",i+1);
			sc.nextLine();
			nomes[i] = sc.nextLine();
			semestre1[i]= sc.nextDouble();
			semestre2[i]= sc.nextDouble();
			media[i] = (semestre1[i]+semestre2[i])/2;
		}
		System.out.println("Alunos aprovados");
		for (int i =0 ; i<n ; i++) {
		if (media[i]>=6.0){
		System.out.printf("%s\n" , nomes[i]);
		}
		
		}

		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}

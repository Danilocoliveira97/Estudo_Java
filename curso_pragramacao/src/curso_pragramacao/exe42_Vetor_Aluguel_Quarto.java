package curso_pragramacao;

import java.util.Locale;
import java.util.Scanner;
import entities.rent;
public class exe42_Vetor_Aluguel_Quarto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos quartos vao ser alugados ?");

		int n;
		n = sc.nextInt();
		
		rent[]quarto = new rent [10];
		
		for(int i =0 ; i < n ; i++) {
			System.out.println();
			System.out.println("Rent #" + i+1 +":");
			System.out.println("nome : ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.printf("email : ");
			String email = sc.next();
			System.out.print("Qual quarto gostaria? : ");
			int numeroQuarto = sc.nextInt();
			quarto[numeroQuarto] = new rent(nome,email);

		}
		System.out.println();
		System.out.println("QUARTOS : ");
		
		for(int i =0 ; i < 10 ; i++) {
			if (quarto[i]!= null ){
				System.out.println( i + ":" + quarto[i]);
				
			}
		}
		

		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}

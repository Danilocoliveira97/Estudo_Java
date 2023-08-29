package curso_pragramacao;

import java.util.Locale;
import java.util.Scanner;

public class exe41_Vetor_dados_Pessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n,contHomem,contMulheres;
		double mediaMulheres,maiorAltura,menorAltura,totalAlturaf;
		System.out.println("Qauntas pessoas serão digitadas ? ");
		n = sc.nextInt();
		mediaMulheres = 0;
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for(int i = 0 ; i<n ; i++) {
			System.out.printf("Altura da %da pessoa ",i+1);
			altura[i]=sc.nextDouble();
			System.out.printf("Genero da %d pessoa",i+1);
			genero[i] = sc.next().charAt(0);
		}
		maiorAltura = altura[0];
		menorAltura = altura[0];
		contMulheres = 0;
		contHomem = 0;
		totalAlturaf = 0;
		for(int i = 0 ; i<n ; i++) {
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
			if(altura[i] < menorAltura) {
				menorAltura = altura[i];
				
			}
		}
		
		for(int i = 0 ; i<n ; i++){
			if (genero[i]=='f'||genero[i]=='F'){
				totalAlturaf += altura[i];
				contMulheres = contMulheres+ 1;
			}
			if (genero[i]=='m'||genero[i]=='M'){
				contHomem = contHomem+ 1;
			}
		}
		mediaMulheres = totalAlturaf / contMulheres;
		System.out.printf("menor altura = %.2f\n" , maiorAltura);
		System.out.printf("maioraltura altura = %.2f\n" , menorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n" , mediaMulheres);
		System.out.printf("número de homens = %d\n" , contHomem);

		

			
		
		
		
		
		
		sc.close();	
	}

		
		
		
		
		
		
		
		
		
		
		
		

		

}


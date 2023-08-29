package curso_pragramacao;

import java.util.Locale;
import java.util.Scanner;

public class exe31_VetoresNumNegativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros você vai digitar?");
		
		int n = sc.nextInt();
		
	    int[]vetor = new int[n];
	    
	    for(int i=0 ; i<n ;i++){
	    	System.out.println("Digite um número : ");
	    	vetor[i] = sc.nextInt();
	    }
	    
    	System.out.println("números negativos : ");

	    for(int i=0 ; i<n ;i++){
	    	if (vetor[i] < 0 ) {
	    		System.out.printf("%d\n",vetor[i]);
	    	}
	    }
	    

			sc.close();

	}

}

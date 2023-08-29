package curso_pragramacao;

import java.util.Locale;
import java.util.Scanner;

public class exe20 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0 ; i<n ;i++) {
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(y == 0){
		System.out.println("Divisão impossível");}
		else{double div = (double) x/y;
			System.out.printf("%.1f%n",div);
			}
		}
		sc.close();

	}
}

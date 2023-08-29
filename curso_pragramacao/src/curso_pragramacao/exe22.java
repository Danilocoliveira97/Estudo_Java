package curso_pragramacao;

import java.util.Locale;
import java.util.Scanner;

public class exe22 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1 ; i<= n; i++) {
			if (n%i == 0){
				System.out.println(i);}
			}
		sc.close();
		}

}

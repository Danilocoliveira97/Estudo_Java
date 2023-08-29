package curso_pragramacao;

import java.util.Locale;
import java.util.Scanner;

public class exe21 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fat = 1;
		for(int i = 1 ; i<=n ; i++){
			fat = fat * i;
			if(n==0) {System.out.println("1");}
			else {System.out.println(fat);}
		sc.close();
			
		}
	

}
}
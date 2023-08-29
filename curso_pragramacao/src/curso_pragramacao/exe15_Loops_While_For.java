package curso_pragramacao;

import java.util.Locale;
import java.util.Scanner;

public class exe15_Loops_While_For {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		while (x != 2002){
			System.out.println("Senha inválida");
			x = sc.nextInt();
		}
		System.out.println("Acesso permitido");
				
		sc.close();
}
}
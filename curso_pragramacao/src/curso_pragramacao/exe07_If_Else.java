package curso_pragramacao;

import java.util.Scanner;

public class exe07_If_Else {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		n1 = sc.nextInt();
		if (n1 < 0) {
		System.out.println("Negativo");
		}
		else {System.out.println("Não Negativo");
}
		sc.close();

	}

}

package curso_pragramacao;

import java.util.Locale;
import java.util.Scanner;

public class exe04 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in) ;
		 double numero,horas_trabalhadas,salario,valor_hora;
		 numero = sc.nextInt();
		 horas_trabalhadas = sc.nextDouble();
		 valor_hora =sc.nextDouble();
		 sc.close();
		 salario = horas_trabalhadas * valor_hora;
		 System.out.println("Numer : "+ numero);
		 System.out.printf("SALARY : R$ %.2f" , salario);
		

	}

}

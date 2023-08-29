package curso_pragramacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class exe28_NotasEstudantes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student estudante = new Student();
		System.out.println("Nome do estudante :");
		estudante.nome = sc.nextLine();
		System.out.println("primeira nota : ");
		estudante.nota1 = sc.nextDouble();
		System.out.println("segunda nota : ");
		estudante.nota2 = sc.nextDouble();
		System.out.println("terceira nota ");
		estudante.nota3 = sc.nextDouble();
		
		System.out.printf("Nota final : %.2f%n" , estudante.notaFinal());
		
		if(estudante.notaFinal() < 60.0) {
			System.out.println("Reprovado");
			System.out.printf("Faltou %.2f pontos para ser aprovado" , estudante.Status());
			}
		else {
			System.out.println("Aprovado");
		}


		
		
		
		
		
		
		
		
		
		sc.close();

	}

}

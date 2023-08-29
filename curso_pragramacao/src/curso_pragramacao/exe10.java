package curso_pragramacao;

import java.util.Scanner;

public class exe10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horai = sc.nextInt();
		int horaf = sc.nextInt();
		
		int duracao;
		if (horai < horaf){
			 duracao = horai - horaf;
			}
		else {
			duracao = 24 - horai + horaf;
				}
		System.out.println("O jogo durou " + duracao + " Horas");
		sc.close();
		
	}
		
}

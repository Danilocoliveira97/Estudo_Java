package curso_pragramacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class exe25_Estoquedeprodutos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter Product Data :");
		System.out.print("Name :");
		product.name = sc.nextLine();
		System.out.print("Price :");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock : ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("product data : " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to ve added in stock : ");
		int quantityadd = sc.nextInt();
		product.addProducts(quantityadd);;
		
		System.out.println();
		System.out.println("Update data : " + product);
		
		
		System.out.println();
		System.out.println("Enter the number of products to ve removed from stock : ");
		int quantityrem = sc.nextInt();
		product.removeProducts(quantityrem);

		System.out.println();
		System.out.println("Update data : " + product);
		
		
		
		
		
		
		
		
		sc.close();
	}

}

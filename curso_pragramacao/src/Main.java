import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender ='F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		//System.out.printf("%s tem %d anos e ganha R$ %.2f Reais%n",nome,idade,renda );
		
		System.out.println("Products:");
		System.out.printf("%s, Which price is %.2f%n",product1,price1);
		System.out.printf("%s, Which price is %.2f%n",product2,price2);
		System.out.printf("Record : %d years old , code %d and gender : %s%n",age,code,gender);
		System.out.println("Measue with eight decimal places :" +measure);
		System.out.printf("Rouded (Three Decimal places): %.3f%n",measure);
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f%n", measure  );
		;
		
		
;

	}

}

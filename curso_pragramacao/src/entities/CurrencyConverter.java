package entities;

public class CurrencyConverter{
		public static final double juros = 0.06;
		public double valordolar;
		public double quantidadedolar;
		
		public double total(){
			double V = quantidadedolar * valordolar *juros;
			return quantidadedolar * valordolar + V;
			
		}
		
}
	


package fundamentos;

public class DesafioTemperatura {
  // Transformar Fahrenheit para Celsius
	public static void main(String[] args) {
		double fahrenheit = 98.0;
		final int ajuste = 32;
		final double fator = 5.0/9.0;
		
		// (ºF - 32) * 5/9
		double celsius = (fahrenheit - ajuste) * fator;
		
		// Escrever o resultado
		
		System.out.println("A temperatura em Celsius eh de " + celsius + "ºC");
	}
}

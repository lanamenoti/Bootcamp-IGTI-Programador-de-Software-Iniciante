import java.math.*;

public class Bhaskara {
	public static void main(String[] args) {
		//Equação 1 - x^2 + 12x - 13 = 0
		//Equação 2 - 2x^2 - 16x - 18 = 0
		
		double a, b, c;
		
		//Equação 1
		a = 1;
		b = 12;
		c = -13;
		
		double delta;
		delta = (b * b) - (4 * a * c);
		System.out.printf("O valor de delta é: %.0f\n", delta);
		
		double x_linha, x_duasLinhas;
		
		x_linha = (-b + Math.sqrt(delta)) / (2 * a);
		x_duasLinhas = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.printf("O valor de x' é: %.0f.\n", x_linha);
		System.out.printf("O valor de x'' é: %.0f.\n", x_duasLinhas);
		
		//Equação 2
		a = 2;
		b = -16;
		c = -18;
		
		delta = (b * b) - (4 * a * c);
		System.out.printf("O valor de delta é: %.0f\n", delta);
		
		x_linha = (-b + Math.sqrt(delta)) / (2 * a);
		x_duasLinhas = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.printf("O valor de x' é: %.0f.\n", x_linha);
		System.out.printf("O valor de x'' é: %.0f.", x_duasLinhas);
		
	}
}

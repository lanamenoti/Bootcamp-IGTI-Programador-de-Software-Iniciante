package Pacote01;

import java.util.Scanner;

public class TP_01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double n1 = 15, n2 = 35, n3 = 2, resultado;
		
		System.out.println("Digite o valor para a primeira vari�vel:");
		n1 = entrada.nextDouble();
		
		System.out.println("Digite o valor para a segunda vari�vel:");
		n2 = entrada.nextDouble();
		
		resultado = n1 * n2 / n3;
		
		System.out.printf("O valor total �..: %.2f.", resultado);

	}

}

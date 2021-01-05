import java.util.Scanner;

public class Continue {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero = 0, soma = 0;
		
		do {
			System.out.println("Digite um número:");
			numero = teclado.nextInt();
			
			if (numero == 18) {
				continue;
			}
			
			soma = soma + numero;
		} while (numero > 0);
		
		System.out.println("A soma dos números é: " + soma);

	}

}

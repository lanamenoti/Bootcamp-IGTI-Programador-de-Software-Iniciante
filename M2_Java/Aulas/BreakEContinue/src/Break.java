import java.util.Scanner;

public class Break {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero = 0, soma =0;
		
		System.out.println("Digite um número:");
		numero = teclado.nextInt();
		
		while (numero > 0) {
			soma = soma + numero;
			
			System.out.println("Digite um número:");
			numero = teclado.nextInt();
			
			if (numero == 18) {
				break;
			}
		}
		
		System.out.println("O somatório dos números digitados é: " + soma);
	}
	
}

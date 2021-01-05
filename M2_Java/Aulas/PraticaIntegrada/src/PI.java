import java.util.Scanner;

public class PI {
	public static void main(String[] args) {
		Scanner tecladoChar = new Scanner(System.in);
		Scanner tecladoNum = new Scanner(System.in);
		
		char operacao = ' ';
		int[] numeros = new int [1000];
		int i = 0, soma = 0, contaPares = 0;
		double media = 0;
		
		do {
			System.out.println("Menu de opera��es: \n" 
					+ "D - Para digitar novos n�meros.\n"
					+ "Z - Para apresentar o somat�rio dos n�meros.\n"
					+ "V - Para visualizar todos os n�meros digitados.\n"
					+ "P - Para a quantidade de n�meros digitados.\n"
					+ "M - Para a m�dia simples dos n�meros digitados.\n"
					+ "Q - Para a quantidade de pares."
					+ "S - Para sair do programa.");
			System.out.println("Digite a op��o desejada:");
			operacao = tecladoChar.nextLine().charAt(0);
			
			switch (operacao) {
			case 'D': {
				System.out.println("Digite o n�mero desejado:");
				numeros[i] = tecladoNum.nextInt();
				i++;
				
				break;
			}
			case 'Z': {
				for (int j = 0; j < i; j++) {
					soma = soma + numeros[j];
				}
				System.out.println("A soma dos n�meros digitados �: " + soma);
				
				break;
			}
			case 'V': {
				for (int j = 0; j < i; j++) {
					System.out.println(numeros[j]);
				}
				
				break;
			}
			case 'P': {
				System.out.printf("Foram digitados %d n�meros.\n", i);
				
				break;
			}
			case 'M': {
				for (int j = 0; j < i; j++) {
					soma = soma + numeros[j];
				}
				media = soma / i;
				System.out.println("A m�dia dos n�meros digitados �: " + media);
				
				break;
			}
			case 'Q': {
				for (int j = 0; j < i; j++) {
					if (numeros[j] % 2 ==0) {
						contaPares++;					
					}
				}
				System.out.println("Quantidade de n�meros pares: " + contaPares);
				
				break;
			}
			default: {
				System.out.println("Op��o inv�lida!");
			}
				
			}
			
		} while (operacao != 'S');
	}

}

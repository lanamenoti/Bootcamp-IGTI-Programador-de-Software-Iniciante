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
			System.out.println("Menu de operações: \n" 
					+ "D - Para digitar novos números.\n"
					+ "Z - Para apresentar o somatório dos números.\n"
					+ "V - Para visualizar todos os números digitados.\n"
					+ "P - Para a quantidade de números digitados.\n"
					+ "M - Para a média simples dos números digitados.\n"
					+ "Q - Para a quantidade de pares."
					+ "S - Para sair do programa.");
			System.out.println("Digite a opção desejada:");
			operacao = tecladoChar.nextLine().charAt(0);
			
			switch (operacao) {
			case 'D': {
				System.out.println("Digite o número desejado:");
				numeros[i] = tecladoNum.nextInt();
				i++;
				
				break;
			}
			case 'Z': {
				for (int j = 0; j < i; j++) {
					soma = soma + numeros[j];
				}
				System.out.println("A soma dos números digitados é: " + soma);
				
				break;
			}
			case 'V': {
				for (int j = 0; j < i; j++) {
					System.out.println(numeros[j]);
				}
				
				break;
			}
			case 'P': {
				System.out.printf("Foram digitados %d números.\n", i);
				
				break;
			}
			case 'M': {
				for (int j = 0; j < i; j++) {
					soma = soma + numeros[j];
				}
				media = soma / i;
				System.out.println("A média dos números digitados é: " + media);
				
				break;
			}
			case 'Q': {
				for (int j = 0; j < i; j++) {
					if (numeros[j] % 2 ==0) {
						contaPares++;					
					}
				}
				System.out.println("Quantidade de números pares: " + contaPares);
				
				break;
			}
			default: {
				System.out.println("Opção inválida!");
			}
				
			}
			
		} while (operacao != 'S');
	}

}

import java.util.Random;

public class Pergunta11 {
	public static void main(String[] args) {
		
		int[] valores = new int[1000], repeticoes = new int[1000];
		int limiteSuperior = 100;
		Random random = new Random(); //Classe para gerar numeros aleatorios 
		
		for (int i = 0; i < 1000; i++) {
			//Gerando numeros aleatorios inteiros ate 100 em cada posicao do vetor valores
			valores[i] = random.nextInt(limiteSuperior);
		}
		
		for (int i = 0; i < 1000; i++) {
			//Contando quantas vezes um numero se repete dentro do vetor valores
			// Soma 1 na posicao do vetor repeticao que tem o valor do vetor valores
			// 	- Ex.: Quando entrar na posicao 63 do vetor repeticao, vai somar 1 ao 0 que ta ali,
			//		e isso vai acontecer quantas vezes o 63 se repetir 
			repeticoes[valores[i]]++;
			
		}
		
		for (int i = 0; i < 100; i++) {
			System.out.printf("O número %d repete %d vezes.\n", i, repeticoes[i]);
		}
	}

}


public class Pergunta10 {
	public static void main(String[] args) {
		int cont = 0;
		for (int i = 1; i <= 100; i++) {
			cont = 0;
			for (int j = i; j > 0; j--) {
				//Testando por quais valores menores que o i que ele eh divisivel
				if (i % j == 0) {
					cont++;
				}
			}
			//Se for divisivel apenas por dois valores, vai ser printado pois eh primo
			if (cont == 2) {
				System.out.printf("%d\n", i);
			}
			
			//O programa printa todos os numeros primos entre 1 e 100 
		}
		
	}

}

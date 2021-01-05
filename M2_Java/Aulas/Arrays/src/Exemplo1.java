import java.util.Scanner;

public class Exemplo1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[5];
		int total = 0 , i;
		
		for (i = 0; i < 5; i++) {
			System.out.printf("Digite o %d número:", i + 1);
			numeros[i] = teclado.nextInt();
			total = total + numeros[i];
		}
		
		System.out.println("A soma dos números digitados é: " + total);
		
		
	}

}

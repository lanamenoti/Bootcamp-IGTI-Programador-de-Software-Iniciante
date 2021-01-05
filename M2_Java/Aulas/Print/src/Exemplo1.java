
public class Exemplo1 {
	public static void main(String[] args) {
		int idade = 23;
		double altura = 1.54;
		
		// print - não quebra a linha
		System.out.print("Idade: " + idade);
		System.out.print("Altura: " + altura + "\n");
		
		//println - quebra a linha
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		
		// printf - trabalha com coringas
		/* 
		 * %s - String
		 * %d - int
		 * %.2f - float com duas casas deciamais 
		 * %b - boolean
		 * %c - caractere
		*/
		
		System.out.printf("A idade é %d anos e a altura é %.2fcm", idade, altura);
	} 

}

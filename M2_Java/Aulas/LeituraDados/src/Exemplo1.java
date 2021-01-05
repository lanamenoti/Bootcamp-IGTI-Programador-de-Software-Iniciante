import java.util.Scanner;

public class Exemplo1 {
	public static void main(String[] args) {
		double nota1, nota2, nota3, nota4, freq, totalNotas;
		char statusAluno;
		
		Scanner entNumeros = new Scanner(System.in);
		Scanner entCaracteres = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno:");
		String nomeAluno = entCaracteres.nextLine();
		
		System.out.println("Digite o status do aluno (O --> Ok, P --> Pendência):");
		statusAluno = entCaracteres.nextLine().charAt(0);
		
		System.out.println("Digite a primeira nota:");
		nota1 = entNumeros.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		nota2 = entNumeros.nextDouble();
		
		System.out.println("Digite a terceira nota:");
		nota3 = entNumeros.nextDouble();
		
		System.out.println("Digite a quarta nota:");
		nota4 = entNumeros.nextDouble();
		
		System.out.println("Digite a frequência:");
		freq = entNumeros.nextDouble();
		
		totalNotas = nota1 + nota2 + nota3 + nota4;
		boolean aprovado = totalNotas >= 70 && freq >= 0.75;
		
		System.out.printf("O(a) aluno(a) %s obteve nota final %.2f e frequência de %.2f.\n"
				+ "A situação do aluno é %c.\nEstá aprovado? %b.", nomeAluno, totalNotas, freq * 100, statusAluno, aprovado);
		
		
		
		
	}

}

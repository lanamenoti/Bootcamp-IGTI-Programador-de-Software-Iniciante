package pacotePrincipal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		p1.nome = "Alana Menoti";
		p1.idade = 23;
		p1.altura = 1.54;
		p1.peso = 45;

		System.out.printf("%s\nAno nascimento: %d.\n", p1.imprimeDados('N'), p1.retornarAnoNascimento());

		Pessoa p2 = new Pessoa();
		p2.nome = "Ubirajara Iaschinski Pires";
		p2.idade = 56;
		p2.altura = 1.80;
		p2.peso = 99;

		System.out.printf("%s\nAno nascimento: %d.\n", p2.imprimeDados('N'), p2.retornarAnoNascimento());

		Pessoa p3 = new Pessoa();
		char imprimirEndereco;
		Scanner entCaracter = new Scanner(System.in);
		Scanner entNumerico = new Scanner(System.in);

		System.out.println("Digite o nome:");
		p3.nome = entCaracter.nextLine();

		System.out.println("Digite a idade:");
		p3.idade = entNumerico.nextInt();

		System.out.println("Digite a altura:");
		p3.altura = entNumerico.nextDouble();

		System.out.println("Digite o peso:");
		p3.peso = entNumerico.nextDouble();

		System.out.println("Digite o CPF:");
		p3.CPF = entCaracter.nextLine();

		System.out.println("Digite a rua:");
		p3.endereco.logradouro = entCaracter.nextLine();

		System.out.println("Digite o número:");
		p3.endereco.numero = entNumerico.nextInt();

		System.out.println("Digite o complemento: ");
		p3.endereco.complemento = entCaracter.nextLine();

		System.out.println("Digite a cidade: ");
		p3.endereco.cidade = entCaracter.nextLine();

		System.out.println("Digite o estado:");
		p3.endereco.estado = entCaracter.nextLine();

		System.out.println("Digite o CEP:");
		p3.endereco.CEP = entCaracter.nextLine();

		System.out.println("Desja imprimir o endereço?");
		imprimirEndereco = entCaracter.nextLine().charAt(0);

		System.out.printf("%s\n", p3.imprimeDados(imprimirEndereco));
		
		//Construtores

		Pessoa p4 = new Pessoa("Fulano de Tal", 25, "000.555.444-88");
		p4.peso = 65;
		p4.altura = 1.59;
		p4.endereco.logradouro = "Avenida Tal";
		p4.endereco.numero = 569;
		p4.endereco.complemento = "9";
		p4.endereco.cidade = "São Paulo";
		p4.endereco.estado = "SP";
		p4.endereco.CEP = "66666-666";

		System.out.printf("%s\n", p4.imprimeDados('S'));

		Pessoa p5 = new Pessoa("Siclano de Tal", 45, "000.000.000-00", "Avenida C", 56, "305", "Rio de Janeiro", "RJ",
				"22222-22");
		p5.peso = 55;
		p5.altura = 1.60;
		System.out.printf("%s\n", p5.imprimeDados('S'));

	}

}

package pacotePrincipal;

public class Pessoa {
	
	int idade;
	double altura;
	double peso;
	String nome;
	String CPF;
	DadosEndereco endereco;
	
	//Construtores
	
	Pessoa() {
		endereco = new DadosEndereco();
	}
	
	Pessoa(String name, int age, String id) {
		nome = name;
		idade = age;
		CPF = id;
		endereco = new DadosEndereco();
	}
	
	Pessoa(String name, int age, String id, String street, int number,
			String compl, String city, String UF, String code) {
		nome = name;
		idade = age;
		CPF = id;
		endereco = new DadosEndereco();
		endereco.logradouro = street;
		endereco.numero = number;
		endereco.complemento = compl;
		endereco.cidade = city;
		endereco.estado = UF;
		endereco.CEP = code;
	}
	
	//Métodos da Classe Pessoa
	
	String imprimeDados(char imprimirEndereco) {
		if (imprimirEndereco == 'S') {
			return "Nome: " + nome + "\nIdade: " + Integer.toString(idade) 
			+ "\nPeso: " + Double.toString(peso) + "\nAltura: " + Double.toString(altura) + "\nCPF: " + CPF +
			"\nEndereço: " + endereco.imprimirDadosEndereco();
		} else {
			return "Nome: " + nome + "\nIdade: " + Integer.toString(idade) 
			+ "\nPeso: " + Double.toString(peso) + "\nAltura: " + Double.toString(altura) + "\nCPF: " + CPF;
		}
		
	}
	
	int retornarAnoNascimento() {
		return 2020 - idade;
	}
	
	
	
}


public class Exemplo {
	public static void main(String[] args) {
		String nome, nome2, nome3;
		nome = "Alana Menoti Pires;";
		nome2 = "Arthur Alexandre Capelli dos Santos";
		nome3 = "Maria Concei��o Monticelli Menoti";
		
		System.out.println(nome);
		System.out.println(nome2);
		System.out.println(nome3);
		
		int tamanhoNome, tamanhoNome2, tamanhoNome3;
		tamanhoNome = nome.length();
		tamanhoNome2 = nome2.length();
		tamanhoNome3 = nome3.length();
		
		System.out.println("A vari�vel nome tem " + tamanhoNome + " caracteres");
		System.out.println("A vari�vel nome2 tem " + tamanhoNome2 + " caracteres");
		System.out.println("A vari�vel nome3 tem " + tamanhoNome3 + " caracteres");
		
		/*Concatena duas strings */
		String nomesConcatenados = nome.concat(nome2);
		System.out.println(nomesConcatenados);
		
		/* Subtitui caracteres na string*/
		String nomeSemA = nome.replace("a", "*");
		System.out.println(nomeSemA);
		
		String casal = nomesConcatenados.replace(";", " ");
		System.out.println(casal);
		
		/*Pega um peda�o da string*/
		String somenteNome = nome2.substring(0, 16);
		System.out.println(somenteNome);
		
		/*Transforma toda a string em mai�sculo*/
		String nomeTudoMaiusculo = nome.toUpperCase();
		System.out.println(nomeTudoMaiusculo);
		
		/*Transforma toda a string em min�sculo*/
		String nomeTudoMinusculo = nome2.toLowerCase();
		System.out.println(nomeTudoMinusculo);
	
	}

}

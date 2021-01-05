import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leitura {
	public static void main(String[] args) {
		try {
			FileReader arquivo = new FileReader("C:\\Users\\Lanam\\Documents\\IGTI - Programdor iniciante\\Módulo 2 - Java\\Nomes.txt");
			BufferedReader lerArquivo = new BufferedReader(arquivo);
			
			String linha;
			linha = lerArquivo.readLine();
			
			while (linha != null) {
				String[] dadosCliente = new String[4];
				dadosCliente = linha.split(";");
				System.out.printf("Identificador: %s.\n" + "Nome: %s.\n" + "Endereço: %s.\n" + "Estado: %s.\n", dadosCliente[0], dadosCliente[1], dadosCliente[2], dadosCliente[3]);
				
				System.out.printf("%s\n", linha);
				linha = lerArquivo.readLine();
				
				System.out.println("\n");
				
				
			}
			lerArquivo.close();
			arquivo.close();
			
		} catch (IOException e) {
			System.out.println("Erro lendo dados: " + e.getMessage());
			
		}
	}

}

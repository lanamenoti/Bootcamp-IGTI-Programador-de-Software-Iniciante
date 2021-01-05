import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Gravacao {
	public static void main(String[] args) {
		try {
			FileWriter arquivo = new FileWriter("C:\\Users\\Lanam\\Documents\\IGTI - Programdor iniciante\\Módulo 2 - Java\\arquivoGravado.txt");
			PrintWriter gravarArquivo = new PrintWriter(arquivo);
			
			for (int i = 0; i < 1000; i++) {
				gravarArquivo.printf("Valor de i: %d.\n", i);
			}
			
			System.out.println("Arquivo gravado com sucesso!");
			gravarArquivo.close();
			arquivo.close();
			
		} catch (IOException e) {
			System.out.println("Erro gravação de dados: " + e.getMessage());
		}
		
	}

}

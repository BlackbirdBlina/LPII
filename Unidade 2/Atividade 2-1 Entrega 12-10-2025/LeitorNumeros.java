import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Criação da exceção personalizada
class MinhaExcecao extends Exception {

    public MinhaExcecao(String mensagem) {
        super(mensagem);
    }

}

public class LeitorNumeros {
    public static void main(String[] args) throws IOException, MinhaExcecao {
        // Nome do arquivo que será lido
        String nomeArquivo = "dados.txt";

        // Lançando exceção para Arquivo inexistente e abrindo o arquivo
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {

            String linha;
            while ((linha = br.readLine()) != null) {

                int numero;
                try {

                    // Tenta converter a linha para número inteiro
                    numero = Integer.parseInt(linha);

                } catch (NumberFormatException e) {

                    // Lança exceção para formato inválido
                    System.out.println("Erro: formato de número inválido. " + e.getMessage());
                    continue; // Pula para a próxima linha

                }

                // Regra de negócio: não pode número negativo
                if (numero < 0) {

                    br.close();
                    // Aqui os alunos devem lançar a exceção personalizada
                    throw new MinhaExcecao("Erro: número negativo não permitido. " + numero);

                }

                System.out.println("Número lido: " + numero);
            }

        } catch (FileNotFoundException e) {

            System.out.println("Erro: arquivo não encontrado. " + e.getMessage());
            return;

        }

        System.out.println("Leitura concluída!");
    }
}

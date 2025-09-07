import br.universidade.biblio.Emprestimo;
import br.universidade.biblio.GerenciadorDeDados;
import br.universidade.biblio.Livro;
import br.universidade.biblio.Usuario;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        String caminho = "banco.json";
        GerenciadorDeDados gd = new GerenciadorDeDados(caminho);
        Livro livro1 = new Livro("Estruturas de Dados", "Goodrich", 2013, 2);
        gd.registrarLivroBanco(livro1);
        Livro livro2 = new Livro("Banco de Dados", "Elmasri", 2016, 1);
        gd.registrarLivroBanco(livro2);
        Livro livro3 = new Livro("Banco de Dados", "Elmasri", 2016, 3);
        gd.registrarLivroBanco(livro3);

        Usuario usuario1 = new Usuario("João", "2025145123", "BTI");
        gd.registrarUsuarioBanco(usuario1);
        Usuario usuario2 = new Usuario("Maria", "2025105132", "BTI");
        gd.registrarUsuarioBanco(usuario2);
        Usuario usuario3 = new Usuario("Socorro", "2025151326", "BTI");
        gd.registrarUsuarioBanco(usuario3);

        LocalDate dataEmprestimo1 = LocalDate.of(2025, 9, 5);
        LocalDate dataDevolucao1 = LocalDate.of(2025, 10, 5);
        Emprestimo emprestimo1 = new Emprestimo(dataEmprestimo1, dataDevolucao1, livro1, usuario1);
        gd.registrarEmprestimoBanco(emprestimo1);

        LocalDate dataEmprestimo2 = LocalDate.of(2025, 6, 20);
        LocalDate dataDevolucao2 = LocalDate.of(2025, 7, 20);
        Emprestimo emprestimo2 = new Emprestimo(dataEmprestimo2, dataDevolucao2, livro2, usuario2);
        gd.registrarEmprestimoBanco(emprestimo2);

        LocalDate dataEmprestimo3 = LocalDate.of(2025, 8, 25);
        LocalDate dataDevolucao3 = LocalDate.of(2025, 9, 25);
        Emprestimo emprestimo3 = new Emprestimo(dataEmprestimo3, dataDevolucao3, livro3, usuario3);
        gd.registrarEmprestimoBanco(emprestimo3);

        if (emprestimo3.estaAtrasado()){
            System.out.println("O livro está atrasado, por favor devolver!");
        }

        Livro ultimo = gd.consultarLivroBanco();
        System.out.println("Último livro cadastrado: " + ultimo);

        System.out.println("Pronto! Verifique o arquivo " + caminho);
    }
}

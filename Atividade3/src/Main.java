import br.universidade.biblio.Emprestimo;
import br.universidade.biblio.GerenciadorDeDados;
import br.universidade.biblio.Livro;
import br.universidade.biblio.Usuario;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro(1);
        Usuario usuario1 = new Usuario(1, "João");
        Emprestimo emprestimo1 = new Emprestimo(1, livro1, usuario1);
        GerenciadorDeDados gerenciador = new GerenciadorDeDados();
        gerenciador.salvarLivro(livro1);
        gerenciador.salvarUsuario(usuario1);
        gerenciador.salvarEmprestimo(emprestimo1);
        System.out.println("Livro ID: " + gerenciador.getLivro(1).getId());
        System.out.println("Usuário Nome: " + gerenciador.getListaDeUsuarios().get(0).getNome());
        System.out.println("Empréstimo ID: " + gerenciador.getListaDeEmprestimos().get(0).getId());
    }
}

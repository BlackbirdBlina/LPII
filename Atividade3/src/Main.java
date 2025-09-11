import br.universidade.biblio.Emprestimo;
import br.universidade.biblio.GerenciadorDeDados;
import br.universidade.biblio.Livro;
import br.universidade.biblio.Usuario;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        //Criando caminho para salvar o json e poder acessar as informações que forem sendo salvas
        String caminho = "LPII/Atividade3/banco.json";
        GerenciadorDeDados gd = new GerenciadorDeDados(caminho);

        //Criando e salvando instâncias de Livro no json
        Livro livro1 = new Livro("Estruturas de Dados", "Goodrich", 2013, 2);
        gd.registrarLivroBanco(livro1);
        Livro livro2 = new Livro("Banco de Dados", "Elmasri", 2016, 1);
        gd.registrarLivroBanco(livro2);
        Livro livro3 = new Livro("Banco de Dados", "Elmasri", 2016, 3);
        gd.registrarLivroBanco(livro3);

        //Criando e salvando instâncias de Usuario no json
        Usuario usuario1 = new Usuario("João", "2025145123", "BTI");
        boolean sucesso1 = gd.registrarUsuarioBanco(usuario1);

        //Verificando se o usuário já está registrado
        if(sucesso1){
            System.out.println("Usuário registrado com sucesso!");
        } else {
            System.out.println("Este usuário já está registrado!");
        }

        Usuario usuario1repe = new Usuario("João", "2025145123", "BTI");
        gd.registrarUsuarioBanco(usuario1repe);
        boolean sucesso2 = gd.registrarUsuarioBanco(usuario1repe);

        //Verificando se o usuário já está registrado
        if(sucesso2){
            System.out.println("Usuário registrado com sucesso!");
        } else {
            System.out.println("Este usuário já está registrado!");
        }

        Usuario usuario2 = new Usuario("Maria", "2025105132", "BTI");
        gd.registrarUsuarioBanco(usuario2);
        boolean sucesso3 = gd.registrarUsuarioBanco(usuario2);

        //Verificando se o usuário já está registrado
        if(sucesso3){
            System.out.println("Usuário registrado com sucesso!");
        } else {
            System.out.println("Este usuário já está registrado!");
        }

        Usuario usuario3 = new Usuario("Socorro", "2025151326", "BTI");
        gd.registrarUsuarioBanco(usuario3);
        boolean sucesso4 = gd.registrarUsuarioBanco(usuario3);

        //Verificando se o usuário já está registrado
        if(sucesso4){
            System.out.println("Usuário registrado com sucesso!");
        } else {
            System.out.println("Este usuário já está registrado!");
        }

        //Criando e salvando instâncias de Emprestimo no json
        LocalDate dataEmprestimo1 = LocalDate.of(2025, 9, 5);
        LocalDate dataDevolucao1 = LocalDate.of(2025, 10, 5);
        Emprestimo emprestimo1 = new Emprestimo(1, dataEmprestimo1, dataDevolucao1, livro1, usuario1);
        gd.registrarEmprestimoBanco(emprestimo1);

        LocalDate dataEmprestimo2 = LocalDate.of(2025, 6, 20);
        LocalDate dataDevolucao2 = LocalDate.of(2025, 7, 20);
        Emprestimo emprestimo2 = new Emprestimo(2, dataEmprestimo2, dataDevolucao2, livro2, usuario2);
        gd.registrarEmprestimoBanco(emprestimo2);

        LocalDate dataEmprestimo3 = LocalDate.of(2025, 8, 25);
        LocalDate dataDevolucao3 = LocalDate.of(2025, 9, 25);
        Emprestimo emprestimo3 = new Emprestimo(3, dataEmprestimo3, dataDevolucao3, livro3, usuario3);
        gd.registrarEmprestimoBanco(emprestimo3);

        //Aqui começam as consultas de Livro
        Livro consulta1 = gd.consultarLivroBanco();
        System.out.println("Este é o último livro cadastrado: " + consulta1);

        Livro consulta2 = gd.consultarLivroPorTitulo("Estruturas de Dados");
        System.out.println("Este é o livro que você buscou: " + consulta2);

        List<Livro> consulta3 = gd.consultarTodosLivrosBanco();
        System.out.println("Estes são todos os livros cadastrados: " + consulta3);


        //Aqui começam as consultas de Usuario
        Usuario consulta4 = gd.consultarUsuarioBanco();
        System.out.println("Este é o último usuário cadastrado: " + consulta4);

        Usuario consulta5 = gd.consultarUsuarioPorMatricula("2025145123");
        System.out.println("Este é o usuário que você buscou: " + consulta5);

        List<Usuario> consulta6 = gd.consultarTodosUsuariosBanco();
        System.out.println("Estes são todos os usuários cadastrados: " + consulta6);


        //Aqui começam as consultas de Emprestimo
        Emprestimo consulta7 = gd.consultarEmprestimoBanco();
        System.out.println("Este é o último emprestimo cadastrado: " + consulta7);

        Emprestimo consulta8 = gd.consultarEmprestimoPorID(1);
        System.out.println("Este é o emprestimo que você buscou: " + consulta8);

        List<Emprestimo> consulta9 = gd.consultarTodosEmprestimosBanco();
        System.out.println("Estes são todos os livros cadastrados: " + consulta9);

        //Verificando se um empréstimo (Livro ligado a um usuário) está atrasado.
        if (emprestimo3.estaAtrasado()){
            System.out.println("O livro está atrasado, por favor devolver!");
        } else {
            System.out.println("O livro não está atrasado.");
        }

    }
}

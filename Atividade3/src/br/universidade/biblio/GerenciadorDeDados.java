package br.universidade.biblio;

import java.util.ArrayList;

public class GerenciadorDeDados {
    private final ArrayList<Livro> listaDeLivros;
    private final ArrayList<Usuario> listaDeUsuarios;
    private final ArrayList<Emprestimo> listaDeEmprestimos;

    public GerenciadorDeDados(){
		this.listaDeLivros = new ArrayList<>();
        this.listaDeUsuarios = new ArrayList<>();
        this.listaDeEmprestimos = new ArrayList<>();
	}

    public void salvarLivro(Livro livro){
		listaDeLivros.add(livro);
    }

    public void salvarUsuario(Usuario usuario){
		listaDeUsuarios.add(usuario);
	}

    public void salvarEmprestimo(Emprestimo emprestimo){
		listaDeEmprestimos.add(emprestimo);
	}

	public ArrayList<Livro> getListaDeLivros() {
		return listaDeLivros;
	}

	public Livro getLivro(int id){
		for (Livro livro : this.listaDeLivros) {
			if (livro.getId() == id) {
				return livro;
			}
		}
		return null;
	}

	public ArrayList<Usuario> getListaDeUsuarios() {
		return listaDeUsuarios;
	}

	// Implementar método get para retornar um único usuário

	public ArrayList<Emprestimo> getListaDeEmprestimos() {
		return listaDeEmprestimos;
	}

	// Implementar método get para retornar um único empréstimo
}

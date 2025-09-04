package br.universidade.biblio;

public class Emprestimo {
    private int id;
    private final Livro livro;
    private final Usuario usuario;

    public Emprestimo(int id, Livro livro, Usuario usuario){
        this.id = id;
        this.livro = livro;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setId(int id) {
        this.id = id;
    }

}

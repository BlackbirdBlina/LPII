package br.universidade.biblio;


import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Emprestimo {
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(LocalDate dataEmprestimo, LocalDate dataDevolucao, Livro livro, Usuario usuario) {
        this.dataEmprestimo = Date.from(dataEmprestimo.atStartOfDay(ZoneId.systemDefault()).toInstant());
        this.dataDevolucao = Date.from(dataDevolucao.atStartOfDay(ZoneId.systemDefault()).toInstant());
        this.livro = livro;
        this.usuario = usuario;
    }

    public Date getDataEmprestimo() { return dataEmprestimo; }
    public Date getDataDevolucao() { return dataDevolucao; }
    public Livro getLivro() { return livro; }
    public Usuario getUsuario() { return usuario; }

    public boolean estaAtrasado(){
        return new Date().after(dataDevolucao);
    }

    @Override
    public String toString() {
        return "Empréstimo{Data='" + dataEmprestimo + "', Devolução='" + dataDevolucao + "', Livro='" + livro + "', Usuario='" + usuario + "}";
    }
}

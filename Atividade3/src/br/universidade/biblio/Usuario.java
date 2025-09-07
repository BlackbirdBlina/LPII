package br.universidade.biblio;

public class Usuario {
    private String nome;
    private String matricula;
    private String curso;

    public Usuario(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() { return nome; }
    public String getMatricula() { return matricula; }
    public String getCurso() { return curso; }

    @Override
    public String toString() {
        return "Usuário{nome='" + nome + "', Matrícula='" + matricula + "', Curso=" + curso + "}";
    }
}

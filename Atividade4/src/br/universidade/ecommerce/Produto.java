package br.universidade.ecommerce;

public class Produto {
    private String codProduto;
    private int quantidade;
    private double valor;
    private double peso;

    public Produto(String codProduto, double valor, double peso) {
        this.codProduto = codProduto;
        this.valor = valor;
        this.peso = peso;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
}

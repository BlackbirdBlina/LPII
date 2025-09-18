package br.universidade.ecommerce;

public class Produto {
    private String codProduto;
    private int quantidade;
    private double valor;
    private double peso;

    /* Não sei se entendi direito o que foi pedido em relação ao Overload, mas criei um construtor
    sem quantidade, já que a quantidade será definida no Pedido (sobrecarga adicionarItem). Conforme consta no 2º ponto (Overload) */
    public Produto(String codProduto, double valor, double peso) {
        // Validação simples para evitar valores negativos conforme último ponto (Validação)
        if(valor < 0 || peso < 0){
            throw new IllegalArgumentException("Valor e peso devem ser maiores ou iguais a zero.");
        }
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

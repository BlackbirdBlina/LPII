package br.universidade.ecommerce;

abstract class Pagamento {
    public abstract void processar(double valorTotal);
}

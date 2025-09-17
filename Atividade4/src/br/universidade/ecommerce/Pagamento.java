package br.universidade.ecommerce;

import java.util.ArrayList;
import java.util.List;

abstract class Pagamento {
    private double valorTotal;
    private List<Produto> produtos;

    Pagamento(){
        this.produtos = new ArrayList<>();
    }
    public abstract void processar(double valorTotal);

}

package br.universidade.ecommerce;

import java.util.ArrayList;
import java.util.List;
import br.universidade.ecommerce.Produto;

abstract class Pagamento {
    private double valorTotal;
    private String cep;
    private List<Produto> produtos;


    Pagamento(){
        this.produtos = new ArrayList<>();
    }
    abstract void processar(double valor);

    double calcularFrete(double peso){
        int quantidadeTotal = 0;
        for(Produto produto : produtos){
            quantidadeTotal += produto.getQuantidade();
        }
        return (peso * quantidadeTotal);
    }

    double calcularFrete(double peso, String cep){
        this.cep = cep;

        int quantidadeTotal = 0;
        for(Produto produto : produtos){
            quantidadeTotal += produto.getQuantidade();
        }

        /* Por limitações da modelagem do projeto, não foi realizado o cálculo adequado para
        este método, não sendo usada uma distância de um ponto a outro através do cep. */
        return (peso * quantidadeTotal);
    }


    void adicionarItem(Produto produto, int quantidade){
        produto.setQuantidade(quantidade);
        this.produtos.add(produto);
    }

    void adicionarItem(String codProduto, int quantidade){
        /* Por limitações da modelagem do projeto, não foi feita a busca adequada do produto para este método.
        Portanto, usou-se informações fictícias sendo criados códigos imaginários de produtos, passados diretamente no condicional.
        Nesse sentido, não se tem um banco com essas informações cadastradas, há apenas uma demonstração superficial
        de como seria essa comparação para adicionar o item/produto */

        for(Produto produto : produtos){
            if(produto.getCodProduto().equalsIgnoreCase(codProduto)){
                produto.setQuantidade(produto.getQuantidade()+quantidade);
                return;
            }

        }
        // produto não encontrado na lista, criando um novo produto fictício (SOLUÇÃO MUITO LONGE DA IDEAL)
        if(codProduto.equalsIgnoreCase("123abc")){
            Produto produto = new Produto(codProduto, 100.0, 2.0); // valores fictícios de valor e peso
            produto.setQuantidade(quantidade);
            this.produtos.add(produto);
        } else if (codProduto.equalsIgnoreCase("123abc4")) {
            Produto produto = new Produto(codProduto, 120.0, 4.0);
            produto.setQuantidade(quantidade);
            this.produtos.add(produto);
        } else if (codProduto.equalsIgnoreCase("123abc5")) {
            Produto produto = new Produto(codProduto, 150.0, 5.0);
            produto.setQuantidade(quantidade);
            this.produtos.add(produto);
        } else {
            System.out.println("Código inválido. Produto não adicionado.");
        }
    }
}

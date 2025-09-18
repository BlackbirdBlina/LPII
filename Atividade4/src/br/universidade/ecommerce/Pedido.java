package br.universidade.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    // Agregado, conforme consta no 4º ponto (Agregação)
    private Cliente cliente;
    private String cep;
    private final List<Produto> itemPedido;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.itemPedido = new ArrayList<>();
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public List<Produto> getItemPedido() {
        return itemPedido;
    }
    public void setItemPedido(Produto produto) {
        this.itemPedido.add(produto);
    }

    public double calcularFrete(double peso){
        int quantidadeTotal = 0;
        for(Produto produto : itemPedido){
            quantidadeTotal += produto.getQuantidade();
        }
        return (peso * quantidadeTotal);
    }

    public double calcularFrete(double peso, String cep){
        this.cep = cep;

        int quantidadeTotal = 0;
        for(Produto produto : itemPedido){
            quantidadeTotal += produto.getQuantidade();
        }

        /* Por limitações da modelagem do projeto, não foi realizado o cálculo adequado para
        este método, não sendo usada uma distância de um ponto a outro através do cep. */
        return (peso * quantidadeTotal);
    }


    public void adicionarItem(Produto produto, int quantidade){
        produto.setQuantidade(quantidade);
        this.itemPedido.add(produto);
    }

    public void adicionarItem(String codProduto, int quantidade){

        /* Por limitações da modelagem do projeto, não foi feita a busca adequada do produto para este método.
        Portanto, usou-se informações fictícias sendo criados códigos imaginários de produtos, passados diretamente no condicional.
        Nesse sentido, não se tem um banco com essas informações cadastradas, há apenas uma demonstração superficial
        de como seria essa comparação para adicionar o item/produto */
        for(Produto produto : itemPedido){
            if(produto.getCodProduto().equalsIgnoreCase(codProduto)){
                produto.setQuantidade(produto.getQuantidade() + quantidade);
                return;
            }

        }

        // produto não encontrado na lista, criando um novo produto fictício (SOLUÇÃO SIMPLES E MUITO LONGE DA IDEAL)
        if(codProduto.equalsIgnoreCase("123abc")){
            Produto produto = new Produto(codProduto, 100.0, 2.0);
            produto.setQuantidade(quantidade);
            this.itemPedido.add(produto);
        } else if (codProduto.equalsIgnoreCase("123abc4")) {
            Produto produto = new Produto(codProduto, 120.0, 4.0);
            produto.setQuantidade(quantidade);
            this.itemPedido.add(produto);
        } else if (codProduto.equalsIgnoreCase("123abc5")) {
            Produto produto = new Produto(codProduto, 150.0, 5.0);
            produto.setQuantidade(quantidade);
            this.itemPedido.add(produto);
        } else {
            System.out.println("Código inválido. Produto não adicionado.");
        }
    }

    public double calcularValorProdutos(){
        double total = 0.0;
        for(Produto produto : itemPedido){
            total += produto.getValor() * produto.getQuantidade();
       }
       return total;
    }

    public boolean removerPedido(){
        for(Produto p : itemPedido){
            // Apesar da remoção limpar totalmente o array com método clear, foi colocado um print para demonstrar que os itens estão sendo removidos
            System.out.println("Removendo item: " + p.getCodProduto() + " quantidade: " + p.getQuantidade());
        }
        this.itemPedido.clear();
        return true;
    }
}




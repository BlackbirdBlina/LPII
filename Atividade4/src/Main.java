
import br.universidade.ecommerce.Cliente;
import br.universidade.ecommerce.PagamentoCartao;
import br.universidade.ecommerce.PagamentoPix;
import br.universidade.ecommerce.Pedido;
import br.universidade.ecommerce.Produto;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Ana Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Bruno Souza", "987.654.321-00");
        Cliente cliente3 = new Cliente("Carla Mendes", "456.789.123-00");

        Produto produto1 = new Produto("123abc", 150.0, 2.0);
        Produto produto2 = new Produto("456def", 200.0, 3.0);
        Produto produto3 = new Produto("789ghi", 50.0, 1.0);

        Pedido pedidoCliente1 = new Pedido(cliente1);
        // Adicionando produtos via objeto Produto (sobrecarga de método), conforme 2º ponto (Overload)
            pedidoCliente1.adicionarItem(produto1, 2);
            pedidoCliente1.adicionarItem(produto3, 1);

        // Calculando frete via sobrecarga de método, via cep, conforme 2º ponto (Overload)
        double valorFrete = pedidoCliente1.calcularFrete(2.0, "12345-678");
        double valorProdutos = pedidoCliente1.calcularValorProdutos();
        double valorTotal = valorProdutos + valorFrete;
        System.out.println("Pedido do Cliente 1: " + pedidoCliente1.getCliente().getNome() + ".\nValor dos produtos: R$ " + valorProdutos + "\nValor do Frete: R$ " + valorFrete + "\nValor Total: R$ " + valorTotal);
        PagamentoCartao pagamento1 = new PagamentoCartao("234567", "Ana Silva", "12/25", "123");
        pagamento1.processar(valorTotal);

        Pedido pedidoCliente2 = new Pedido(cliente2);
        // Adicionando produtos via objeto Produto (sobrecarga de método), conforme 2º ponto (Overload)
            pedidoCliente2.adicionarItem(produto2, 4);
            pedidoCliente2.adicionarItem(produto1, 1);
            pedidoCliente2.adicionarItem(produto3, 5);

        // Calculando frete via sobrecarga de método, apenas usando o peso, conforme 2º ponto (Overload)
        double valorFrete2 = pedidoCliente2.calcularFrete(2.0);
        double valorProdutos2 = pedidoCliente2.calcularValorProdutos();
        double valorTotal2 = valorProdutos2 + valorFrete2;
        System.out.println("Pedido do Cliente 2: " + pedidoCliente2.getCliente().getNome() + ".\nValor dos produtos: R$ " + valorProdutos2 + "\nValor do Frete: R$ " + valorFrete2 + "\nValor Total: R$ " + valorTotal2);
        PagamentoPix pagamento2 = new PagamentoPix("129#ff567");
        pagamento2.processar(valorTotal2);


        Pedido pedidoCliente3 = new Pedido(cliente3);
        // Adicionando produtos via código do produto conforme 2º ponto (Overload), incluindo um código inválido para teste
            pedidoCliente3.adicionarItem("123abc", 3);
            pedidoCliente3.adicionarItem("123abc4", 2);
            pedidoCliente3.adicionarItem("123abc5", 1);
            pedidoCliente3.adicionarItem("000xyz", 1); // Código inválido para teste

        // Calculando frete via sobrecarga de método, via cep, conforme 2º ponto (Overload)
        double valorFrete3 = pedidoCliente3.calcularFrete(3.0, "98765-432");
        double valorProdutos3 = pedidoCliente3.calcularValorProdutos();
        double valorTotal3 = valorProdutos3 + valorFrete3;
        System.out.println("Pedido do Cliente 3: " + pedidoCliente3.getCliente().getNome() + ".\nValor dos produtos: R$ " + valorProdutos3 + "\nValor do Frete: R$ " + valorFrete3 + "\nValor Total: R$ " + valorTotal3 + "\n");

        // Testando remoção do pedido do cliente 3, conforme consta no 3º ponto (Composição)
        boolean remover = pedidoCliente3.removerPedido();
        if (remover) {
            System.out.println("Pedido do Cliente 3: " + pedidoCliente3.getCliente().getNome() + " removido com sucesso. Todos os itens foram excluídos do pedido.");
        } else {
            System.out.println("Falha ao remover o pedido do Cliente 1.");
        }
    }
}

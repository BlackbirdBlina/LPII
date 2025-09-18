
import br.universidade.ecommerce.Cliente;
import br.universidade.ecommerce.PagamentoCartao;
import br.universidade.ecommerce.PagamentoPix;
import br.universidade.ecommerce.Pedido;
import br.universidade.ecommerce.Produto;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Ana Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Bruno Souza", "987.654.321-00");

        Produto produto1 = new Produto("123abc", 150.0, 2.0);
        Produto produto2 = new Produto("456def", 200.0, 3.0);
        Produto produto3 = new Produto("789ghi", 50.0, 1.0);

        Pedido pedidoCliente1 = new Pedido(cliente1);
            pedidoCliente1.adicionarItem(produto1, 2);
            pedidoCliente1.adicionarItem(produto3, 1);

        double valorFrete = pedidoCliente1.calcularFrete(2.0, "12345-678");
        double valorProdutos = pedidoCliente1.calcularValorProdutos();
        double valorTotal = valorProdutos + valorFrete;
        PagamentoCartao pagamento1 = new PagamentoCartao("234567", "Ana Silva", "12/25", "123");
        System.out.println("Pedido do Cliente 1: " + pedidoCliente1.getCliente().getNome() + ".\nValor dos produtos: R$ " + valorProdutos + "\nValor do Frete: R$ " + valorFrete + "\nValor Total: R$ " + valorTotal);
        pagamento1.processar(valorTotal);

        Pedido pedidoCliente2 = new Pedido(cliente2);
            pedidoCliente2.adicionarItem(produto2, 4);
            pedidoCliente2.adicionarItem(produto1, 1);
            pedidoCliente2.adicionarItem(produto3, 5);

        double valorFrete2 = pedidoCliente2.calcularFrete(2.0);
        double valorProdutos2 = pedidoCliente2.calcularValorProdutos();
        double valorTotal2 = valorProdutos2 + valorFrete2;
        PagamentoPix pagamento2 = new PagamentoPix("129#ff567");
        System.out.println("Pedido do Cliente 2: " + pedidoCliente2.getCliente().getNome() + ".\nValor dos produtos: R$ " + valorProdutos2 + "\nValor do Frete: R$ " + valorFrete2 + "\nValor Total: R$ " + valorTotal2);
        pagamento2.processar(valorTotal2);
    }
}

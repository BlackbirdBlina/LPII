# Projeto Mini e-commerce

## Modelo do projeto, feito pelo Prof. Dr. Alan Santana
### Implementar um mini sistema de e-commerce que permita cadastrar produtos e clientes, criar pedidos com itens, calcular total, aplicar frete/pagamento usando polimorfismo, e demonstrar composição e agregação de forma explícita.


* ### Herança + Override (polimorfismo dinâmico):

    * Uma classe abstrata Pagamento com método abstrato processar(double valor)
    * Duas subclasses, por exemplo: PagamentoCartao e PagamentoPix, sobrescrevendo processar(...).

* ### Overload (polimorfismo estático)
    * Pelo menos dois métodos sobrecarregados (mesmo nome, assinaturas distintas).
    * Ex.:
        * calcularFrete(double peso) e calcularFrete(double peso, String cep)
        * adicionarItem(Produto p, int qtd) e adicionarItem(String codP, int qtd)

* ### Composição (relação “parte-todo” forte)
    * Pedido tem ItemPedido (lista interna).
    * Se Pedido for removido, seus ItemPedido também são — vida atrelada ao todo.

* ### Agregação (relação fraca)
    * Pedido agrega um Cliente.
    * Cliente existe independente do Pedido.

* ### Encapsulamento
    * Atributos privados, acesso por getters/setters com validação mínima.

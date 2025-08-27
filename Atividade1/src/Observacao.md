## Relação entre as classes

    Eletrodoméstico é uma classe mãe como um tipo de lista ou uma "categoria".
    As classes fogão e geladeira herdam de Eletrodoméstico.
    Há espaço para criação de outros tipos de lista (Alimentos, Roupas, Calçados, etc.).
    No momento foram criadas apenas as classes soliciadas na atividade, portanto apenas um tipo de lista.

    ListaDeCompras contém os itens de cada tipo de lista.
    ListaDeCompras salva em um array (ArrayList<Eletrodomesticos>) a "lista" de itens do tipo eletrodoméstico.
    Como só existe um tipo de lista implementado (ArrayList<Eletrodomesticos>), ListaDeCompras pode conter apenas um tipo de elemento.
    ListaDeCompras retorna o valor total de cada lista.

    ControleFinanceiro contém um array de listas de compras.
    ControleFinanceiro retorna o valor total de todas as listas de compras feitas.

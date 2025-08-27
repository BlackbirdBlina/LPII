package testes;

import includes.ControleFinanceiro;
import includes.Fogao;
import includes.Geladeira;
import includes.ListaDeCompras;

public class Main {
    public static void main(String[] args) {
      Geladeira geladeira1 = new Geladeira(1, 2, "Frost food", "Brastemp", 4350.0);
      Fogao fogao1 = new Fogao(1, 6, "Warm food", "Electrolux", 2745.0);

      ListaDeCompras listaEletrodomesticos = new ListaDeCompras();
      listaEletrodomesticos.pushItem(geladeira1);
      listaEletrodomesticos.pushItem(fogao1);

      ControleFinanceiro controleFinanceiro = new ControleFinanceiro();
      controleFinanceiro.pushLista(listaEletrodomesticos);

      System.out.printf("Marca: %s, Preço: %.2f%n", geladeira1.getMarca(), geladeira1.getPreco());
      System.out.printf("Marca: %s, Preço: %.2f%n", fogao1.getMarca(), fogao1.getPreco());
      System.out.println("Total: " + listaEletrodomesticos.getValorTotal());
  }
}

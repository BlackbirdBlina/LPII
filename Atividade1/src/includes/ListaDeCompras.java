package includes;

import java.util.ArrayList;

public class ListaDeCompras {

	private final ArrayList<Eletrodomesticos> itens;

	public ListaDeCompras(){
		this.itens = new ArrayList<>();
	}

	public int getQuantidadeItens() {
		return itens.size();
	}

    public double getPrecoItem(int i) {
		return itens.get(i).getPreco();
	}

	public void pushItem(Eletrodomesticos item){
		itens.add(item);
	}

    public double getValorTotal() {
		double valorTotal = 0.0;
		for (int i = 0; i < itens.size(); i++) {
			double valorDoItem = getPrecoItem(i);
			valorTotal = valorTotal + valorDoItem;
		}
		return valorTotal;
	}


}

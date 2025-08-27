package includes;

import java.util.ArrayList;

public class ControleFinanceiro {

	private final ArrayList<ListaDeCompras> listas;


	public ControleFinanceiro(){
		this.listas = new ArrayList<>();
	}

	public int getQuantidadeDeListas() {
		return listas.size();
	}

	public double getValorTotalLista(int i) {
		return listas.get(i).getValorTotal();
	}

	public void pushLista(ListaDeCompras lista){
		listas.add(lista);
	}

	public double getValorTotalDasListas() {
		double valorTotalDasListas = 0.0;
		for (int i = 0; i < listas.size(); i++) {
			double valorTotalDeCadaLista = getValorTotalLista(i);
			valorTotalDasListas = valorTotalDasListas + valorTotalDeCadaLista;
		}
		return valorTotalDasListas;
	}


}

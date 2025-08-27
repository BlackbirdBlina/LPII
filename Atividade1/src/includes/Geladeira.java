package includes;

public class Geladeira extends Eletrodomesticos{

	private final int id;
    private final int quantidadePortas;

	public Geladeira(int id, int quantidadePortas, String modelo, String marca, double preco){

        super(modelo, marca, preco);
		this.id = id;
        this.quantidadePortas = quantidadePortas;

	}

	public int getid() {
		return id;
	}
    public int getQuantidadePortas() {
		return quantidadePortas;
	}
}

package includes;

public class Fogao extends Eletrodomesticos{

	private final int id;
    private final int quantidadeBocas;

	public Fogao(int id, int quantidadeBocas, String modelo, String marca, double preco){

		super(modelo, marca, preco);
		this.id = id;
        this.quantidadeBocas = quantidadeBocas;

	}

	public int getId() {
		return id;
	}
    public int getQuantidadeBocas() {
		return quantidadeBocas;
	}
}

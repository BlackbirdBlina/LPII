package includes;

public class Eletrodomesticos {

    public String modelo;
    public String marca;
    public double preco;

    public Eletrodomesticos(String modelo, String marca, double preco){

		this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;

	}

	public String getModelo() {
		return modelo;
	}
    public String getMarca() {
		return marca;
	}
    public double getPreco() {
		return preco;
	}

}

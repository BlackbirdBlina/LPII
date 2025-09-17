package br.universidade.ecommerce;

public class PagamentoPix extends Pagamento {
    private String chavePix;

    public PagamentoPix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processar(double valor) {
       System.out.println("Pagamento no valor de: " + valor + " processado via Pix com a chave: " + chavePix);
    }
}

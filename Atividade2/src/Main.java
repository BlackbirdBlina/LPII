import br.universidade.poo.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(100.0);

        conta.depositar(100);
        conta.sacar(50);

        System.out.println("Saldo final: " + conta.getSaldo());
    }
}

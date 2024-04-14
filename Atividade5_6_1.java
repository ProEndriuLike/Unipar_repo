public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        System.out.println("Conta: " + conta.consultarNumeroConta());

        System.out.println("Saldo: R$" + conta.consultarSaldo());
        conta.depositar(500);
        System.out.println("Saldo: R$" + conta.consultarSaldo());
        conta.sacar(200);
        System.out.println("Saldo: R$" + conta.consultarSaldo());
        conta.sacar(600);

        conta.definirNumeroConta("3123-1");

        System.out.println("Conta: " + conta.consultarNumeroConta());
        System.out.println("Saldo: R$" + conta.consultarSaldo());
    }
}

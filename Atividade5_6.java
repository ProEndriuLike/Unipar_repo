public class ContaBancaria {

    private double saldo;
    private String numeroConta;

    //Requerimento 1
    public void depositar(double valor) {
        saldo = saldo + valor;
        System.out.println("Valor depositado com sucesso!");
    }

    //Requerimento 2
    public void sacar(double valor) {
        if(valor > saldo) {
            System.out.println("# ERRO #");
            System.out.println("Saldo insuficiente!");
        } else {
            saldo = saldo - valor;
            System.out.println("Valor sacado com sucesso!");
        }
    }

    //Requerimento 3
    public double consultarSaldo() {
        return saldo;
    }

    //Métodos adicionais para treino
    public ContaBancaria() {
        saldo = 0;
        numeroConta = "0000-0";
    }
    public void definirNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String consultarNumeroConta() {
        return numeroConta;
    }

}

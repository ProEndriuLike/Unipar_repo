package br.unipar;

public class ContaPoupanca extends HerancaContaBancaria{
    @Override
    public boolean saque(Double valor) {
        double verificar = saldo + 5;
        if(verificar >= valor){
            saldo -= valor;
            saldo -= 5;

            return true;
        }
        return false;
    }
}

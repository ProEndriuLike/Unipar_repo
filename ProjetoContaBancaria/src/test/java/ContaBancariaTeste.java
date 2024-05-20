import static org.junit.jupiter.api.Assertions.*;
import br.unipar.ContaCorrente;
import org.junit.jupiter.api.Test;

public class ContaBancariaTeste {

    @Test
    public void testeDepositoContaCorrente(){

        ContaCorrente conta = new ContaCorrente();
        conta.depositar(5000d);

        assertEquals(conta.obterSaldo(), 5000);
    }
    @Test
    public void testSaqueContaCorrente(){
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(3000d);
        boolean validacao = conta.saque(1500d);

        assertTrue(validacao);
        assertEquals(conta.obterSaldo(), 1500);
    }
    @Test
    public void testSaqueMaiorContaCorrente(){
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(3000d);
        boolean validacao = conta.saque(1500d);

        assertFalse(validacao);
        assertEquals(conta.obterSaldo(), 1500);
    }

    @Test
    public void testeDepositoContaPoupanca(){

        ContaCorrente conta = new ContaCorrente();
        conta.depositar(5000d);

        assertEquals(conta.obterSaldo(), 5000);
    }
    @Test
    public void testSaqueContaPoupanca(){
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(3000d);
        boolean validacao = conta.saque(1500d);

        assertTrue(validacao);
        assertEquals(conta.obterSaldo(), 1495);
    }
    @Test
    public void testSaqueMaiorContaPoupanca(){
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(1000d);
        boolean validacao = conta.saque(1500d);

        assertFalse(validacao);
        assertEquals(conta.obterSaldo(), 1000);
    }
}

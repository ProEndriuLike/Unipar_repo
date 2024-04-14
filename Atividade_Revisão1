import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade3_1 {
    public static void main(String[] args) {

        int valor1;
        int valor2;
        int valor3;
        double soma = 0;

        Scanner entrada = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Digite o primeiro valor: ");
                valor1 = entrada.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Digite um valor válido!");
                entrada.nextLine();
            }
        }
        while (true) {
            try {
                System.out.println("Digite o segundo valor: ");
                valor2 = entrada.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Digite um valor válido!");
                entrada.nextLine();
            }
        }
        while (true) {
            try {
                System.out.println("Digite o terceiro valor: ");
                valor3 = entrada.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Digite um valor válido!");
                entrada.nextLine();

            }
        }
        soma = (valor1 + valor2 + valor3);
        System.out.println("A soma dos valores é: " + soma);
    }
}

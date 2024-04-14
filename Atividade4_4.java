import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicioif_4 {
    public static void main(String[] args) {

        int numero1;
        int numero2;

        Scanner entrada = new Scanner(System.in);

        while(true) {
            try {
                System.out.println("Insira o primeiro número inteiro: ");
                numero1 = entrada.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("Insira um numero válido!");
                entrada.nextLine();
            }
        }
        while (true) {
            try {
                System.out.println("Insira o segundo número inteiro: ");
                numero2 = entrada.nextInt();
                break;
            }catch (InputMismatchException e) {
                System.out.println("Insira um número valido!");
                entrada.nextLine();
            }
        }
        if (numero1 > numero2) {
            System.out.println(numero1 + " é maior do que " + numero2);
            System.out.println(numero2 + " é menor do que " + numero1);
        } else if (numero2 > numero1) {
            System.out.println(numero2 + " é maior do que " + numero1);
            System.out.println(numero1 + " é menor do que " + numero2);
        } else {
            System.out.println("Os dois números são iguais!");
        }
        entrada.close();
    }
}

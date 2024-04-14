import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioIf_2 {
    public static void main(String[] args) {

        int numero;

        Scanner entrada = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Digite um número inteiro: ");
                numero = entrada.nextInt();
                break;
            }catch(InputMismatchException e) {
                System.out.println("Indicar um número válido!");
                entrada.nextLine();
            }
        }if (numero % 2 == 0) {
            System.out.println("O número é par!");
        }
        if (numero % 2 ==1) {
            System.out.println("O número é impar!");
        }
    }
}

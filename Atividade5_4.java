import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade5_4 {

    private static final Scanner scanner = new Scanner(System.in);
    private static final int TOTAL_NUMEROS = 20;
    private static int[] numero = new int[TOTAL_NUMEROS];
    private static int menor100 = 0;
    private static int menor200 = 0;
    private static int maior200 = 0;

    public static void main(String[] args) {
        try {
            System.out.println("Insira 20 números inteiros positivos: ");

            separarNumeros();

            System.out.println(menor100 + " números entre 0 e 100.");
            System.out.println(menor200 + " númeors entre 101 e 200.");
            System.out.println(maior200 + " números maiores que 200.");
        } finally {
            scanner.close();
        }
    }

    public static void separarNumeros() {
        for(int contador = 0; contador < TOTAL_NUMEROS; contador++) {
            System.out.println((contador + 1) + "° Número: ");
            numero[contador] = getNumero();

            if(numero[contador] <= 100) {
                menor100++;
            } else if(numero[contador] <= 200) {
                menor200++;
            } else if(numero[contador] > 200) {
                maior200++;
            }
        }
    }
    private static int getNumero() {
        while (true) {
            int numero = -1;
            try {
                numero = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                scanner.nextLine();
            }
            if(numero < 0) {
                System.out.println("Insira um número válido.");
            } if(numero >= 0) {
                return numero;
            }
        }
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade5_2 {

    private static final Scanner scanner = new Scanner(System.in);
    private static int patinhos = 0;

    public static void main(String[] args) {
        try {
            patinhos = pegarPatinhos();

            for(int contador = 1; contador < patinhos; contador++) {
                int atualPatinhos = patinhos + 1 - contador;
                if(atualPatinhos == 2) {
                    System.out.println(atualPatinhos + " patinhos foram passear, Além das montanhas Para brincar");
                    System.out.println("A mamãe gritou: Quá, quá, quá, quá. Mas só " + (atualPatinhos - 1) +" patinho voltou de lá.");
                } else {
                    System.out.println(atualPatinhos + " patinhos foram passear, Além das montanhas Para brincar");
                    System.out.println("A mamãe gritou: Quá, quá, quá, quá. Mas só " + (atualPatinhos - 1) + " patinhos voltaram de lá.");
                }
            }
            System.out.println(1 + " patinho foi passear, Além das montanhas Para brincar");
            System.out.println("A mamãe gritou: Quá, quá, quá, quá. Mas nenhum patinho voltou de lá.");
            System.out.println("A mamãe patinha foi procurar Além das montanhas Na beira do mar");
            System.out.println("A mamãe gritou: Quá, quá, quá, quá. E os " + patinhos + " patinhos voltaram de lá.");

        } finally {
            scanner.close();
        }
    }

    static int pegarPatinhos() {
        while(true) {
            try {
                System.out.println("Quantos patinhos foram passear? ");
                patinhos = scanner.nextInt();
                scanner.nextLine();
            } catch(InputMismatchException e) {
                scanner.nextLine();
            }
            if(patinhos <= 0) {
                System.out.println("Por favor, insira uma quantidade válida.");
            }
            if(patinhos > 0) {
                break;
            }
        }
        return patinhos;
    }
}

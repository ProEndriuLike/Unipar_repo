import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade5_3 {

    private static final Scanner scanner = new Scanner(System.in);
    private static int anos;
    private static int meses;
    private static int dias;
    private static int totalDias;

    public static void main(String[] args) {
        try {
            System.out.println("A seguir, digite sua idade em anos, meses e dias.");
            System.out.println("Anos: ");
            anos = getInt();
            System.out.println("Meses: ");
            meses = getInt();
            System.out.println("Dias: ");
            dias = getInt();

            totalDias = (anos * 365) + (meses * 30) + dias;

            System.out.println(anos + " anos, " + meses + " meses e " + dias + " dias = " + totalDias + " dias");
        } finally {
            scanner.close();
        }
    }

    private static int getInt() {
        while(true) {
            try {
                return scanner.nextInt();
            } catch(InputMismatchException e) {
                System.out.println("Por favor, nsira um valor válido. ");
                scanner.nextLine();
            }
        }
    }
}

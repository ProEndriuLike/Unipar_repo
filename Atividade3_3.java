import java.util.Scanner;

public class Atividade3_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double nota1;
        double nota2;
        double media;

        System.out.println("Informe a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.println("Informe a segunda nota");
        nota2 = scanner.nextDouble();

        media = (nota1 + nota2)/2;

        System.out.println("A sua média é " + media);
    }
}

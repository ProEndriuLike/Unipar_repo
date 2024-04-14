import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static int MAXIMO_CIRCULOS = 10;
    private static Circulo[] circulos = new Circulo[MAXIMO_CIRCULOS];
    private static int contadorCirculos = 0;

    public static void main(String[] args) {
        try {
            int opcao = 0;
            do {
                System.out.println("# Menu #");
                System.out.println("1 - Criar novo círculo");
                System.out.println("2 - Checar propriedades de um círculo");
                System.out.println("3 - Calcular área do círculo");
                System.out.println("4 - Calcular perímetro do círculo");
                System.out.println("5 - Sair");
                System.out.println("Insira uma opção:");
                opcao = solicitarInt();
                switch(opcao) {
                    case 1:
                        adicionar();
                        break;
                    case 2:
                        buscar();
                        break;
                    case 3:
                        calcularArea();
                        break;
                    case 4:
                        calcularPerimetro();
                        break;
                    case 5:
                        System.out.println("Programa encerrado.");
                        break;
                    default:
                        System.out.println("Insira uma opção válida.");
                }
            } while(opcao != 5);
        } finally {
            scanner.close();
        }
    }

    private static void adicionar() {
        if(contadorCirculos < MAXIMO_CIRCULOS) {
            System.out.println("Círculo - " + (contadorCirculos + 1));

            System.out.print("Raio: ");
            double raio = solicitarDouble();
            System.out.print("Cor: ");
            String cor = scanner.nextLine();

            circulos[contadorCirculos] = new Circulo(raio, cor);

            contadorCirculos++;
            System.out.println("Círculo " + (contadorCirculos) + " incluído com sucesso.");
        } else {
            System.out.println("Máximo de círculos atingido");
        }
    }

    private static void buscar() {
        if(contadorCirculos > 0) {
            System.out.print("Insira o número do círculo que quer encontrar: ");
            int opcao = solicitarInt();
            if(opcao <= contadorCirculos) {
                String cor = circulos[(opcao - 1)].getCor();
                double raio = circulos[(opcao - 1)].getRaio();

                System.out.println("Círculo - " + opcao);
                System.out.println("Raio: " + raio);
                System.out.println("Cor: " + cor);
            } else {
                System.out.println("Círculo não encontrado.");
            }
        } else {
            System.out.println("Nenhum círculo incluido");
        }
    }

    private static void calcularArea() {
        if(contadorCirculos > 0) {
            System.out.print("Insira o número do círculo que quer calcular: ");
            int opcao = solicitarInt();
            if(opcao <= contadorCirculos) {
                double raio = circulos[(opcao - 1)].getRaio();
                double area = circulos[(opcao - 1)].calcularArea();

                System.out.println("O raio deste círculo é: " + raio);
                System.out.println("Sua área é: " + area);
            } else {
                System.out.println("Círculo não encontrado.");
            }
        } else {
            System.out.println("Nenhum círculo incluido");
        }
    }

    private static void calcularPerimetro() {
        if(contadorCirculos > 0) {
            System.out.print("Insira o número do círculo que quer calcular: ");
            int opcao = solicitarInt();
            if(opcao <= contadorCirculos) {
                double raio = circulos[(opcao - 1)].getRaio();
                double perimetro = circulos[(opcao - 1)].calcularPerimetro();

                System.out.println("O raio deste círculo é: " + raio);
                System.out.println("Seu perímetro é: " + perimetro);
            } else {
                System.out.println("Círculo não encontrado.");
            }
        } else {
            System.out.println("Nenhum círculo incluido");
        }
    }

    private static int solicitarInt() {
        int inteiro = 0;
        while(true) {
            try {
                inteiro = scanner.nextInt();
                scanner.nextLine();
            } catch(InputMismatchException e) {
                scanner.nextLine();
            }
            if(inteiro <= 0) {
                System.out.println("Insira um número válido.");
            } else {
                break;
            }
        }
        return inteiro;
    }

    private static double solicitarDouble() {
        double flutuante = 0;
        while(true) {
            try {
                flutuante = scanner.nextDouble();
                scanner.nextLine();
            } catch(InputMismatchException e) {
                scanner.nextLine();
            }
            if(flutuante <= 0) {
                System.out.println("Insira um número válido.");
            } else {
                break;
            }
        }
        return flutuante;
    }
}

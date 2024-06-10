package br.unipar.sistema;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MetodosGenericos {
    static final Scanner scanner = new Scanner(System.in);

    public static String getString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public static int getInt(String mensagem) {
        int a = 0;
        while(true) {
            try {
                System.out.print(mensagem);
                a = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                scanner.nextLine();
            }
            if (a <= 0){
                System.out.println("Erro: Valor inválido. Por favor, insira um valor válido.");
            } else {
                return a;
            }
        }
    }

    public static double getDouble(String mensagem) {
        double a = 0;
        while(true) {
            try {
                System.out.print(mensagem);
                a = scanner.nextDouble();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                scanner.nextLine();
            }
            if (a <= 0){
                System.out.println("Erro: Valor inválido. Por favor, insira um valor válido.");
            } else {
                return a;
            }
        }
    }

    public static String getDataNascimento(String mensagem){
        int dia = 0;
        int mes;
        int ano;

        System.out.println(mensagem);

        do {
            mes = getInt("Mes: ");
            if (mes <= 0 || mes > 12){
                System.out.println("Insira um mês válido.");
            }
        } while (mes <= 0 || mes > 12);

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            do {
                dia = getInt("Dia: ");

                if (dia <= 0 || dia > 30) {
                    System.out.println("Insira um dia válido.");
                }
            } while (dia <= 0 || dia > 30);
        }

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            do {
                dia = getInt("Dia: ");

                if (dia <= 0 || dia > 31) {
                    System.out.println("Insira um dia válido.");
                }
            } while (dia <= 0 || dia > 31);
        }

        if (mes == 2) {
            do {
                dia = getInt("Dia: ");
                if (dia <= 0 || dia > 28){
                    System.out.println("Insira um dia válido.");
                }
            } while (dia <= 0 || dia > 28);
        }

        ano = getInt("Ano: ");

        String data = ano + "-" + mes + "-" + dia;
        return data;
    }
}


package br.unipar.sistema;
import java.util.Scanner;

import static br.unipar.sistema.MenuPrincipal.*;
import static br.unipar.sistema.MetodosGenericos.getInt;
public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {

            int menuOpcao = 0;

            do {
                exibirMenuPrincipal();
                menuOpcao = getInt("Insira uma opção: ");
                selecionarMenuPrincipal(menuOpcao);

            } while (menuOpcao != 5);


        } finally {
            scanner.close();
        }
    }
}


package br.unipar.sistema;
import static br.unipar.sistema.MetodosGenericos.getInt;
import static br.unipar.entidades.Listar.*;
import static br.unipar.sistema.MetodosGenericos.scanner;

public class MenuListar {
    public static void executarMenuListar() {
        exibirMenuListar();
        int opcao = getInt("Insira uma opção: ");
        selecionarMenuListar(opcao);
    }


    private static void exibirMenuListar(){
        System.out.println("# Listar Registros #");
        System.out.println("1 - Listar Usuários");
        System.out.println("2 - Listar Clientes");
        System.out.println("3 - Listar Produtos");
        System.out.println("4 - Listar Vendas");
        System.out.println("5 - Voltar");
    }

    private static void selecionarMenuListar(int opcao){
        switch(opcao){
            case 1:
                menuListarUsuarios();
                break;
            case 2:
                menuListarClientes();
                break;
            case 3:
                menuListarProdutos();
                break;
            case 4:
                menuListarVendas();
                break;
            case 5:
            default:
                System.out.println("Voltando ao menu principal...");
        }
    }

    private static void menuListarUsuarios() {
        System.out.println("# LISTA DE USUARIOS #");
        listarTodosUsuarios();
        System.out.print("Pressione ENTER para voltar ao menu");
        scanner.nextLine();
    }

    private static void menuListarClientes() {
        System.out.println("# LISTA DE CLIENTES #");
        listarTodosClientes();
        System.out.print("Pressione ENTER para voltar ao menu");
        scanner.nextLine();
    }

    private static void menuListarProdutos() {
        System.out.println("# LISTA DE PRODUTOS #");
        listarTodosProdutos();
        System.out.print("Pressione ENTER para voltar ao menu");
        scanner.nextLine();
    }

    private static void menuListarVendas() {
        System.out.println("# LISTA DE VENDAS #");
        listarTodasVendas();
        System.out.print("Pressione ENTER para voltar ao menu");
        scanner.nextLine();
    }
}


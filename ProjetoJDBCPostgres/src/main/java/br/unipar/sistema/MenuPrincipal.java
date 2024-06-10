package br.unipar.sistema;
import static br.unipar.sistema.MenuDeletar.executarMenuDeletar;
import static br.unipar.sistema.MenuInserir.executarMenuInserir;
import static br.unipar.sistema.MenuListar.executarMenuListar;
import static br.unipar.sistema.MenuEditar.executarMenuEditar;

public class MenuPrincipal {
    public static void exibirMenuPrincipal(){
        System.out.println("# Menu Principal #");
        System.out.println("1 - Inserir");
        System.out.println("2 - Listar");
        System.out.println("3 - Editar");
        System.out.println("4 - Deletar");
        System.out.println("5 - Sair");
    }

    public static void selecionarMenuPrincipal(int opcao){
        switch (opcao) {
            case 1:
                executarMenuInserir();
                break;
            case 2:
                executarMenuListar();
                break;
            case 3:
                executarMenuEditar();
                break;
            case 4:
                executarMenuDeletar();
                break;
            case 5:
                System.out.println("Programa encerrado!");
                break;
            default:

        }
    }
}


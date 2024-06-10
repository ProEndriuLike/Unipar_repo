package br.unipar.sistema;
import static br.unipar.sistema.MetodosGenericos.getInt;
import static br.unipar.entidades.Deletar.deletar;

public class MenuDeletar {
    public static void executarMenuDeletar() {
        exibirMenuDeletar();
        int opcao = getInt("Insira uma opção: ");
        selecionarMenuDeletar(opcao);
    }


    private static void exibirMenuDeletar(){
        System.out.println("# Deletar Registro #");
        System.out.println("1 - Deletar Usuário");
        System.out.println("2 - Deletar Cliente");
        System.out.println("3 - Deletar Produto");
        System.out.println("4 - Deletar Venda");
        System.out.println("5 - Voltar");
    }

    private static void selecionarMenuDeletar(int opcao){
        switch(opcao){
            case 1:
                menuDeletarUsuario();
                break;
            case 2:
                menuDeletarCliente();
                break;
            case 3:
                menuDeletarProduto();
                break;
            case 4:
                menuDeletarVenda();
                break;
            case 5:
            default:
                System.out.println("Voltando ao menu principal...");
        }
    }

    private static void menuDeletarUsuario() {
        String tabela = "usuarios";
        String codigo = "codigo";

        System.out.println("Insira o ID de um usuário para deletar seu registro.");
        int id = getInt("ID: ");
        deletar(tabela, codigo, id);
    }

    private static void menuDeletarCliente() {
        String tabela = "cliente";
        String codigo = "id_cliente";

        System.out.println("Insira o ID de um cliente para deletar seu registro.");
        int id = getInt("ID: ");
        deletar(tabela, codigo, id);
    }

    private static void menuDeletarProduto() {
        String tabela = "produto";
        String codigo = "id_produto";

        System.out.println("Insira o ID de um produto para deletar seu registro.");
        int id = getInt("ID: ");
        deletar(tabela, codigo, id);
    }

    private static void menuDeletarVenda() {
        String tabela = "venda";
        String codigo = "id_venda";

        System.out.println("Insira o ID de uma venda para deletar seu registro.");
        int id = getInt("ID: ");
        deletar(tabela, codigo, id);
    }
}


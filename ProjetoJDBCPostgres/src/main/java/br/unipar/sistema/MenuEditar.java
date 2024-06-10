package br.unipar.sistema;
import java.math.BigDecimal;

import static br.unipar.sistema.MetodosGenericos.*;
import static br.unipar.entidades.Editar.*;

public class MenuEditar {
    public static void executarMenuEditar() {
        exibirMenuEditar();
        int opcao = getInt("Insira uma opção: ");
        selecionarMenuEditar(opcao);
    }


    private static void exibirMenuEditar(){
        System.out.println("# Editar Registros #");
        System.out.println("1 - Editar Usuários");
        System.out.println("2 - Editar Clientes");
        System.out.println("3 - Editar Produtos");
        System.out.println("4 - Editar Vendas");
        System.out.println("5 - Voltar");
    }

    private static void selecionarMenuEditar(int opcao){
        switch(opcao){
            case 1:
                menuEditarUsuarios();
                break;
            case 2:
                menuEditarClientes();
                break;
            case 3:
                menuEditarProdutos();
                break;
            case 4:
                menuEditarVendas();
                break;
            case 5:
            default:
                System.out.println("Voltando ao menu principal...");
        }
    }

    private static void menuEditarUsuarios() {
        String tabela = "usuarios";
        String coluna = "";
        String codigo = "codigo";

        System.out.println("Insira o ID de um usuário para alterar seu registro.");
        int id = getInt("ID: ");

        System.out.println("Qual informação você deseja alterar?");
        System.out.println("1 - Username");
        System.out.println("2 - Senha");
        System.out.println("3 - Nome");
        System.out.println("4 - Data de Nascimento");

        int opcao;
        do {
            opcao = getInt("Insira uma opção: ");
            switch(opcao) {
                case 1:
                    coluna = "username";
                    String username = getString("Novo Username: ");
                    editarRegistroString(tabela, coluna, username, codigo, id);
                    break;
                case 2:
                    coluna = "password";
                    String password = getString("Nova Senha: ");
                    editarRegistroString(tabela, coluna, password, codigo, id);
                    break;
                case 3:
                    coluna = "nome";
                    String nome = getString("Novo Nome: ");
                    editarRegistroString(tabela,coluna,nome,codigo,id);
                    break;
                case 4:
                    coluna = "nascimento";
                    String data = getDataNascimento("Nova Data de Nascimento: ");
                    editarRegistroData(tabela,coluna,data,codigo,id);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while(opcao >= 5);
    }

    private static void menuEditarClientes() {
        String tabela = "cliente";
        String coluna = "";
        String codigo = "id_cliente";

        System.out.println("Insira o ID de um cliente para alterar seu registro.");
        int id = getInt("ID: ");

        System.out.println("Qual informação você deseja alterar?");
        System.out.println("1 - Nome");
        System.out.println("2 - CPF");

        int opcao;
        do {
            opcao = getInt("Insira uma opção: ");
            switch(opcao) {
                case 1:
                    coluna = "nome";
                    String nome = getString("Novo Nome: ");
                    editarRegistroString(tabela, coluna, nome, codigo, id);
                    break;
                case 2:
                    coluna = "cpf";
                    String cpf = getString("Novo CPF: ");
                    editarRegistroString(tabela, coluna, cpf, codigo, id);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while(opcao >= 3);
    }

    private static void menuEditarProdutos() {
        String tabela = "produto";
        String coluna = "";
        String codigo = "id_produto";

        System.out.println("Insira o ID de um produto para alterar seu registro.");
        int id = getInt("ID: ");

        System.out.println("Qual informação você deseja alterar?");
        System.out.println("1 - Descrição");
        System.out.println("2 - Valor");

        int opcao;
        do {
            opcao = getInt("Insira uma opção: ");
            switch(opcao) {
                case 1:
                    coluna = "descricao";
                    String descricao = getString("Nova Descrição: ");
                    editarRegistroString(tabela, coluna, descricao, codigo, id);
                    break;
                case 2:
                    coluna = "valor";
                    BigDecimal valor = BigDecimal.valueOf(getDouble("Novo valor: "));
                    editarRegistroValor(tabela, coluna, valor, codigo, id);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while(opcao >= 3);
    }

    private static void menuEditarVendas() {
        String tabela = "venda";
        String coluna = "";
        String codigo = "id_venda";

        System.out.println("Insira o ID de uma venda para alterar seu registro.");
        int id = getInt("ID: ");

        System.out.println("Qual informação você deseja alterar?");
        System.out.println("1 - Cliente");
        System.out.println("2 - Produto");

        int opcao;
        do {
            opcao = getInt("Insira uma opção: ");
            switch(opcao) {
                case 1:
                    coluna = "cliente";
                    int idCliente = getInt("ID do Cliente: ");
                    editarRegistroInt(tabela, coluna, idCliente, codigo, id);
                    break;
                case 2:
                    coluna = "produto";
                    int idProduto = getInt("ID do Produto: ");
                    editarRegistroInt(tabela, coluna, idProduto, codigo, id);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while(opcao >= 3);
    }
}


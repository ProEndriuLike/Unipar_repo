package br.unipar.sistema;
import java.math.BigDecimal;

import static br.unipar.entidades.Inserir.*;
import static br.unipar.sistema.MetodosGenericos.*;

public class MenuInserir {
    public static void executarMenuInserir() {
        exibirMenuInserir();
        int opcao = getInt("Insira uma opção: ");
        selecionarMenuInserir(opcao);
    }


    private static void exibirMenuInserir(){
        System.out.println("# Inserir Registro #");
        System.out.println("1 - Inserir Usuário");
        System.out.println("2 - Inserir Cliente");
        System.out.println("3 - Inserir Produto");
        System.out.println("4 - Inserir Venda");
        System.out.println("5 - Voltar");
    }

    private static void selecionarMenuInserir(int opcao){
        switch(opcao){
            case 1:
                menuInserirUsuario();
                break;
            case 2:
                menuInserirCliente();
                break;
            case 3:
                menuInserirProduto();
                break;
            case 4:
                menuInserirVenda();
                break;
            case 5:
            default:
                System.out.println("Voltando ao menu principal...");
        }
    }

    private static void menuInserirUsuario() {
        System.out.println("Insira as informações do usuário.");
        String username = getString("Username: ");
        String senha = getString("Senha: ");
        String nome = getString("Nome: ");
        String dataNascimento = getDataNascimento("Data de Nascimento");

        inserirUsuario(username,senha,nome,dataNascimento);
    }

    private static void menuInserirCliente() {
        System.out.println("Insira as informações do cliente.");

        int id = getInt("ID (confira em 'Listar Clientes' para não utilizar um id repetido): ");

        String nome = getString("Nome: ");

        String cpf = "";
        do {
            cpf = getString("CPF: ");
            if (cpf.length() < 1 || cpf.length() > 15) {
                System.out.println("Insira um CPF válido.");
            }
        } while (cpf.length() < 1 || cpf.length() > 15);

        inserirCliente(id, nome,cpf);
    }

    private static void menuInserirProduto() {
        System.out.println("Insira as informações do produto.");

        int id = getInt("ID (confira em 'Listar Produtos' para não utilizar um id repetido): ");

        String nome = getString("Nome: ");

        BigDecimal valor = BigDecimal.valueOf(getDouble("Valor: "));

        inserirProduto(id, nome,valor);
    }

    private static void menuInserirVenda() {
        System.out.println("Insira as informações da venda.");

        int idVenda = getInt("ID da Venda(confira em 'Listar Vendas' para não utilizar um id repetido): ");

        int idCliente = getInt("ID do Cliente: ");
        int idProduto = getInt("ID do Produto: ");

        inserirVenda(idVenda, idCliente, idProduto);
    }
}


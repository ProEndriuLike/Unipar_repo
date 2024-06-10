package br.unipar.entidades;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static br.unipar.entidades.Conexao.connection;

public class Listar {
    public static void listarTodosUsuarios() {
        try {
            Connection conn = connection();

            Statement statement = conn.createStatement();

            ResultSet result = statement.executeQuery("SELECT * FROM usuarios");

            while (result.next()) {
                System.out.println("ID: " + result.getInt("codigo"));
                System.out.println("Username: " + result.getString("username"));
                System.out.println("---");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void listarTodosClientes() {
        try {
            Connection conn = connection();

            Statement statement = conn.createStatement();

            ResultSet result = statement.executeQuery("SELECT * FROM cliente");

            while (result.next()) {
                System.out.println("ID: " + result.getInt("id_cliente"));
                System.out.println("Nome: " + result.getString("nome"));
                System.out.println("CPF: " + result.getString("cpf"));
                System.out.println("---");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void listarTodosProdutos() {
        try {
            Connection conn = connection();

            Statement statement = conn.createStatement();

            ResultSet result = statement.executeQuery("SELECT * FROM produto");

            while (result.next()) {
                System.out.println("ID: " + result.getInt("id_produto"));
                System.out.println("Descrição: " + result.getString("descricao"));
                System.out.println("Valor: " + result.getString("valor"));
                System.out.println("---");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void listarTodasVendas() {
        try {
            Connection conn = connection();

            Statement statement = conn.createStatement();

            ResultSet result = statement.executeQuery("SELECT DISTINCT v.id_venda, p.descricao, c.nome " +
                    "FROM venda v, produto p, cliente c " +
                    "WHERE v.produto = p.id_produto " +
                    "AND v.cliente = c.id_cliente");

            while (result.next()) {
                System.out.println("ID: " + result.getInt("id_venda"));
                System.out.println("Cliente: " + result.getString("nome"));
                System.out.println("Produto: " + result.getString("descricao"));
                System.out.println("---");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}


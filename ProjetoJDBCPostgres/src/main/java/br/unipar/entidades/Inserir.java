package br.unipar.entidades;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static br.unipar.entidades.Conexao.connection;

public class Inserir {
    public static void inserirUsuario(String username, String password, String nome, String dataNascimento) {
        try {
            Connection conn = connection();

            PreparedStatement preparedStatement = conn.prepareStatement(
                    "INSERT INTO usuarios (username, password, nome, nascimento)"
                            + "VALUES (?,?,?,?)");

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, nome);
            preparedStatement.setDate(4, java.sql.Date.valueOf(dataNascimento));
            preparedStatement.executeUpdate();

            System.out.println("Usuário inserido!");

        } catch (SQLException e) {
            System.out.println("Erro encontrado. Informação não inserida.");
        }
    }

    public static void inserirCliente(int id, String nome, String cpf) {
        try {
            Connection conn = connection();

            PreparedStatement preparedStatement = conn.prepareStatement(
                    "INSERT INTO cliente (id_cliente, nome, cpf)"
                            + "VALUES (?,?,?)");

            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, nome);
            preparedStatement.setString(3, cpf);
            preparedStatement.executeUpdate();

            System.out.println("Cliente inserido!");

        } catch (SQLException e) {
            System.out.println("Erro encontrado. Informação não inserida.");
        }
    }

    public static void inserirProduto(int idProduto, String descricao, BigDecimal valor) {
        try {
            Connection conn = connection();

            PreparedStatement preparedStatement = conn.prepareStatement(
                    "INSERT INTO produto (id_produto,descricao,valor)"
                            + "VALUES (?,?,?)");

            preparedStatement.setInt(1, idProduto);
            preparedStatement.setString(2, descricao);
            preparedStatement.setBigDecimal(3, valor);
            preparedStatement.executeUpdate();

            System.out.println("Produto inserido!");

        } catch (SQLException e) {
            System.out.println("Erro encontrado. Informação não inserida.");
        }
    }

    public static void inserirVenda(int idVenda, int idCliente, int idProduto) {
        try {
            Connection conn = connection();

            PreparedStatement preparedStatement = conn.prepareStatement(
                    "INSERT INTO venda (id_venda,cliente,produto)"
                            + "VALUES (?,?,?)");

            preparedStatement.setInt(1, idVenda);
            preparedStatement.setInt(2, idCliente);
            preparedStatement.setInt(3, idProduto);
            preparedStatement.executeUpdate();

            System.out.println("Venda realizada!");

        } catch (SQLException e) {
            System.out.println("Erro encontrado. Informação não inserida.");
        }
    }
}


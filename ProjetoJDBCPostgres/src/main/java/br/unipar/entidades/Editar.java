package br.unipar.entidades;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static br.unipar.entidades.Conexao.connection;

public class Editar {
    public static void editarRegistroString(String tabela, String coluna, String novoValor, String codigo, int id) {
        try {
            Connection connect = connection();// inicia conexão com o banco de dados

            PreparedStatement prepared = connect.prepareStatement("UPDATE  " + tabela +
                    "    SET " +  coluna + " = ? " +
                    "    WHERE " + codigo + " = ?"
            );

            prepared.setString(1, novoValor);
            prepared.setInt(2, id);
            prepared.executeUpdate();

            System.out.println("Alterado!");

        } catch (SQLException e) {
            System.out.println("Erro encontrado. Informação não inserida.");
        }
    }

    public static void editarRegistroInt(String tabela, String coluna, int novoValor, String codigo, int id) {
        try {
            Connection connect = connection();// inicia conexão com o banco de dados

            PreparedStatement prepared = connect.prepareStatement("UPDATE  " + tabela +
                    "    SET " +  coluna + " = ? " +
                    "    WHERE " + codigo + " = ?"
            );

            prepared.setInt(1, novoValor);
            prepared.setInt(2, id);
            prepared.executeUpdate();

            System.out.println("Alterado!");

        } catch (SQLException e) {
            System.out.println("Erro encontrado. Informação não inserida.");
        }
    }

    public static void editarRegistroValor(String tabela, String coluna, BigDecimal novoValor, String codigo, int id) {
        try {
            Connection connect = connection();// inicia conexão com o banco de dados

            PreparedStatement prepared = connect.prepareStatement("UPDATE  " + tabela +
                    "    SET " +  coluna + " = ? " +
                    "    WHERE " + codigo + " = ?"
            );

            prepared.setBigDecimal(1, novoValor);
            prepared.setInt(2, id);
            prepared.executeUpdate();

            System.out.println("Alterado!");

        } catch (SQLException e) {
            System.out.println("Erro encontrado. Informação não inserida.");
        }
    }

    public static void editarRegistroData(String tabela, String coluna, String novoValor, String codigo, int id) {
        try {
            Connection connect = connection();// inicia conexão com o banco de dados

            PreparedStatement prepared = connect.prepareStatement("UPDATE  " + tabela +
                    "    SET " +  coluna + " = ? " +
                    "    WHERE " + codigo + " = ?"
            );

            prepared.setDate(1, java.sql.Date.valueOf(novoValor));
            prepared.setInt(2, id);
            prepared.executeUpdate();

            System.out.println("Alterado!");

        } catch (SQLException e) {
            System.out.println("Erro encontrado. Informação não inserida.");
        }
    }
}


package br.unipar.entidades;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static br.unipar.entidades.Conexao.connection;

public class Deletar {
    public static void deletar(String tabela, String codigo, int id) {
        try {
            Connection connect = connection();

            PreparedStatement prepared = connect.prepareStatement("DELETE " +
                    " FROM " + tabela +
                    " WHERE " + codigo + " = ?"
            );

            prepared.setInt(1, id);
            prepared.executeUpdate();

            System.out.println("Registro deletado!");

        } catch (SQLException e) {
            System.out.println("Erro encontrado. Nenhum registro foi deletado.");
        }
    }
}


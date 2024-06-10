package br.unipar;

import java.sql.*;

public class Main {

    private static final String url = "jdbc:postgresql://localhost:5432/exemplo1";
    private static final String user = "postgres";
    private static final String password = "admin123";

    public static void main(String[] args) {

        inserirUsuario("Taffe2", "12345", "Fabio", "1890-01-01");
        listarTodosUsuarios();
    }

    public static Connection connection() throws SQLException {

        //localhost -> Onde está o banco;
        //5432 -> porta padrâo do banco;
        return DriverManager.getConnection(url, user, password);
    }

    public static void criarTabelaUsuario() {

        try {
            Connection conn = connection();
            Statement statement = conn.createStatement();
            String sql = " CREATE TABLE IF NOT EXISTs usuarios ( "
                    + " codigo SERIAL PRIMARY KEY, "
                    + " username VARCHAR(50) UNIQUE NOT NULL, "
                    + " password VARCHAR(300) NOT NULL, "
                    + " nome VARCHAR(50) NOT NULL, "
                    + " nascimento DATE )";

            statement.executeUpdate(sql);

            System.out.println("TABELA CRIADA");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void inserirUsuario(String username, String password, String nome, String dataNascimento){
        try {
            Connection conn = connection();
            PreparedStatement preparedStatement = conn.prepareStatement(
                    "INSERT INTO usuarios (username, password, nome, nascimento)"
                    + " values (?, ?, ?, ?)");

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, nome);
            preparedStatement.setDate(4, java.sql.Date.valueOf(dataNascimento));

            preparedStatement.executeUpdate();

            System.out.println("Usúario criado");;

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void listarTodosUsuarios(){
        try {
            Connection conn = connection();

            Statement statement = conn.createStatement();

            ResultSet result = statement.executeQuery("SELECT * FROM usuarios");

            while (result.next()){

                System.out.println(result.getInt("codigo"));
                System.out.println(result.getString("username"));
            }

        }catch (SQLException e) {
            throw new RuntimeException();
        }
    }
}

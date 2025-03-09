package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String URL = "jdbc:mysql://localhost:3306/carteira_bd";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private static Connection con = null;

    public static Connection getConexao() {
        try {
            if (con == null || con.isClosed()) {
                // Carrega o driver manualmente (ajuda a evitar erros de driver não encontrado)
                Class.forName("com.mysql.cj.jdbc.Driver");

                con = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Conexão estabelecida com sucesso!");
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Driver JDBC do MySQL não encontrado!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados!");
            e.printStackTrace();
        }
        return con;
    }
}

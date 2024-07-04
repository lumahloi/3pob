package av2pob;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private String BDUrl = "jdbc:mysql://localhost:3306/clientela";
    private String BDUser = "root";
    private String BDSenha = "admin";

    public Connection obterConexao() {
        try {
            Connection con = DriverManager.getConnection(BDUrl, BDUser, BDSenha);
            return con;
        } catch (SQLException exception) {
            System.out.println("Ocorreu um erro: " + exception);
            return null;
        }
    }
}
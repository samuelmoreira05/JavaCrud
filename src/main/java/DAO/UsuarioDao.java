package DAO;
import Model.Usuario;
import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class UsuarioDao {

    public void cadastrarUsuario(Usuario Usuario){

        String sql = "INSERT INTO USUARIOS (NOME, EMAIL, CPF, SENHA_HASH) VALUES (?, ?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);

            ps.setString(1, Usuario.getNome());
            ps.setString(2, Usuario.getEmail());
            ps.setInt(3, Usuario.getCpf());
            ps.setInt(4, Usuario.getSenha_hash());

            ps.execute();
            ps.close();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}

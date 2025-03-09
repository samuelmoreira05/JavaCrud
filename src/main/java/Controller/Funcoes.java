package Controller;
import DAO.UsuarioDao;
import Model.Usuario;

import java.util.Scanner;

public class Funcoes {

    public static class Funcao{
        private final Scanner scanner;
        private final UsuarioDao usuarioDao;

        public Funcao(){
            this.scanner = new Scanner(System.in);
            this.usuarioDao = new UsuarioDao();
        }

        public void cadastroNovo(){
            Usuario usuario = new Usuario();
            System.out.print("\u001b[2J\u001b[H");

            System.out.printf("Nome: ");
            usuario.setNome(scanner.next());

            System.out.printf("Email: ");
            usuario.setEmail(scanner.next());

            System.out.printf("Cpf: ");
            usuario.setCpf(scanner.nextInt());

            System.out.printf("Senha: ");
            usuario.setSenha_hash(scanner.nextInt());

            usuarioDao.cadastrarUsuario(usuario);
        }
        public void excluirUsuario() {
            System.out.print("\u001b[2J\u001b[H");

            System.out.printf("Digite o ID do usuário a ser excluído: ");
            int id = scanner.nextInt();

            boolean sucesso = usuarioDao.excluirUsuario(id);

            if (sucesso) {
                System.out.println("Usuário excluído com sucesso.");
            } else {
                System.out.println("Erro ao excluir usuário. Verifique se o ID está correto.");
            }
        }
    }
}




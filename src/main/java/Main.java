import java.util.Scanner;
import Controller.Funcoes;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Funcoes.Funcao funcoes = new Funcoes.Funcao();

        funcoes.cadastroNovo();
        scanner.close();
    }
}

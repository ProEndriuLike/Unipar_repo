import java.util.Scanner;

public class ExercicioIf_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String usuario;
        String senha;

        try {
            System.out.println("Insira seu nome de usuário: ");
            usuario = entrada.nextLine();
            System.out.println("Digite sua senha: ");
            senha = entrada.nextLine();

            if (usuario.equals("usuario") && senha.equals("senha123")) {
                System.out.println("Login efetuado com sucesso!");
            } else {
                System.out.println("Nome de usuario ou senha incorretos!");
            }
        } finally {
            entrada.close();
        }
    }
}

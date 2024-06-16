import java.util.Scanner;

public class VerificaSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome de usuário:");
        String nomeUsuario = scanner.nextLine();

        System.out.println("Digite sua senha:");
        String senha = scanner.nextLine();

        // Enquanto a senha for igual ao nome de usuário, pedir novamente a senha
        while (senha.equals(nomeUsuario)) {
            System.out.println("A senha não pode ser igual ao nome de usuário. Tente novamente.");
            System.out.println("Digite sua senha:");
            senha = scanner.nextLine();
        }

        System.out.println("Cadastro realizado com sucesso!");
    }
}

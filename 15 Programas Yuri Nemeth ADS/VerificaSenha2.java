import java.util.Scanner;

public class VerificaSenha2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definindo a senha correta
        int[] senhaCorreta = {1, 2, 3, 4};
        
        // Solicitando a senha ao usuário
        System.out.println("Digite a senha (4 números inteiros separados por espaço):");
        int[] senhaDigitada = new int[4];
        
        // Lendo a senha digitada pelo usuário
        for (int i = 0; i < 4; i++) {
            senhaDigitada[i] = scanner.nextInt();
        }
        
        // Verificando se a senha está correta
        while (!verificarSenha(senhaDigitada, senhaCorreta)) {
            System.out.println("Senha incorreta. Digite novamente:");
            for (int i = 0; i < 4; i++) {
                senhaDigitada[i] = scanner.nextInt();
            }
        }
        
        System.out.println("Senha correta!");
        
        scanner.close();
    }
    
    // Método para verificar se a senha digitada está correta
    private static boolean verificarSenha(int[] senhaDigitada, int[] senhaCorreta) {
        for (int i = 0; i < 4; i++) {
            if (senhaDigitada[i] != senhaCorreta[i]) {
                return false;
            }
        }
        return true;
    }
}

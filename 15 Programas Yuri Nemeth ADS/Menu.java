import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int opcao;
        
        do {
            // Mostra o menu
            System.out.println("Menu:");
            System.out.println("1. Opção 1");
            System.out.println("2. Opção 2");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            // Lê a opção do usuário
            opcao = scanner.nextInt();
            
            // Verifica se a opção é válida
            if (opcao != 1 && opcao != 2 && opcao != 0) {
                System.out.println("Opção inválida. Por favor, selecione 1, 2 ou 0.");
            }
            
        } while (opcao != 0);
        
        System.out.println("Programa encerrado.");
        
        scanner.close();
    }
}

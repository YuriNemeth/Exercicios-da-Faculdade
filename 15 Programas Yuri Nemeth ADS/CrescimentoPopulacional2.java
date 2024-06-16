import java.util.Scanner;

public class CrescimentoPopulacional2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char continuar;
        
        do {
            // Solicitação das populações e taxas de crescimento
            System.out.println("Digite a população do país A:");
            int populacaoA = validaEntradaInteira(scanner);
            
            System.out.println("Digite a taxa de crescimento do país A (em decimal, por exemplo, 0.03 para 3%):");
            double taxaCrescimentoA = validaEntradaDouble(scanner);
            
            System.out.println("Digite a população do país B:");
            int populacaoB = validaEntradaInteira(scanner);
            
            System.out.println("Digite a taxa de crescimento do país B (em decimal, por exemplo, 0.015 para 1.5%):");
            double taxaCrescimentoB = validaEntradaDouble(scanner);
            
            int anos = 0;

            // Loop para calcular o número de anos necessários
            while (populacaoA < populacaoB) {
                populacaoA += (int) (populacaoA * taxaCrescimentoA);
                populacaoB += (int) (populacaoB * taxaCrescimentoB);
                anos++;
            }

            // Exibindo o resultado
            System.out.println("Número de anos necessários: " + anos);
            System.out.println("População de A: " + populacaoA);
            System.out.println("População de B: " + populacaoB);
            
            // Pergunta se deseja repetir a operação
            System.out.println("Deseja calcular novamente? (s/n)");
            continuar = scanner.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');
        
        scanner.close();
    }
    
    // Método para validar entrada de inteiros
    private static int validaEntradaInteira(Scanner scanner) {
        int valor;
        while (true) {
            try {
                valor = Integer.parseInt(scanner.next());
                if (valor < 0) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um valor inteiro positivo válido.");
            }
        }
        return valor;
    }
    
    // Método para validar entrada de números decimais
    private static double validaEntradaDouble(Scanner scanner) {
        double valor;
        while (true) {
            try {
                valor = Double.parseDouble(scanner.next());
                if (valor < 0) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um valor decimal positivo válido.");
            }
        }
        return valor;
    }
}

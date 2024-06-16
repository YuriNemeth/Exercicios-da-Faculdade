import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contador = 1;
        int maior = Integer.MIN_VALUE; // Inicializa o maior número com o menor valor possível para int
        
        while (contador <= 5) {
            System.out.print("Digite o número " + contador + ": ");
            int numero = scanner.nextInt();
            
            // Verifica se o número atual é maior que o maior número encontrado até agora
            if (numero > maior) {
                maior = numero;
            }
            
            contador++;
        }
        
        System.out.println("O maior número digitado é: " + maior);
        
        scanner.close();
    }
}

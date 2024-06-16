import java.util.Scanner;

public class SomaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contador = 1;
        int soma = 0;
        
        while (contador <= 5) {
            System.out.print("Digite o número " + contador + ": ");
            int numero = scanner.nextInt();
            
            soma += numero; // Adiciona o número à soma
            
            contador++;
        }
        
        double media = (double) soma / 5; // Calcula a média
        
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
        
        scanner.close();
    }
}

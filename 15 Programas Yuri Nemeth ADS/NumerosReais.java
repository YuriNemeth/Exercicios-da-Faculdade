import java.util.Scanner;

public class NumerosReais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int quantidadeNumeros = 0;
        double soma = 0;
        
        System.out.println("Digite números reais maiores que zero (digite 0 para encerrar):");
        
        double numero = scanner.nextDouble();
        
        // Verifica se o número é zero para encerrar ou se é maior que zero para processar
        while (numero != 0) {
            if (numero > 0) {
                quantidadeNumeros++;
                soma += numero;
            } else {
                System.out.println("Número inválido. Digite novamente.");
            }
            
            numero = scanner.nextDouble();
        }
        
        // Verifica se pelo menos um número foi inserido
        if (quantidadeNumeros > 0) {
            double media = soma / quantidadeNumeros;
            System.out.println("Total de números inseridos: " + quantidadeNumeros);
            System.out.println("Média dos números: " + media);
        } else {
            System.out.println("Nenhum número válido foi inserido.");
        }
        
        scanner.close();
    }
}

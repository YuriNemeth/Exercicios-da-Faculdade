import java.util.Scanner;

public class NumerosIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita os números inteiros
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();
        
        // Determina o menor e o maior número do intervalo
        int menor = Math.min(numero1, numero2);
        int maior = Math.max(numero1, numero2);
        
        // Imprime os números no intervalo
        System.out.println("Números no intervalo entre " + menor + " e " + maior + ":");
        int atual = menor;
        while (atual <= maior) {
            System.out.println(atual);
            atual++;
        }
        
        scanner.close();
    }
}

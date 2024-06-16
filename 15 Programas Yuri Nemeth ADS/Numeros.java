import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        // Imprimindo os números um abaixo do outro
        System.out.println("Imprimindo os números um abaixo do outro:");
        int numero = 1;
        while (numero <= 20) {
            System.out.println(numero);
            numero++;
        }
        
        // Imprimindo os números um ao lado do outro
        System.out.println("\nImprimindo os números um ao lado do outro:");
        numero = 1; // Reinicializando o número
        while (numero <= 20) {
            System.out.print(numero + " ");
            numero++;
        }
    }
}

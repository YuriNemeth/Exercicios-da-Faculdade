import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        int numero = 1;
        
        System.out.println("Números ímpares entre 1 e 50:");
        
        while (numero <= 50) {
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }
}

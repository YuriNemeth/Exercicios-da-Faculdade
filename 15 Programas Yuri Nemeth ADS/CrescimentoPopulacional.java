import java.util.Scanner;
public class CrescimentoPopulacional {
    public static void main(String[] args) {
        int populacaoA = 80000;
        double taxaCrescimentoA = 0.03; // 3% ao ano
        int populacaoB = 200000;
        double taxaCrescimentoB = 0.015; // 1.5% ao ano
        int anos = 0;

        // Loop para calcular o número de anos necessários
        while (populacaoA < populacaoB) {
            populacaoA += (int) (populacaoA * taxaCrescimentoA);
            populacaoB += (int) (populacaoB * taxaCrescimentoB);
            anos++;
        }

        System.out.println("Número de anos necessários: " + anos);
        System.out.println("População de A: " + populacaoA);
        System.out.println("População de B: " + populacaoB);
    }
}

import java.util.Scanner;

public class VerificaNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop para garantir que a nota esteja dentro do intervalo de 0 a 10
        double nota;
        do {
            System.out.println("Digite a nota (entre 0 e 10):");
            nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido! A nota deve estar entre 0 e 10.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota válida: " + nota);
    }
}

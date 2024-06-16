import java.util.Scanner;

public class UrnaDosHerois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializando contadores de votos
        int[] votosCandidatos = new int[5]; // Índices 0 a 4 representam os candidatos de 1 a 5
        int votosNulos = 0;
        int votosBrancos = 0;
        int totalVotos = 0;

        // Simulando votação
        System.out.println("Bem-vindo à urna eletrônica!");
        System.out.println("Opções de voto:");
        System.out.println("Candidato 01. Spiderman");
        System.out.println("Candidato 02. Superman");
        System.out.println("Candidato 03. WonderWoman");
        System.out.println("Candidato 04. Ironman");
        System.out.println("Candidato 05. Captain America");
        System.out.println("Voto Nulo 06");
        System.out.println("Voto Branco 07");
        System.out.println("Para encerrar a votação, digite 00.");

        int voto;
        while (true) {
            System.out.print("Entre com o seu voto: ");
            voto = scanner.nextInt();

            if (voto == 00) {
                break; // Encerra a votação se o voto for 00
            } else if (voto >= 1 && voto <= 5) {
                // Contabiliza votos para os candidatos
                votosCandidatos[voto - 1]++;
            } else if (voto == 6) {
                // Contabiliza voto nulo
                votosNulos++;
            } else if (voto == 7) {
                // Contabiliza voto branco
                votosBrancos++;
            } else {
                System.out.println("Voto inválido. Por favor, digite um número válido.");
            }

            totalVotos++;
        }

        // Exibindo resultados
        System.out.println("\nResultados da votação:");
        for (int i = 0; i < votosCandidatos.length; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + votosCandidatos[i] + " votos");
        }
        System.out.println("Votos Nulos: " + votosNulos);
        System.out.println("Votos Brancos: " + votosBrancos);
        System.out.println("Total de votos: " + totalVotos);

        // Calculando porcentagens
        double porcentagemNulos = (double) votosNulos / totalVotos * 100;
        double porcentagemBrancos = (double) votosBrancos / totalVotos * 100;

        System.out.printf("Porcentagem de votos nulos: %.2f%%\n", porcentagemNulos);
        System.out.printf("Porcentagem de votos brancos: %.2f%%\n", porcentagemBrancos);

        // Encontrando o candidato vencedor
        int maiorVotos = 0;
        int candidatoVencedor = -1;
        for (int i = 0; i < votosCandidatos.length; i++) {
            if (votosCandidatos[i] > maiorVotos) {
                maiorVotos = votosCandidatos[i];
                candidatoVencedor = i + 1;
            }
        }

        if (candidatoVencedor != -1) {
            System.out.println("O candidato vencedor é o Candidato " + candidatoVencedor + ".");
        } else {
            System.out.println("Não houve um candidato vencedor.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class ValidaInformacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        char sexo;
        char estadoCivil;

        // Validação das informações
        do {
            System.out.println("Digite seu nome (maior que 3 caracteres):");
            nome = scanner.nextLine();
        } while (nome.length() <= 3);

        do {
            System.out.println("Digite sua idade (entre 0 e 150):");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);

        do {
            System.out.println("Digite seu salário (maior que zero):");
            salario = scanner.nextDouble();
        } while (salario <= 0);

        do {
            System.out.println("Digite seu sexo ('f' ou 'm'):");
            sexo = scanner.next().charAt(0);
        } while (sexo != 'f' && sexo != 'm');

        do {
            System.out.println("Digite seu estado civil ('s', 'c', 'v', 'd'):");
            estadoCivil = scanner.next().charAt(0);
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');

        // Exibindo as informações validadas
        System.out.println("Informações validadas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);
    }
}

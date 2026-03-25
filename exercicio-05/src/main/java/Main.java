import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        double valorPlano;

        if (idade <= 10) {
            valorPlano = 30.00;
        } else if (idade <= 29) {
            valorPlano = 60.00;
        } else if (idade <= 45) {
            valorPlano = 120.00;
        } else if (idade <= 59) {
            valorPlano = 150.00;
        } else if (idade <= 65) {
            valorPlano = 250.00;
        } else {
            valorPlano = 400.00;
        }

        System.out.printf("%s deverá pagar: R$ %.2f%n", nome, valorPlano);

        scanner.close();
    }
}

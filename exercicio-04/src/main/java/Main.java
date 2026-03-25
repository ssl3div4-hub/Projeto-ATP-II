import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Classe eleitoral: Não-eleitor");
        } else if (idade >= 18 && idade <= 65) {
            System.out.println("Classe eleitoral: Eleitor obrigatório");
        } else {
            System.out.println("Classe eleitoral: Eleitor facultativo");
        }

        scanner.close();
    }
}

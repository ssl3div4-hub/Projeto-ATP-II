import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de compra do produto: R$ ");
        double valorCompra = scanner.nextDouble();

        double percentualLucro = (valorCompra < 20.0) ? 0.45 : 0.30;
        double valorVenda = valorCompra * (1 + percentualLucro);

        System.out.printf("Valor de venda: R$ %.2f%n", valorVenda);

        scanner.close();
    }
}

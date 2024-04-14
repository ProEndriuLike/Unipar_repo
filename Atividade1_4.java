import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeDoProduto;
        String categoriaDoProduto;
        double precoUnitarioProduto;
        int quantidadeEstoque;

        try {
            System.out.println("# Cadastro de produtos #");
            System.out.println("Digite o nome do produto: ");
            nomeDoProduto = scanner.nextLine();
            System.out.println("Digite a categoria do produto: ");
            categoriaDoProduto = scanner.nextLine();
            System.out.println("Digite o preçõ da unidade do produto: ");
            while (true) {
                try {
                    precoUnitarioProduto = scanner.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, insira um valor válido.");
                    scanner.nextLine();
                }
            }
            System.out.println("Digite a quantidade em estoque do produto: ");
            while (true) {
                try {
                    quantidadeEstoque = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, insira uma quantidade válida.");
                    scanner.nextLine();
                }
            }

            System.out.println("Produto #1");
            System.out.println("Nome: " + nomeDoProduto);
            System.out.println("Categoria: " + categoriaDoProduto);
            System.out.println("Preço: " + precoUnitarioProduto);
            System.out.println("Estoque: " + quantidadeEstoque);
        } finally {
            scanner.close();
        }
    }
}

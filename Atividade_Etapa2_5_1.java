import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    private static final int MAXIMO_PRODUTOS = 10;
    private static Produto[] produtos = new Produto[MAXIMO_PRODUTOS];
    private static int contadorProdutos = 0;
    public static void main(String[] args) {
        try {
            int opcao = 0;
            do {
                System.out.println("# Menu #");
                System.out.println("1 - Adicionar um novo produto");
                System.out.println("2 - Exibir os detalhes de um produto");
                System.out.println("3 - Sair");
                opcao = solicitarInt();
                switch (opcao) {
                    case 1:
                        adicionar();
                        break;
                    case 2:
                        exibir();
                        break;
                    case 3:
                        System.out.println("Programa encerrado.");
                        break;
                    default:
                        System.out.println("Insira uma opção válida.");
                }
            } while(opcao != 3);
        } finally {
            scanner.close();
        }
    }

    private static void adicionar() {
        if(contadorProdutos < MAXIMO_PRODUTOS) {

            System.out.println("# Cadastro de Produtos #");

            System.out.println("Nome: ");
            String nome = scanner.nextLine();

            boolean encontrado = false;
            for(int i = 0; i < contadorProdutos; i++) {
                if(produtos[i].getNome().equalsIgnoreCase(nome)) {
                    encontrado = true;
                    break;
                }
            }

            if(!encontrado) {
                boolean incluiPreco = false;
                boolean incluiEstoque = false;
                double preco = 0;
                int quantidadeEmEstoque = 0;
                System.out.println("Deseja incluir o preço?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                int opcao = solicitarInt();
                if(opcao == 1) {
                    incluiPreco = true;
                    System.out.print("Preço: ");
                    preco = solicitarDouble();
                    System.out.println("Deseja incluir a quantidade em estoque?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Não");
                    opcao = solicitarInt();
                    if(opcao == 1) {
                        incluiEstoque = true;
                        System.out.print("Quantidade em estoque: ");
                        quantidadeEmEstoque = solicitarInt();
                    }
                }

                if(!incluiPreco && !incluiEstoque) {
                    produtos[contadorProdutos] = new Produto(nome);
                } else if(incluiPreco && !incluiEstoque) {
                    produtos[contadorProdutos] = new Produto(nome, preco);
                } else if(incluiPreco && incluiEstoque) {
                    produtos[contadorProdutos] = new Produto(nome, preco, quantidadeEmEstoque);
                }

                contadorProdutos++;
            } else {
                System.out.println("Produdo com este nome já cadastrado.");
            }
        } else {
            System.out.println("Máximo de produtos atingido.");
        }
    }

    private static void exibir() {

        if(contadorProdutos > 0) {
            System.out.println("Insira o nome do produto que deseja visualizar: ");
            String nome = scanner.nextLine();

            boolean encontrado = false;
            for(int i = 0; i < contadorProdutos; i++) {
                if(produtos[i].getNome().equalsIgnoreCase(nome)) {
                    System.out.println("Nome: " + produtos[i].getNome());
                    System.out.println("Preço: R$" + produtos[i].getPreco());
                    System.out.println("Quantidade em Estoque: " + produtos[i].getQuantidadeEmEstoque());
                    encontrado = true;
                    break;
                }
            }
            if(!encontrado){
                System.out.println("Produto não encontrado.");
            }
        } else {
            System.out.println("Não há produtos cadastrados.");
        }
    }

    private static int solicitarInt() {
        int inteiro = 0;
        while (true) {
            try {
                inteiro = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                scanner.nextLine();
            }
            if (inteiro <= 0) {
                System.out.println("Insira um número válido.");
            } else {
                break;
            }
        }
        return inteiro;
    }

    private static double solicitarDouble() {
        double flutuante = 0;
        while (true) {
            try {
                flutuante = scanner.nextDouble();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                scanner.nextLine();
            }
            if (flutuante <= 0) {
                System.out.println("Insira um número válido.");
            } else {
                break;
            }
        }
        return flutuante;
    }
}

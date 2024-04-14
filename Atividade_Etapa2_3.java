import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static int menu = 0;
    private static final int TOTAL_PRODUTOS = 10;
    private static Produto[] produto = new Produto[TOTAL_PRODUTOS];
    private static int contadorProdutos = 0;
    private static boolean temProdutos = false;
    public static void main(String[] args) {
        try {
            do {
                System.out.println("# Menu #");
                System.out.println("1 - Adicionar um novo produto");
                System.out.println("2 - Atualizar preço ou quantidade de um produto");
                System.out.println("3 - Exibir os detalhes de um produto");
                System.out.println("4 - Sair");
                menu = solicitarInt();
                switch (menu) {
                    case 1:
                        adicionar();
                        break;
                    case 2:
                        atualizar();
                        break;
                    case 3:
                        exibir();
                        break;
                    case 4:
                        System.out.println("Programa encerrado.");
                        break;
                    default:
                        System.out.println("Insira uma opção válida.");
                }
            } while(menu != 4);
        } finally {
            scanner.close();
        }
    }

    private static void adicionar() {
        if(contadorProdutos < TOTAL_PRODUTOS) {

            System.out.println("# Cadastro de Produtos #");

            produto[contadorProdutos] = new Produto();

            System.out.println("Nome: ");
            String nome = scanner.nextLine();

            boolean encontrado = false;
            for(int contador = 0; contador < contadorProdutos; contador++) {
                if(produto[contador].getNome().equalsIgnoreCase(nome)) {
                    encontrado = true;
                    break;
                }
            }

            if(!encontrado) {
                produto[contadorProdutos].setNome(nome);
                System.out.println("Preço: ");
                produto[contadorProdutos].setPreco(solicitarDouble());
                System.out.println("Quantidade em estoque: ");
                produto[contadorProdutos].setQuantidadeEmEstoque(solicitarInt());

                contadorProdutos++;
            } else {
                System.out.println("Produdo com este nome já cadastrado.");
            }
        } else {
            System.out.println("Máximo de produtos atingido.");
        }
    }

    //Método para atualizar detalhes do produto
    private static void atualizar() {
        checarProdutos();
        if(temProdutos) {
            System.out.println("Insira o nome do produto que deseja atualizar: ");
            String nome = scanner.nextLine();

            boolean encontrado = false;
            for(int i = 0; i < contadorProdutos; i++) {
                if(produto[i].getNome().equalsIgnoreCase(nome)) {

                    System.out.println("Digite 'preco' para alterar o preço ou 'quantidade' para alterar a quantidade do produto");
                    while(true) {
                        String opcao = scanner.nextLine();
                        if(opcao.equalsIgnoreCase("preco")) {
                            System.out.println("Preço atual: R$" + produto[i].getPreco());
                            System.out.print("Novo preço: R$");
                            produto[i].setPreco(solicitarDouble());
                            System.out.println("Preço atualizado com sucesso!");
                            break;
                        } else if(opcao.equalsIgnoreCase("quantidade")) {
                            System.out.println("Quantidade atual: " + produto[i].getQuantidadeEmEstoque());
                            System.out.print("Nova quantidade: ");
                            produto[i].setQuantidadeEmEstoque(solicitarInt());
                            System.out.println("Quantidade atualizada com sucesso!");
                            break;
                        } else {
                            System.out.println("Opção inválida. Por favor, insira 'preco' ou 'quantidade'.");
                        }
                    }
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

    private static void exibir() {
        checarProdutos();
        if(temProdutos) {
            System.out.println("Insira o nome do produto que deseja visualizar: ");
            String nome = scanner.nextLine();

            boolean encontrado = false;
            for(int i = 0; i < contadorProdutos; i++) {
                if(produto[i].getNome().equalsIgnoreCase(nome)) {

                    System.out.println("Nome: " + produto[i].getNome());
                    System.out.println("Preço: R$" + produto[i].getPreco());
                    System.out.println("Quantidade em Estoque: " + produto[i].getQuantidadeEmEstoque());
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

    private static void checarProdutos() {
        if(contadorProdutos > 0) {
            temProdutos = true;
        }
    }

    private static int solicitarInt() {
        int inteiro = 0;
        while(true) {
            try {
                inteiro = scanner.nextInt();
                scanner.nextLine();
            } catch(InputMismatchException e) {
                scanner.nextLine();
            }
            if(inteiro <= 0) {
                System.out.println("Insira um número válido.");
            } else {
                break;
            }
        }
        return inteiro;
    }

    private static double solicitarDouble() {
        double flutuante = 0;
        while(true) {
            try {
                flutuante = scanner.nextDouble();
                scanner.nextLine();
            } catch(InputMismatchException e) {
                scanner.nextLine();
            }
            if(flutuante <= 0) {
                System.out.println("Insira um número válido.");
            } else {
                break;
            }
        }
        return flutuante;
    }

}

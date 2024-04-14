import java.util.InputMismatchException;
import java.util.Scanner;

public class ControleDeEstoqueBeta {

    private static final Scanner scanner = new Scanner(System.in);
    private static final int QUANTIDADE_PRODUTOS = 10;
    private static final int[] codigoProduto = new int[QUANTIDADE_PRODUTOS];
    private static final String[] nomeDoProduto = new String[QUANTIDADE_PRODUTOS];
    private static final String[] categoriaDoProduto = new String[QUANTIDADE_PRODUTOS];
    private static final double[] precoUnitarioProduto = new double[QUANTIDADE_PRODUTOS];
    private static final int[] quantidadeEstoque = new int[QUANTIDADE_PRODUTOS];
    private static int contadorProdutos = 0;
    private static int contador = 0;
    private static int identificarProduto = 0;
    private static int pegarCodigo = 0;
    private static int encontrouCodigo = 0;

    public static void main(String[] args) {
        try {
            int menu = 0;
            while (menu != 6) {
                exibirMenu();
                menu = obterOpcaoUsuario();
                processarPrograma(menu);
            }
        } finally {
            scanner.close();
        }
    }
  
    private static void exibirMenu() {
        System.out.println("## Menu Principal ##");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Deletar produto");
        System.out.println("3 - Listar produtos");
        System.out.println("4 - Visualizar produto");
        System.out.println("5 - Alterar produto");
        System.out.println("6 - Sair");
    }

    private static int obterOpcaoUsuario() {
        while(true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira uma opção válida.");
                scanner.nextLine();
            }
        }
    }

    private static void processarPrograma(int menu) {
        switch (menu) {

            case 1:
                cadastrar();
                break;
            case 2:
                deletar();
                break;
            case 3:
                listar();
                break;
            case 4:
                visualizar();
                break;
            case 5:
                alterar();
                break;
            case 6:
                System.out.println("Programa encerrado. Obrigado!");
                break;
            default:
                System.out.println("Por favor, insira uma opção válida.");
                System.out.println();
        }
    }

    public static void cadastrar() {
        encontrouCodigo = 0;
        if (contadorProdutos < QUANTIDADE_PRODUTOS) {
            System.out.println("# Cadastrar Produto #");
            identificarProduto = getIdentificarProduto();
            if (encontrouCodigo == 0) {

                codigoProduto[contadorProdutos] = pegarCodigo;

                System.out.println("Nome do produto: ");
                scanner.nextLine();
                nomeDoProduto[contadorProdutos] = scanner.nextLine();

                System.out.println("Categoria do produto: ");
                categoriaDoProduto[contadorProdutos] = scanner.nextLine();

                System.out.println("Preço Unitário: ");
                while (true) {
                    try {
                        precoUnitarioProduto[contadorProdutos] = scanner.nextDouble();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Por favor, insira um valor válido.");
                        System.out.println("Preço Unitário: ");
                        scanner.nextLine();
                    }
                }

                System.out.println("Quantidade em estoque: ");
                while (true) {
                    try {
                        quantidadeEstoque[contadorProdutos] = scanner.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Por favor, insira um valor válido.");
                        System.out.println("Quantidade em estoque: ");
                        scanner.nextLine();
                    }
                }
                contadorProdutos++;
            } else {
                System.out.println("Código já cadastrado.");
            }
        } else {
            System.out.println("Máximo de produtos atingido.");
        }
        System.out.println();
    }

    public static void deletar() {
        encontrouCodigo = 0;
        if (contadorProdutos > 0) {
            System.out.println("# Deletar Produto #");
            identificarProduto = getIdentificarProduto();

            if (encontrouCodigo == 1) {
                System.out.println("Deletar produto '" + nomeDoProduto[identificarProduto] + "' ?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                int confirmarDeletar = obterOpcaoUsuario();

                if (confirmarDeletar == 1) {
                    contadorProdutos--;
                    System.arraycopy(codigoProduto, (identificarProduto + 1), codigoProduto, identificarProduto, (contadorProdutos - identificarProduto));
                    System.arraycopy(nomeDoProduto, (identificarProduto + 1), nomeDoProduto, identificarProduto, (contadorProdutos - identificarProduto));
                    System.arraycopy(categoriaDoProduto, (identificarProduto + 1), categoriaDoProduto, identificarProduto, (contadorProdutos - identificarProduto));
                    System.arraycopy(precoUnitarioProduto, (identificarProduto +1), precoUnitarioProduto, identificarProduto, (contadorProdutos - identificarProduto));
                    System.arraycopy(quantidadeEstoque, (identificarProduto + 1), quantidadeEstoque, identificarProduto, (contadorProdutos - identificarProduto));

                    System.out.println("Produto deletado com sucesso.");
                } else {
                    System.out.println("Deleção cancelada.");
                }
            } else {
                System.out.println("Código não encontrado.");
            }
        } else {
            System.out.println("Nenhum produto cadastrado.");
        }
        System.out.println();
    }

    public static void listar() {
        if (contadorProdutos > 0) {
            System.out.println("# Lista de Produtos #");
            for (contador = 0; contador < contadorProdutos; contador++) {
                System.out.println("Código: " + codigoProduto[contador]);
                System.out.println("Nome: " + nomeDoProduto[contador]);
                System.out.println();
            }
        } else {
            System.out.println("Nenhum produto cadastrado.");
            System.out.println();
        }
    }

    public static void visualizar() {

        pegarCodigo = 0;
        encontrouCodigo = 0;

        if (contadorProdutos > 0) {
            System.out.println("# Visualizar Produto #");
            identificarProduto = getIdentificarProduto();
            if (encontrouCodigo == 1) {

                System.out.println("Nome: " + nomeDoProduto[identificarProduto]);
                System.out.println("Categoria: " + categoriaDoProduto[identificarProduto]);
                System.out.println("Preço: " + precoUnitarioProduto[identificarProduto]);
                System.out.println("Estoque: " + quantidadeEstoque[identificarProduto]);

            } else {
                System.out.println("Código não encontrado.");
            }
        } else {
            System.out.println("Nenhum produto cadastrado.");
        }
        System.out.println();
    }

    public static void alterar() {
        encontrouCodigo = 0;
        if (contadorProdutos > 0) {
            System.out.println("# Alterar Produto #");
            identificarProduto = getIdentificarProduto();
            if (encontrouCodigo == 1) {

                System.out.println("Alterar código?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                int confirmarAlterar = obterOpcaoUsuario();
                if (confirmarAlterar == 1 ) {
                    System.out.println("Novo código: ");
                    while (true) {
                        try {
                            codigoProduto[identificarProduto] = scanner.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Por favor, insira um valor válido.");
                            System.out.println("Novo código: ");
                            scanner.nextLine();
                        }
                    }
                }

                System.out.println("Alterar nome? (Nome atual: '" + nomeDoProduto[identificarProduto] + "')");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                confirmarAlterar = obterOpcaoUsuario();
                if (confirmarAlterar == 1 ) {
                    System.out.println("Novo nome: ");
                    scanner.nextLine();
                    nomeDoProduto[identificarProduto] = scanner.nextLine();
                }

                System.out.println("Alterar categoria? (Categoria atual: '" + categoriaDoProduto[identificarProduto] + "')");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                confirmarAlterar = obterOpcaoUsuario();
                if (confirmarAlterar == 1 ) {
                    System.out.println("Nova categoria: ");
                    scanner.nextLine();
                    categoriaDoProduto[identificarProduto] = scanner.nextLine();
                }

                System.out.println("Alterar preço? (Preço atual: '" + precoUnitarioProduto[identificarProduto] + "')");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                confirmarAlterar = obterOpcaoUsuario();
                if (confirmarAlterar == 1 ) {
                    System.out.println("Novo preço: ");
                    while (true) {
                        try {
                            precoUnitarioProduto[identificarProduto] = scanner.nextDouble();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Por favor, insira um valor válido.");
                            System.out.println("Novo preço: ");
                            scanner.nextLine();
                        }
                    }
                }

                System.out.println("Alterar estoque? (Quantidade atual: '" + quantidadeEstoque[identificarProduto] + "')");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                confirmarAlterar = obterOpcaoUsuario();
                if (confirmarAlterar == 1 ) {
                    System.out.println("Nova quantidade em estoque: ");
                    while (true) {
                        try {
                            quantidadeEstoque[identificarProduto] = scanner.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Por favor, insira um valor válido.");
                            System.out.println("Nova quantidade em estoque: ");
                            scanner.nextLine();
                        }
                    }
                }

            } else {
                System.out.println("Código não encontrado.");
            }
        } else {
            System.out.println("Nenhum produto cadastrado.");
        }
        System.out.println();
    }

    private static int getIdentificarProduto() {
        System.out.println("Código: ");
        while (true) {
            try {
                pegarCodigo = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor válido.");
                System.out.println("Código: ");
                scanner.nextLine();
            }
        }

        for (contador = 0; contador < contadorProdutos; contador++) {
            if (pegarCodigo == codigoProduto[contador]) {
                encontrouCodigo = 1;
                identificarProduto = contador;
                break;
            }
        }
        return identificarProduto;
    }
}

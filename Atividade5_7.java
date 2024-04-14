public class Main {

    public static void main(String[] args) {
        Produto produto1 = new Produto(123, "Água", 2.99, 20);

        System.out.println(produto1.getCodigo());
        System.out.println(produto1.getDescricao());
        System.out.println(produto1.getPreco());
        System.out.println(produto1.getQuantidadeEmEstoque());

        produto1.adicionarEstoque(10);

        System.out.println(produto1.getQuantidadeEmEstoque());

        produto1.removerEstoque(40);

        produto1.removerEstoque(5);

        System.out.println(produto1.getQuantidadeEmEstoque());

        Produto produto2 = new Produto(124, "Pão", 5.99, 80);

        System.out.println(produto2.getQuantidadeEmEstoque());

        produto2.removerEstoque(59);

        System.out.println(produto2.getQuantidadeEmEstoque());
    }

}

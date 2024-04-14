public class Main {
    private static Produto produto = new Produto();

    public static void main(String[] args) {
        produto.setNome("Água");
        produto.setPreco(2.99);
        produto.setQuantidadeEstoque(10);

        mostrarProduto();

        produto.setPreco(2.49);
        produto.setQuantidadeEstoque(40);

        mostrarProduto();
    }

    private static void mostrarProduto(){
        System.out.println("# Produto 1 #");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEstoque());
    }
}

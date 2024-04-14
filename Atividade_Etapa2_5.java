public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome) {
        this.nome = nome;
        preco = 0;
        quantidadeEmEstoque = 0;
    }
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        quantidadeEmEstoque = 0;
    }

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
}

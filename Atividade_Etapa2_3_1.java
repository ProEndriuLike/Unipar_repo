public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getPreco() {
        return preco;
    }
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
}

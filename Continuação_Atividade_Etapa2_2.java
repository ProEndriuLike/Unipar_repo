public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

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
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
}

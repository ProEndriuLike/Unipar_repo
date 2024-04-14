public class Produto {

    private int codigo;
    private String descricao;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(int codigo, String descricao, double preco, int quantidadeEmEstoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        quantidadeEmEstoque = quantidadeEmEstoque + quantidade;
        System.out.println("Quantidade atualizada com sucesso!");
    }

    public void removerEstoque(int quantidade) {
        if(quantidade > quantidadeEmEstoque) {
            System.out.println("# ERRO #");
            System.out.println("A quantidade em estoque é menor que a quantidade informada!");
        } else {
            quantidadeEmEstoque = quantidadeEmEstoque - quantidade;
            System.out.println("Quantidade atualizada com sucesso!");
        }
    }
}

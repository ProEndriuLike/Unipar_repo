public class Carro {

    private String nome;
    private String marca;
    private int ano;

    public Carro() {
        ano = 0;
        nome = "";
        marca = "";
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
}

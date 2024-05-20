package br.unipar;

public class Complexo {
    private double parteReal;
    private double parteImaginaria;

    // Construtor
    public Complexo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    // Sobrecarga do operador de adição
    public Complexo adicionar(Complexo outro) {
        double novaParteReal = this.parteReal + outro.parteReal;
        double novaParteImaginaria = this.parteImaginaria + outro.parteImaginaria;
        return new Complexo(novaParteReal, novaParteImaginaria);
    }

    // Método para imprimir o número complexo
    public void imprimir() {
        System.out.println(parteReal + " + " + parteImaginaria + "i");
    }

    public static void main(String[] args) {
        Complexo c1 = new Complexo(2, 3);
        Complexo c2 = new Complexo(4, 5);

        // Usando a sobrecarga do operador de adição
        Complexo resultado = c1.adicionar(c2);

        // Imprimindo o resultado da adição
        System.out.print("Resultado da adição: ");
        resultado.imprimir();
    }
}


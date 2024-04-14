package Atividade5_5;

public class CarroTeste {

    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setNome("Audi R8");
        carro.setAno(2006);
        carro.setMarca("Audi");

        System.out.println(carro.getNome());
        System.out.println(carro.getAno());
        System.out.println(carro.getMarca());

    }
}

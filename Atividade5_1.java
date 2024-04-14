public class Atividade5_1 {

    public static void main(String[] args) {
        for(int numero = 1; numero <= 50; numero++) {
            System.out.print(numero);
            if(numero % 3 == 0) {
                System.out.print(" Fizz");
            }
            if(numero % 5 == 0) {
                System.out.print(" Buzz");
            }
            System.out.println();
        }
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioIf_1 {
    public static void main(String[] args){

        int idade;

        Scanner entrada = new Scanner(System.in);

        while(true){
            try{
                System.out.println("Insira sua idade: ");
                idade = entrada.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("Idade inválida!");
                entrada.nextLine();
            }
        }
        if (idade >= 18){
            System.out.println("Você é maior de idade!");
        }else {
            System.out.println("Você é menor de Idade!");
        }
    }
}

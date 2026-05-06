import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioTres {

    public static void imprimeVetorInvertido(char[] letras){

        String resultado = "";

        for(int i = letras.length -1; i >= 0; i--){
            resultado += letras[i];

        }

        System.out.println(resultado);
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input;

        do{
            System.out.println("Digite uma palavra: ");
            input = sc.nextLine().trim();

        } while (input.isEmpty());

        char [] inputVetor = input.toCharArray();

        imprimeVetorInvertido(inputVetor);

        sc.close();


    }
}

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioUm {

    public static void imprimeVetorAleatorioOrdenado(){
        int min = 1;
        int max = 100;
        int range = max - min + 1;
        int [] vetorAleatorio = new int[5];

        for (int i = 0; i < 5; i++) {
            int rand = (int)(Math.random() * range) + min;
            vetorAleatorio[i] = rand;
        }

        System.out.println("Array aleatório: ");
        System.out.println(Arrays.toString(vetorAleatorio));

        System.out.println("Array ordenado: ");
        Arrays.sort(vetorAleatorio);
        System.out.println(Arrays.toString(vetorAleatorio));

    }

    public static boolean temVogal(char l, char[] array){
        for(char x : array){
            if (x== l){
                return true;
            }
        }
        return false;
    }

    public static void imprimeNumeroDeVogais(String palavra){
        int cont = 0;
        char [] vogais = {'a','e','i','o','u'};



        for (int i = 0; i < palavra.length(); i++){

            if (temVogal(palavra.charAt(i), vogais)){
                cont++;
            }
        }

        System.out.println(cont);



    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input;

        imprimeVetorAleatorioOrdenado();

        do{
            System.out.println("Digite uma palavra com ao menos 1 caracter: ");
            input = sc.nextLine().trim();
        } while (input.isEmpty());

        imprimeNumeroDeVogais(input);

        sc.close();

    }
}

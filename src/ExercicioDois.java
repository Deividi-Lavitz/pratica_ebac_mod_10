import java.util.Arrays;
import java.util.Scanner;

public class ExercicioDois {

    public static void multiplicaValoresVetor(int[] numeros){

        for (int i = 0; i < numeros.length; i++) {

            //Logica usada para aceitar 0 como entrada pois o % gera exception com 0
            // se identifica o numero 0 seta o resto pra 2 e não aplica as multiplicações
            int resto = 2;

            if (numeros[i] != 0){
                resto = numeros[i] % 2;
            }


            if(resto == 0){
                numeros[i] = numeros[i] * 2;
            } else if (resto == 1){
                numeros[i] = numeros[i] * numeros[i];
            }
        }

        System.out.println(Arrays.toString(numeros));

    }

    public static boolean temVogal(char l, char[] array){
        for(char x : array){
            if (x== l){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input;
        int numero;
        int iterador = 1;
        int [] arrayNumeros = new int[5];

        System.out.println("Insira 5 numero inteiros!");


        do{
            System.out.println("Digite o " + iterador + "° numero: ");
            input = sc.nextLine().trim();

            try{
                numero = Integer.parseInt(input);
                arrayNumeros[iterador-1] = numero;
                iterador++;

            }catch(Exception e){
                System.out.println("Insira um numero inteiro válido!");

            };
        } while (iterador <= 5);

        sc.close();

        multiplicaValoresVetor(arrayNumeros);

    }
}

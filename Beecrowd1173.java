import java.util.Scanner;

public class Beecrowd1173 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        imprimeArray(dobroVetor(n));

        s.close();
    }

    public static void imprimeArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("N["+ i +"] = " + array[i]);
        }
    }

    public static int[] dobroVetor(int numero){
        int[] vetorDobro = new int[10];

        vetorDobro[0] = numero;
        for(int i =1; i <10; i++){
            vetorDobro[i] = numero*2;
            numero*=2;
        }

        return vetorDobro;
    }
}

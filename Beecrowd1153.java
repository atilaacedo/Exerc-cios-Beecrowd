import java.util.Scanner;

public class Beecrowd1153 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();

        System.out.println(fatorial(num));

        entrada.close();
    }

    public static int fatorial(int n){
        int somaFat = 1;
        for(int i =n; i >= 1; i-- ){
                somaFat *= i;
           
        }

        return somaFat;
    }
}

import java.util.Scanner;

public class Beecrowd1172 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        int [] num = new int[10];

        for(int i = 0; i < num.length; i++){
            num[i] = entrada.nextInt();
        }
        imprimeArray(num);
        entrada.close();
    }

    public static void imprimeArray(int[] num){
        for(int i = 0; i < num.length; i++){
           if(num[i] <= 0){
               num[i] = 1;
           }
           System.out.println("X["+i+"] = " + num[i]);
        }
    }
}

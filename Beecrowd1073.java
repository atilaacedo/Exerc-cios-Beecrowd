import java.util.Scanner;

public class Beecrowd1073 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num  = entrada.nextInt();

        for(int i = 1; i <=num; i++){
            if(i%2 == 0){
               int quadrado = (int) Math.pow(i, 2);
                System.out.println(i+ "^2 = " + quadrado);
            }
        }
        
        entrada.close();
    }
}

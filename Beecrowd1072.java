import java.util.Scanner;

public class Beecrowd1072 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        int testes = entrada.nextInt();

        int in = 0, out = 0;
        while(testes > 0){

            int x = entrada.nextInt();

            if(x >= 10 && x <=20){
                in++;
            }else{
                out++;
            }

            testes--;
        }

        System.out.println(in + " in");
        System.out.println(out+ " out");
        
        entrada.close();
    }  
}

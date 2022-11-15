import java.util.Scanner;

public class Beecrowd1165{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int testes =  entrada.nextInt();
        while(testes > 0){
            int num = entrada.nextInt();
            verificaSeEhPrimo(num);

            testes--;
        }

        entrada.close();
    }

    public static void verificaSeEhPrimo(int num){
        int cont = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                cont++;
            }
        }

        if(cont == 2){
            System.out.println(num+ " eh primo");
        }else{
            System.out.println(num+ " nao eh primo");
        }
    }
}
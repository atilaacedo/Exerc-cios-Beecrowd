package Beecrowd1114;

import java.util.Scanner;

public class SenhaFixa {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean senhaIsTrue = false;

        while(senhaIsTrue == false){
            String senha = sc.next();

            if(!(senha.equals("2002")))
                System.out.println("Senha Invalida");
            else{
                System.out.println("Acesso Permitido");
                senhaIsTrue = true;
            }
         }
        sc.close();
    }

}

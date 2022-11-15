package Beecrowd1237;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ComparacaoSubString {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in); 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        String frase1;
        String frase2;
        int contador;
        int maiorCom;
      
        while((frase1 = br.readLine()) != null && (frase2 = br.readLine()) != null){
            String menor = verificarMenor(frase1, frase2);
            String maior = verificarMaior(frase1, frase2);
            contador = 0;
            maiorCom = 0;

            maiorCom = menor.length();
            boolean isTrue = true;
            while(maiorCom > 0 && isTrue){

                int diff = menor.length() - maiorCom;

                for(int i = 0; i<= diff; i++){
                    if(maior.contains(menor.substring(i, i+maiorCom))){
                        isTrue = false;
                        maiorCom++;
                        break;
                    }
                }

                maiorCom--;
            }
            //TWO
            //FOUR
            System.out.println(maiorCom);
        }
        

        
        sc.close();
    }

    static String verificarMenor(String s1, String s2){
        if(s1.length() > s2.length()){
            return s2;
        }

        return s1;
    }

    
    static String verificarMaior(String s1, String s2){
        if(s1.length() > s2.length()){
            return s1;
        }
        return s2;
    }
}

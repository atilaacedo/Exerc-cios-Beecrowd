package Beecrowd1263;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Aliteracao {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String texto;

        while((texto = br.readLine()) != null){
            int ali = checarAliteracao(texto);
            System.out.println(ali);
        }
    }

    private static int checarAliteracao(String texto) {
        int aliteracao = 0;
        texto = texto.toLowerCase();
        String[] arrayTexto = texto.split(" ");
        char novaLetra = ' ';
        for(int i =0; i < arrayTexto.length -1; i++){
            if(arrayTexto[i].charAt(0) == arrayTexto[i+1].charAt(0) && arrayTexto[i].charAt(0) != novaLetra){
                novaLetra = arrayTexto[i].charAt(0);
                aliteracao++;
            }else if(!(arrayTexto[i].charAt(0) == arrayTexto[i+1].charAt(0))){
                novaLetra = ' ';
            }
        }

        return aliteracao;
    }

    static String pegarTexto(Scanner sc){
        String texto = sc.nextLine();

        return texto;
    }

}

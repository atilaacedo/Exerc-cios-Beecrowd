package Beecrowd1272;

import java.util.Scanner;

public class Oculta {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

         int testes = sc.nextInt();
         String linha = sc.nextLine();
        for(int i = 0; i < testes; i++){

        	linha = sc.nextLine();
        	int j = 0;	
        	
        	while(j < linha.length()) {
        		while(j < linha.length() && linha.charAt(j) == ' ') {
        			j++;
        		}
        		
        		if(j < linha.length()) {
        			System.out.print(linha.charAt(j));
        		}
        		
        		while(j < linha.length() && linha.charAt(j) != ' ') {
        			j++;
        		}
        		
        	}
        	
        	System.out.println();
        }
        sc.close();
    }
}

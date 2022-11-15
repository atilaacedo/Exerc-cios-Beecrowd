package Beecrowd2963;

import java.util.Scanner;

public class BoboDaCorte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int competidores =sc.nextInt();
        int carlos = sc.nextInt();
        boolean carlosVence = true;
        for(int i = 0; i < competidores-1; i++) {
            int competidor = sc.nextInt();
            
            if(competidor > carlos) 
                carlosVence = false;
        }
        
        if(carlosVence)
            System.out.println("S");
        else
            System.out.println("N");
        
    }
}

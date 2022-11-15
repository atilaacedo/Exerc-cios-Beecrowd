package Beecrowd2968;

import java.util.Scanner;

public class HoraDaCorrida{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int voltas = sc.nextInt();
        int placas = sc.nextInt();
        double porcen = voltas*placas/10;
        
        for(int i =1; i <= 9; i++) {
            
            double placaCerta = Math.ceil(porcen*i);
            int placaPi = (int) placaCerta;
            
            System.out.println(placaPi);
        }
        
        
    }
}

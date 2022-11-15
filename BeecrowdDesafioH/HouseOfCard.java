package BeecrowdDesafioH;

import java.util.Scanner;

public class HouseOfCard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] res = new int[T];
        
        for (int i = 0; i < T; i++) {
            int C = sc.nextInt();
            int mod = 0;
            int holder = 2;
            int pares = 0;
            for (int j = 0; j < C; j++) {
            	
                if (holder > C) {
                    pares = j;
                    break;
                }
                else {
                    holder += 5;
                    holder += mod;
                }
                mod += 3;
            }
            res[i] = pares;
        }

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }
	
}


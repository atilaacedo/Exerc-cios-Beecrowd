package Beecrowd1253;

import java.util.Scanner;

public class CifraDeCesar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tests = sc.nextInt();
		String crip;
		int pulo;
		for (int i = 0; i < tests; i++) {
			 crip = sc.next();
			 pulo = sc.nextInt();
			
			char[] caracs = crip.toCharArray();
			for (int j = 0; j < caracs.length; j++) {
				
				caracs[j] -=pulo;
				if(!((caracs[j] >= 65 && caracs[j] <= 90) || (caracs[j] >=97 && caracs[j] <=122))) {
					caracs[j] += pulo; 
					caracs[j] += 26;
					caracs[j] -= pulo;
				}
			}
			
			for (int j = 0; j < caracs.length; j++) {
				System.out.print(caracs[j]);
			}
			System.out.println();
		}
	}
}

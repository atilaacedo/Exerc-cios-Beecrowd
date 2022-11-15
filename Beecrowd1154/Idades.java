package Beecrowd1154;

import java.util.Scanner;

public class Idades {
	static boolean numberNotIsNegative = true;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("%.2f",mediaIdade(sc));
	}
	
	static double mediaIdade(Scanner sc) {
		double soma = 0;
		double qnt = 0;
		double media = 0;
		while(numberNotIsNegative) {
			double n = sc.nextDouble();
			if(n < 0)
				numberNotIsNegative = false;
			else {
				soma+=n;
				qnt++;
			}
		}
		
		media = soma/qnt;
		
		return media;
	}
}

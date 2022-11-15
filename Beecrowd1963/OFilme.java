package Beecrowd1963;

import java.util.Scanner;

public class OFilme {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double ing1 = sc.nextDouble();
		double ing2 = sc.nextDouble();
		
		double dif = ing2 - ing1;
		
		double porcentagem = (dif/ing1) *100;
		
		
		System.out.println(String.format("%.2f%%", porcentagem));
		sc.close();
	}
}

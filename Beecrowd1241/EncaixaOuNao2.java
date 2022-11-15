package Beecrowd1241;

import java.util.Scanner;

public class EncaixaOuNao2 {
	
	public static String encaixaOuNao(String a, String b) {
		int indexMax = a.length() - b.length();
		
		if(b.length() > a.length())
			return "nao encaixa";
		
		
		if(a.substring(indexMax, a.length()).equals(b))
			return "encaixa";
		
		
		return "nao encaixa";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testes = sc.nextInt();
		for(int i =0; i < testes; i++) {
			if(i == 0)
				System.out.println();
			
			String resposta = encaixaOuNao(sc.next(), sc.next());
			System.out.println(resposta);
		}
		
		sc.close();
	}
}

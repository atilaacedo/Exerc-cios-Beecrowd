package Beecrowd1276;

import java.util.Scanner;

public class FaixaDeLetras {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();
		frase = frase.replaceAll(" ", "");
		
		char[] letras = frase.toCharArray();
		char[] letras2 = new char[letras.length];
		boolean temMais = true;
		while(temMais == true) {
			char inicial = ' ';
			char final1 = ' ';
			
			for (int i = 0; i < letras.length -1; i++) {
				for (int j = 0; j < letras.length -1; j++) {
					if(letras[j] > letras[j+1]) {
						int aux = letras[j+1];
						letras[j+1] =  letras[j];
						letras[j] = (char) aux;
					}
				}
			}
			inicial = letras[0];
			int n = inicial;
			for (int i = 0; i < letras.length; i++) {
				if(letras[i] == n+1) {
					n = letras[i];
				}else {
					letras2[i] = letras[i];
				}
			}
			final1 = (char) n;
			
			
			System.out.println(inicial + ":" + final1);
		}
		sc.close();
	}
	
}

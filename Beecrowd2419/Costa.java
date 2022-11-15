package Beecrowd2419;

import java.util.Scanner;

public class Costa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] linhasEColunas = sc.nextLine().split(" ");
		
		int linhas = Integer.parseInt(linhasEColunas[0]);
		int colunas = Integer.parseInt(linhasEColunas[1]);
		
		
		String[][] mapa = new String[linhas][colunas];
		int costas =0;
		for (int i = 0; i < linhas; i++) {
			String[] aux = sc.nextLine().split("");
			for (int j = 0; j < colunas; j++) {
				mapa[i][j] = aux[j];
			}
			
		}
		
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				if(mapa[i][j].equals("#")) {
					if(j > 0 && mapa[i][j-1].equals(".")) {
						costas++;
					}else if(j < colunas-1 && mapa[i][j+1].equals(".")) {
						costas++;
					}else if(i > 0 && mapa[i-1][j].equals(".")) {
						costas++;
					}else if(i < linhas-1 && mapa[i+1][j].equals(".")) {
						costas++;
					}
					
				}
			}
		}
		
		System.out.println(costas);
		
	}
}

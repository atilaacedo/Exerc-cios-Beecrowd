package Beewcrowd3310;

import java.util.Scanner;

public class GravityBoy {
	//NAO RESOLVIDO
	static int calcularMenosJogadas(Scanner sc, int caminhos) {
		int jogadas = 0;
		int jogadas1 = -1;
		int jogadas2 = -1;
		
		int[] posicoes1 = new int[caminhos];
		int[] posicoes2 = new int[caminhos];
		int[] guardaPosicoes1 = posicoes1;
		int[] guardaPosicoes2 = posicoes2;
		for (int i = 0; i < posicoes1.length; i++) {
			posicoes1[i] = sc.nextInt();
		}
		
		for (int i = 0; i < posicoes2.length; i++) {
			posicoes2[i] = sc.nextInt();
		}
		
		if(posicoes1[0] == 1 || posicoes1[0] == 2) {
			jogadas1++;
			for (int i = 1; i < posicoes2.length; i++) {
				if(posicoes1[i] == 0 || (posicoes1[i-1] == 1 && posicoes1[i] == 2)) {
					int[] aux = posicoes1;
					posicoes1 = posicoes2;
					posicoes2 = aux;
					jogadas1++;
				}
			}
		} 
		
		if(guardaPosicoes2[0] == 1 || guardaPosicoes2[0] == 2) {
			jogadas2++;
			for (int i = 1; i < posicoes2.length; i++) {
				if(guardaPosicoes2[i] == 0 || (guardaPosicoes2[i-1] == 1 && guardaPosicoes2[i] == 2))  {
					int[] aux = guardaPosicoes2;
					guardaPosicoes2 = guardaPosicoes1;
					guardaPosicoes1 = aux;
					jogadas2++;
				}
			}
		}
		
		if(jogadas1 > jogadas2 && jogadas2 > -1)
			jogadas = jogadas2;
		else if(jogadas2 > jogadas1 && jogadas1 > -1)
			jogadas = jogadas1;
		
		
				
		return jogadas;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caminhos = sc.nextInt();
		
		int jogadas = calcularMenosJogadas(sc, caminhos);
		System.out.println(jogadas);
	}
}

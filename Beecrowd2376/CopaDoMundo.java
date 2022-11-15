package Beecrowd2376;

import java.util.Scanner;

public class CopaDoMundo {
	static int copaDoMundo(Scanner sc) {
		int[] classificadosOitavas = new int[8];
		int index = 0;
		int timeA, timeB;
		for (int i = 0; i < 16; i+=2) {
			timeA = sc.nextInt();
			timeB = sc.nextInt();
			
			if(timeA > timeB) {
				classificadosOitavas[index] = i;
			}else {
				classificadosOitavas[index] = i+1;
			}
			
			index++;
		}
		
		int[] classificadosQuartas =new int[4];
		
		index =0;
		for (int i = 0; i < classificadosOitavas.length; i+=2) {
			timeA = sc.nextInt();
			timeB = sc.nextInt();
			
			if(timeA > timeB) {
				classificadosQuartas[index] = classificadosOitavas[i];
			}else {
				classificadosQuartas[index] = classificadosOitavas[i+1];
			}
			
			
			index++;
		}
		
		int[] classificadosSemis = new int[2];
		index =0;
		for(int i =0; i < classificadosQuartas.length; i+=2) {
			timeA = sc.nextInt();
			timeB = sc.nextInt();
			
			if(timeA > timeB) {
				classificadosSemis[index] = classificadosQuartas[i];
			}else {
				classificadosSemis[index] = classificadosQuartas[i+1];
			}
			index++;
		}
		
		int vencedor = 0;
		
		timeA = sc.nextInt();
		timeB = sc.nextInt();
		
		if(timeA > timeB) {
			vencedor = classificadosSemis[0];
		}else {
			vencedor = classificadosSemis[1];
		}
		
		sc.close();
		
		return vencedor;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vencedor  = copaDoMundo(sc);
		char vencedorFinal = ' ';
		int k =0;
		for (int i = 65; i < 81; i++,k++) {
			if(k == vencedor) {
				vencedorFinal = (char) i;
				break;
			}
		}
		
		System.out.println(vencedorFinal);
		
	}
}

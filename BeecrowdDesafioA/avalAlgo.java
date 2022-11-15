package BeecrowdDesafioA;

import java.util.Scanner;

public class avalAlgo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		calcularMedia(sc);
		
	}
	
	static void calcularMedia(Scanner sc) {
		String testes = sc.nextLine();
		int testesI = Integer.parseInt(testes);
		String nome, notas;
		for (int i = 0; i < testesI; i++) {
			nome = sc.nextLine();
			notas = sc.nextLine();
			int cont = 2;
			double notasSomadas = 0;
			String[] notasS = notas.split(" ");
			Double menor = Double.parseDouble(notasS[0]);
			for (int j = 0; j < notasS.length; j++) {
				notasSomadas += Double.parseDouble(notasS[j]);
				if(menor > Double.parseDouble(notasS[j])) {
					menor = Double.parseDouble(notasS[j]);
				}
				
				if(j >1) {
					cont++;
				}
				if(j == 3) {
					notasSomadas -= menor; 
					cont = 3;
				}
			}
			
			double media = notasSomadas / cont;
			
			System.out.printf("%s: %.1f\n", nome, media);
			
		}
		
		
	}
}

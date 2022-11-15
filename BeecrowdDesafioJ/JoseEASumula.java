package BeecrowdDesafioJ;

import java.util.Scanner;

public class JoseEASumula {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testes = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < testes; i++) {
			String ocorrencia = sc.nextLine();
			
			String[] tempos = ocorrencia.split(" ");
			
			if(tempos[1].equals("1T")) {
				int tempo = Integer.parseInt(tempos[0]);
				
				if(tempo <= 45) {
					System.out.println(tempo);
				}else {
					int acrescimos = tempo - 45;
					System.out.println("45+" + acrescimos);
				}
				
			}else {
				int tempo = Integer.parseInt(tempos[0]);
				if(tempo <= 45) {
					System.out.println(45+tempo);
				}else {
					int acrescimos = tempo - 45;
					System.out.println("90+" + acrescimos);
					
				}
			}
			
		}
		
	}
}

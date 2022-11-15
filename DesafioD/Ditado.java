package DesafioD;

import java.util.Scanner;

public class Ditado {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ditado(sc);
	}
	
	static void ditado(Scanner sc) {
		int ditados = Integer.parseInt(sc.nextLine());
		String palavraCorreta = "";
		String tentativas = "";
		double maiorNota = 0;
		String alunosQueAcertaram = "";
		String alunosDefinitivosQueAcertaram = "";
		double maiorNotaDefinitiva = 0;
		String alunosQueAcertaram1 = "";
		for (int i = 0; i < ditados; i++) {
			palavraCorreta = sc.nextLine();
			tentativas = sc.nextLine();
			int cont = 0;
			maiorNota = 0;
			int contE = 0;
			maiorNota = 0;
			String[] ditadosPorAluno = tentativas.split(" ");
			
			for (int j = 0; j < ditadosPorAluno.length; j++) {
				cont = 0;
				contE = 0;
			
				if(ditadosPorAluno[j].equals(palavraCorreta)) {
					maiorNota = 1;
					alunosQueAcertaram1 += Integer.toString(j+1) + " "; 
				}else {
					int menor = 0;
					if(palavraCorreta.length() > ditadosPorAluno[j].length())
						menor = ditadosPorAluno[j].length();
					else
						menor = palavraCorreta.length();
					
					for (int j2 = 0; j2 < menor; j2++) {
						if(ditadosPorAluno[j].charAt(j2) != palavraCorreta.charAt(j2)) {
							cont++;
						}
						
						if(ditadosPorAluno[j].length() == palavraCorreta.length()-1) {
							if(ditadosPorAluno[j].charAt(j2) == palavraCorreta.charAt(j2+1));
								contE++;
						}
					}
					
					
					
					if(cont <= 1 && maiorNota < 1 ||  (contE == palavraCorreta.length()-1)) {
						maiorNota =0.5;
						alunosQueAcertaram += Integer.toString(j+1) + " "; 
					}
					
				}
			
				
			}
			System.out.println(maiorNota);
			maiorNotaDefinitiva += maiorNota;
			
			
			
		}
		if(!alunosQueAcertaram1.isEmpty()) {
			alunosDefinitivosQueAcertaram = alunosQueAcertaram1;
		}else {
			alunosDefinitivosQueAcertaram = alunosQueAcertaram;
		}
		
		
		System.out.println(maiorNotaDefinitiva);
		System.out.println(alunosDefinitivosQueAcertaram);
		
	}
	
}


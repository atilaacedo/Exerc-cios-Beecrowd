package BeecrowdDesafioK;


import java.util.Scanner;

public class Kimi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pilEVolta = sc.nextLine();
		String[] ss = pilEVolta.split(" ");
		int pilotos = Integer.parseInt(ss[0]);
		int voltas = Integer.parseInt(ss[1]);
		int tempoTotalP = 0;
		int menorTempo = Integer.MAX_VALUE;
		String pilotoETempo = "";
		String piloto =  "NENHUM";
		int index = 0;
		for(int i = 0; i < pilotos; i++) {
			pilotoETempo = sc.nextLine();
			
			String[] tempoTotal = pilotoETempo.split(" ");
			
			for (int j = 1; j < tempoTotal.length; j++) {
				String[] tempoSep = tempoTotal[j].split(":");
				int minutos = Integer.parseInt(tempoSep[0]);
				int segundos = Integer.parseInt(tempoSep[1]);
				int milesimos = Integer.parseInt(tempoSep[2]);
				
				tempoTotalP += minutos * 60000;
				tempoTotalP += segundos * 1000;
				tempoTotalP += milesimos;
				
				
				
			}
			if(i == 0) {
				menorTempo = tempoTotalP;
				if(Integer.parseInt(tempoTotal[0]) <= 10) {
					piloto = tempoTotal[0];
				}

			}else if(menorTempo > tempoTotalP ) {
				menorTempo = tempoTotalP;
				if(Integer.parseInt(tempoTotal[0]) <= 10) {
					piloto = tempoTotal[0];
				}
				
			}
			
		}
		
		System.out.println(piloto);
		
	}
}

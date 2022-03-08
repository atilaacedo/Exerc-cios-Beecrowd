import java.util.Scanner;

public class Beecrowd1131 {
	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		
		int interGol = en.nextInt();
		int gremioGol = en.nextInt();
		int grenal = 1;
		int gremio = 0;
		int inter = 0;
		int empate = 0;
		boolean isAlive = true;

		do{
			System.out.println("Novo grenal (1-sim 2-nao)");

			if(gremioGol > interGol) {
				gremio+=1;
			}
			if(interGol > gremioGol){
				inter+=1;
			}
			if(interGol == gremioGol){
				empate+=1;
			}

			int repeat = en.nextInt();
			if(repeat==1) {
				
				interGol = en.nextInt();
				gremioGol = en.nextInt();
				grenal+=1;
			}else {
				isAlive = false;
			}
		}while(isAlive);
		
		System.out.println(grenal +" grenais");
		System.out.println("Inter:" + inter);
		System.out.println("Gremio:" + gremio);
		System.out.println("Empates:"+empate);
		if(gremio > inter) {
			System.out.println("Gremio venceu mais");
		}else if(inter > gremio) {
			System.out.println("Inter venceu mais");
		}else {
			System.out.println("Nao houve vencedor");
		}
		en.close();
	}
}


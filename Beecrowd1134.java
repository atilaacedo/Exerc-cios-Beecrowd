import java.util.Scanner;

public class Beecrowd1134 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int alcool = 0, gasolina = 0, diesel = 0;
		boolean isAlive = true;
		
		
		
		
		
		while(isAlive) {
			int combustivel = entrada.nextInt();
			if(combustivel > 4 && combustivel < 1) {
				combustivel = entrada.nextInt();
			}
			switch(combustivel) {
				case 1:
					alcool+=1;
					break;
				case 2:
					gasolina+=1;
					break;
				case 3:
					diesel+=1;
					break;
				case 4:
					isAlive = false;
					break;
			}
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		entrada.close();
	}
	
}

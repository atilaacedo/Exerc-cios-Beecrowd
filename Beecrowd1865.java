import java.util.Scanner;

public class Beecrowd1865 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int testes = entrada.nextInt();
		for (int i = 1; i <= testes; i++) {
			String nameHero = entrada.next();
			int powerHero = entrada.nextInt();
			
			if(nameHero.equals("Thor")) {
				System.out.println("Y");
			}else {
				System.out.println("N");
			}
		}
	}
}

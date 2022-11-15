import java.util.Scanner;

public class Beecrowd1828 {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		String resultado;
	 	
		int nTestes = entrada.nextInt();
	
		for(int i = 1; i <= nTestes; i++) {
			boolean sheldonWin = false;
			String escSheldon = entrada.next();
			String escRaj = entrada.next();
			
			
			if(escSheldon.equals("pedra") && (escRaj.equals("lagarto") || escRaj.equals("tesoura"))) {
				sheldonWin = true;
			}else if(escSheldon.equals("papel") && (escRaj.equals("pedra")|| escRaj.equals("Spock"))) {
				sheldonWin = true;
			}else if(escSheldon.equals("tesoura") && (escRaj.equals("papel") || escRaj.equals("lagarto"))) {
				sheldonWin = true;
			}else if(escSheldon.equals("lagarto") && (escRaj.equals("Spock")|| escRaj.equals("papel"))) {
				sheldonWin = true;
			}else if(escSheldon.equals("Spock") && (escRaj.equals("tesoura") || escRaj.equals("pedra"))) {
				sheldonWin = true;
			}
			
			if(sheldonWin) {
				resultado = "Bazinga!";
			}else if(escSheldon.equals(escRaj)) {
				resultado = "De novo!";
			}else {
				resultado = "Raj trapaceou!";
			}
			
			System.out.println("Caso #"+i +": " + resultado);
		}
		
		entrada.close();
	}
	

}

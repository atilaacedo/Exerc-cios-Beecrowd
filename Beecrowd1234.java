import java.util.Scanner;

public class Beecrowd1234 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		while(entrada.hasNextLine()) {
			String frase = entrada.nextLine();
			frase.replaceAll("\\s+","");
			for(int i = 0; i <= frase.length()-1; i++) {
				System.out.println(frase.length());
				Character letra = frase.charAt(i);
				Character letraFormatada = letra;
				if(i%2 != 0 || i == 0) {
					letraFormatada = Character.toUpperCase(letra);
				}
				System.out.print(letraFormatada);
				
			}
			System.out.println();
		}
		entrada.close();
	}
}

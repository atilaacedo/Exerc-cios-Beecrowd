import java.util.Scanner;

public class Beecrowd1263 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String frase = sc.nextLine();
		frase.toLowerCase();
		int aliteracao = 0;
		char letraAgora = 0;
		String[] iniciaisPalavras = frase.split(" ");
		
		for (int i = 0; i < iniciaisPalavras.length-1; i++) {

			char letra1 = iniciaisPalavras[i].charAt(0);
			char letra2 = iniciaisPalavras[i+1].charAt(0);
			
			
			if(letra1 == letra2  && letra1 != letraAgora) {
				aliteracao++;
				
				letraAgora = letra1;
			}
			
			
		}
		
		System.out.println(aliteracao);
		
		
		sc.close();
	}
}

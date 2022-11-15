import java.util.Scanner;

public class Beecrowd2157 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int testes = entrada.nextInt();
		
		while(testes > 0) {
			String numero1 = entrada.next();
			String numero2 = entrada.next();
			
			int n1 = Integer.parseInt(numero1);
			int n2 = Integer.parseInt(numero2);
			for(int i = n1; i <= n2; i++) {
				System.out.print(i);
			}
			
			for(int j = n2; j>=n1; j--) {
				String numeroInverso = Integer.toString(j);
				String numeroInversoFinal = "";
				
				for(int k = numeroInverso.length(); k > 0; k--) {
					numeroInversoFinal = numeroInverso.substring(k-1,k);
					System.out.print(numeroInversoFinal);
				}
				System.out.println();
			}
			testes--;
		}
		entrada.close();
	}
}

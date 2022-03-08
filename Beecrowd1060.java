import java.util.Scanner;

public class Beecrowd1060 {
	static int cont = 0;
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double[] numeros = new double[6];
		
		for(double i: numeros) {
			
			i = entrada.nextDouble();
			
			if(i > 0) {
				cont++;
			}
		}
		
		System.out.println(cont + " valores positivos");
		
		entrada.close();
	}
}

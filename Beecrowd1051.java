import java.util.Scanner;

public class Beecrowd1051 {
	
	static double ImpostodeRenda1(double renda) {
		
			double imposto = 0;
			double porcentagem =0;
			if(renda >= 0.0 && renda <= 2000) {
				System.out.println("Isento");
			}
			else if(renda > 2000 && renda <= 3000) {
				porcentagem = 0.08;
				imposto = renda * porcentagem;
				System.out.println("R$ "+imposto);
			}else if(renda > 3000 && renda <=4500) {
				porcentagem = 0.18;
				imposto = renda * porcentagem;
				System.out.println("R$ "+imposto);
			}else if(renda > 4500) {
				porcentagem = 0.28;
				imposto = renda * porcentagem;
				System.out.println("R$ "+imposto);
			}
			return imposto;
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double renda = entrada.nextDouble();
		
		ImpostodeRenda1(renda);
		entrada.close();
	}
}

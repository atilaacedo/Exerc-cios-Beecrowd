import java.util.Scanner;

public class Beecrowd1048 {
	
	static void ReajusteSalarial1(double salario) {
		double reajuste = 0;
		String porcentagem = " ";
		if(salario <= 400 ) {
			porcentagem = "15 %";
			reajuste =  0.15 * salario;
			salario = reajuste + salario;
		}else if(salario > 400 && salario <= 800) {
			porcentagem = "12 %";
			reajuste = 0.12 * salario;
			salario = reajuste + salario;
		}else if(salario > 800 && salario <= 1200) {
			porcentagem = "10 %";
			reajuste = 0.10 * salario;
			salario = reajuste + salario;
		}else if(salario > 1200 && salario <= 2000) {
			porcentagem = "7 %";
			reajuste = 0.07 * salario;
			salario = reajuste + salario;
		}else if(salario > 2000) {
			porcentagem = "4 %";
			reajuste = 0.04 * salario;
			salario = reajuste + salario;
		}
		System.out.printf("Novo salario: %.2f ", salario);
		System.out.printf("\nReajuste ganho: %.2f ", reajuste);
		System.out.println("\nEm percentual: " +  porcentagem);
	
	}
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String salario = entrada.nextLine();
		double GG = Double.parseDouble(salario);
		
		ReajusteSalarial1(GG);
		
		
		
		entrada.close();
	}
	
}

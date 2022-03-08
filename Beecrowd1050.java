import java.util.Scanner;

public class Beecrowd1050 {
	
	static void Regiao(int n1) {
		String regiao = " ";
		
		if(n1 == 61) {
			regiao = "Brasilia";
		}else if(n1 == 71) {
			regiao = "Salvador";
		}else if(n1 == 11) {
			regiao = "Sao Paulo";
		}else if(n1 == 21) {
			regiao = "Rio de Janeiro";
		}else if(n1 == 32) {
			regiao = "Juiz de Fora";
		}else if(n1 == 19) {
			regiao = "Campinas";
		}else if(n1 == 27) {
			regiao = "Vitoria";
		}else if(n1 == 31) {
			regiao = "Belo Horizonte";
		}else {
			regiao = "DDD nao cadastrado";
		}
		
		System.out.println(regiao);
		
	}
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int ddd = entrada.nextInt();
		Regiao(ddd);
		
		
		entrada.close();
	}
	
}

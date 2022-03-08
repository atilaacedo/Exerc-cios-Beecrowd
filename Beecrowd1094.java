import java.util.Scanner;

public class Beecrowd1094 {
	int testes;
	
	char cobaias;
	
	int quantia;
	
	int coelhoN;
	int ratoN;
	int sapoN;
	
	public static void main(String[] args) {
		
		Beecrowd1094 e = new Beecrowd1094();
		e.organizadorDeCobaias();
	}
	
	
	void organizadorDeCobaias() {
		Scanner e = new Scanner(System.in);
		
		int i =0;
		testes = e.nextInt();
		int total = 0;
		int totalC = 0;
		int totalR = 0;
		int totalS = 0;
		
		double porcC = 0.00;
		double porcR = 0.00;
		double porcS = 0.00;
		
		if(testes > 0) {
			
			while (i < testes) {
			quantia = e.nextInt();
			cobaias = e.next().charAt(0);
					
			switch(cobaias) {
				
				case 'C':
					coelhoN +=  quantia;
					totalC = coelhoN;
					
					break;
				case 'R':
					ratoN += quantia;
					totalR = ratoN;
					
					break;
				case 'S':
					sapoN += quantia;
					totalS = sapoN;
					
					break;
				}
				
				total += quantia;
				
				
				i++;
			}		
			e.close();
		}
	
			
		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + totalC);
		System.out.println("Total de ratos: " + totalR);
		System.out.println("Total de sapos: " + totalS);
		System.out.printf("Percentual de coelhos: %.2f", (double) totalC / total * 100);
		System.out.println(" %");
		System.out.printf("Percentual de ratos: %.2f", (double) totalR/total * 100);
		System.out.println(" % ");
		System.out.printf("Percentual de sapos: %.2f", (double) totalS/total * 100);
		System.out.println(" % ");
	}
	
	
}

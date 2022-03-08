import java.util.Scanner;

public class Beecrowd1099 {
	
	/*
	 * Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste de dois inteiros X e Y. 
	 * Você deve apresentar a soma de todos os ímpares existentes entre X e Y.

Entrada
A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.

Saída
Imprima a soma de todos valores ímpares entre X e Y.
	 */
	
	public static void main(String[] args) {
		
		
		Beecrowd1099 soma = new Beecrowd1099();
		soma.somarImpares();
	}
	
	public void somarImpares() {
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		int a ;
		int b ;
				
	
		int[] soma = new int[n];
			
					for(int k = 0; k < n; k++) {
					
						a = s.nextInt();
						b = s.nextInt();	
						
						// 8  > 3 ( 5, 7)
						if( b > a) {
							for(int j = a +1; j < b; j++) {
								if(j%2 != 0) {
									soma[k] += j;
								}
							}
						}else {
						
							for(int j = b +1; j < a; j++) {
								if(j%2 != 0) {
									soma[k] += j;
								}
							}
						
			    		
						}
						System.out.println(soma[k]);
					}
	}
}

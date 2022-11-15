package Beecrowd1022;

import java.util.Scanner;

public class TDARacional {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testes = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < testes; i++) {
			String operacao = sc.nextLine();
			
			String numeros[] = operacao.split(" ");
			
			int n1 = Integer.parseInt(numeros[0]);
			int d1 = Integer.parseInt(numeros[2]);
			int n2 = Integer.parseInt(numeros[4]);
			int d2 = Integer.parseInt(numeros[6]);
			int numerador = 0;
			int denominador = 0;
			
			switch(numeros[3]) {
				case "+":
					numerador = (n1*d2 + n2 * d1) ;
					denominador = d1*d2;
					break;
				case "-":
					numerador = (n1*d2 - n2 * d1) ;
					denominador = d1*d2;
					break;
				case "*":
					numerador = (n1*n2) ;
					denominador = d1*d2;
					break;
				case "/":
					numerador = (n1*d2) ;
					denominador = d1*n2;
					break;
					
			}
			
			int menor = numerador;
			
			if(denominador < numerador) {
				menor = denominador;
			}
			int denominadorSimplificado = denominador;
			int numeradorSimplificado = numerador;
			for(int j =Math.abs(menor); j >= 1; j--) {
				if(denominadorSimplificado % j == 0 && numeradorSimplificado % j == 0) {
					denominadorSimplificado = denominadorSimplificado /j;
					numeradorSimplificado = numeradorSimplificado/j;
					break;
				}
			}
			
			String resultado = numerador + "/" + denominador + " = " + numeradorSimplificado + "/"+ denominadorSimplificado;
			
			System.out.println(resultado);
			
		}
		sc.close();
		
	}
	
	
	
}

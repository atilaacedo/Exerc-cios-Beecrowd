package Beecrowd1045;

import java.util.Scanner;

public class TiposDeTriangulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		String triangulo = calcularTipoDeTriangulo(a, b, c);
		
		System.out.println(triangulo);
		
	}
	
	
	static String calcularTipoDeTriangulo(double a, double b, double c) {
		if(b > a && b >= c) {
			double aux = a;
			a = b;
			b = aux;
		}else if(c > a && c >= b) {
			double aux = a;
			a = c;
			c = aux;
		}
		
		String tipoDeAngulo = "";
		
		if((a*a) == (b*b + c*c))
			tipoDeAngulo = "TRIANGULO RETANGULO";
		else if((a*a) > (b*b + c*c)) 
			tipoDeAngulo = "TRIANGULO OBTUSANGULO";
		else if((a*a) < (b*b + c*c))
			tipoDeAngulo = "TRIANGULO ACUTANGULO";
		
		
		if(a >= (b+c))
			return "NAO FORMA TRIANGULO";
		
		if(a == b && b == c) 
			return tipoDeAngulo + "\nTRIANGULO EQUILATERO";
		
		
		if(a == b || b == c || a == c)
			return tipoDeAngulo + "\nTRIANGULO ISOSCELES";
		
		
		
		
		return tipoDeAngulo;
	}


}

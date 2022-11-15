package Beecrowd2233;

import java.util.Scanner;

public class EtiquetasColoridas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String red = sc.nextLine();
		String green = sc.nextLine();
		String blue = sc.nextLine();
		
		String hex = calcularEtiquetas(red, green, blue);
		System.out.println(hex);
	}
	
	
	public static String calcularEtiquetas(String red, String green, String blue) {
		String respostaEmHexa = "";
		int r = Integer.parseInt(red,16);
		int g = Integer.parseInt(green, 16);
		int b = Integer.parseInt(blue,16);
		
		long resposta = 0;	
		long greenQuantidade = r/g;
		greenQuantidade*=greenQuantidade;
		
		long blueQuantidade = g/b;
		blueQuantidade*=blueQuantidade;
		blueQuantidade = blueQuantidade*greenQuantidade;
		
		resposta = 1 + greenQuantidade + blueQuantidade;
			
		respostaEmHexa = Long.toHexString(resposta);
		return respostaEmHexa;
	}
	
	
	
	
}

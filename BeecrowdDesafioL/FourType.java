package BeecrowdDesafioL;


import java.util.Scanner;


public class FourType {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String numero = sc.nextLine();
		int base = 5;
		int numeroComMaisQuatro = 0;
		int cont = 0;
		int contMaior = 0;
		int numeros = Integer.parseInt(numero);
		int porcentagem =0;
		for (int i = 5; i < numeros; i++) {
			cont = 0;
		
		     double nd = Double.parseDouble(numero);   
			String s4 = Double.toString(getValueInBase(nd, i));
		
			System.out.println(s4);
			for (int j = 0; j < s4.length(); j++) {
				if(s4.charAt(j) == '4') {
					cont++;
				}
			}
			
			porcentagem = cont * 100 / numeros;
			
			if(porcentagem > contMaior) {
				base = i;
				contMaior = porcentagem;
			}
			
		}
		
		System.out.println(base);
	}
	

	
	public static double getValueInBase(double n, int b){
	    double rv = 0;

	   double p = 1;
	   while(n > 0){
		   double d =  (n % b);
	       n = n / b;
	       rv += p * d;
	       p = p * 10;
	   }

	    return rv;
	}
	
}

import java.util.Scanner;

public class Beecrowd1061 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Feito
		String Dia1 = entrada.next();
		int diaA = entrada.nextInt();
		
		int hora1 = entrada.nextInt();
		String incr = entrada.next();
		int minuto1 = entrada.nextInt();
		String incr1 = entrada.next();
		int segundo1 = entrada.nextInt();
		
		
	
		
		//Feito
		String Dia2 = entrada.next();
		int diaB = entrada.nextInt();
		
		int hora2 = entrada.nextInt();
		String incr2 = entrada.next();
		int minutos2 = entrada.nextInt();
		String incr3 = entrada.next();
		int segundo2 = entrada.nextInt();
		
		
		
		int seg1 = (diaA * 24 * 60 * 60) + (hora1 * 60 * 60) + (minuto1 * 60) + (segundo1);
		int seg2 = (diaB * 24 * 60 * 60) + (hora2 * 60 * 60) + (minutos2 * 60) + (segundo2);
		
		int difSeg = seg2 - seg1;
		
		int difSegT = difSeg;
		
		int dias = difSegT/(24*3600);
		difSegT -= dias*24*3600;
		
		int horas = difSegT /3600;
		difSegT -= horas*3600;
		
		int minutos = difSegT /60;
		difSegT -= minutos*60;
		
		int segundos = difSegT;
		
		
		System.out.println(dias + " dia(s)");
		System.out.println(horas + " hora(s)");
		System.out.println(minutos + " minuto(s)");
		System.out.println(segundos + " segundo(s)");
		entrada.close();
	}
}

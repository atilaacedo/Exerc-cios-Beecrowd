import java.util.Scanner;

public class Beecrowd1168 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int teste = sc.nextInt();
		
		for (int i = 0; i < teste; i++) {
			String numero = sc.next();
			int leds = 0;
			for (int j = 0; j < numero.length(); j++) {
				if(numero.charAt(j) == '1') {
					leds+=2;
				}else if(numero.charAt(j)== '4'){
					leds+=4;
				}else if(numero.charAt(j) == '7'){
					leds+=3;
				}else if(numero.charAt(j)=='2'|| numero.charAt(j)=='3' || numero.charAt(j)=='5') {
					leds+=5;
				}else if(numero.charAt(j)=='8') {
					leds+=7;
				}else {
					leds+=6;
				}
				
		}
			System.out.println(leds +" leds");
		
		
	}
	
	
	}
}

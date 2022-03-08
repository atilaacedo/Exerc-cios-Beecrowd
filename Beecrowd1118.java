import java.util.Scanner;

public class Beecrowd1118 {
	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		double media1 = en.nextDouble();

		boolean isAlive = true;
		boolean isALive3 = true;
		while(isAlive) {
			if(!(media1 >= 0 && media1 <= 10)) {
				System.out.println("nota invalida");
				media1 = en.nextDouble();
			}else {
				isAlive = false;
			}
		}
		boolean isAlive2 = true;
		double media2 = en.nextDouble();
		while(isAlive2) {
			if(!(media2 >= 0 && media2 <= 10)) {
				System.out.println("nota invalida");
				media2 = en.nextDouble();
			}else {
				isAlive2 = false;
			}
			
			
		}
		double media = (media1+media2)/2;
		System.out.printf("media = %.2f\n" , media);

		System.out.println("novo calculo (1-sim 2-nao)");
		int repeat = en.nextInt();
		
		do {

			isAlive = true;
			 isAlive2 = true;

			if(repeat == 1) {
				media1 = en.nextDouble();
				while(isAlive) {
					if(!(media1 >= 0 && media1 <= 10)) {
						System.out.println("nota invalida");
						media1 = en.nextDouble();
					}else {
						isAlive = false;
					}
				}
				media2 = en.nextDouble();
				while(isAlive2) {
					if(!(media2 >= 0 && media2 <= 10)) {
						System.out.println("nota invalida");
						media2 = en.nextDouble();
					}else {
						isAlive2 = false;
					}
					
				}
				media = (media1+media2)/2;
				System.out.printf("media = %.2f\n" , media);
				System.out.println("novo calculo (1-sim 2-nao)");
				repeat = en.nextInt();
			}else if(repeat == 2) {
				isALive3 = false;
			}else if(repeat !=2 && repeat !=1) {
				System.out.println("novo calculo (1-sim 2-nao)");
				repeat = en.nextInt();
			}
		}while(isALive3);

		en.close();
	}
}

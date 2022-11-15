
import java.util.Scanner;

public class Beecrowd1848{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isAlive  = true;
		int cont =0, total = 0;
		while(isAlive) {
			String piscadaGrito = sc.nextLine();
			
			String piscadas[] = piscadaGrito.split("");
			
			if(piscadas[2].equals("*")) {
				total +=1;
			}
			if(piscadas[1].equals("*")) {
				total+=2;
			}
			if(piscadas[0].equals("*")) {
				total+=4;
			}
			
			if(piscadaGrito.equals("caw caw") ) {
				System.out.println(total);
				total = 0;
				cont++;
			}
			
			
			if(cont == 3) {
				isAlive = false;
			}
		}
}
	}

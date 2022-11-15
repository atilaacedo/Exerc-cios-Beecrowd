import java.util.Scanner;

public class Beecrowd1837 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, quociente = 0, resto = 0;
		
			 n1 = sc.nextInt();
			 n2 = sc.nextInt();
			
			 quociente = n1 / n2;
			 resto = n1 % n2;
			 if(resto < 0) {
					if(quociente < 0 && quociente != -1) {
						quociente--;
					}else if(quociente > 0) {
						quociente++;
					}
					
					resto =  n1  - (n2*quociente);
				}
			 
			
		n1--;
		System.out.println(n1);
		
		System.out.println(quociente + " " + resto);
		sc.close();
	}
}

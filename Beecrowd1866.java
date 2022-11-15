import java.util.Scanner;

public class Beecrowd1866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testes = sc.nextInt();
		
		for (int i = 1; i <= testes; i++) {
			int num = sc.nextInt();
			if(num % 2 == 0 ) {
				System.out.println("0");
			}else {
				System.out.println("1");
			}
		}
	}
}

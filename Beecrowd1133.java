import java.util.Scanner;

public class Beecrowd1133 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num1 >num2) {
			for(int i = num2+1; i < num1; i++) {
				if(i % 5 == 2 || i%5 == 3) {
					System.out.println(i);
				}
			}
		}
 		
		
		if(num2 > num1) {
			for(int i = num1+1; i <num2; i++) {
				if(i % 5 == 2 || i%5 == 3) {
					System.out.println(i);
				}
			}
		}
		
		scan.close();
	}
}

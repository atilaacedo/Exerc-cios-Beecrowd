import java.util.Scanner;

public class Beecrowd1142 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nuneroL = sc.nextInt();
		int n1 = 1, n2 = 2,n3 = 3;
		
		for(int i = 0; i < nuneroL; i++) {
			System.out.println(n1 + " " + n2 + " " + n3 + " PUM");
			n1+=4;
			n2+=4;
			n3+=4;
		}
		
		sc.close();
	}
}

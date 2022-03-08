import java.util.Scanner;

public class Beecrowd1132 {
	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);

		int x = en.nextInt();
		int y = en.nextInt();

		int soma = 0;
		//130
		if(x > y) {
			for(int j = y ; j <= x; j++) {
				if(j%13 != 0) {
					soma += j;
				}
			}
		}else {
			for(int j = x  ; j <= y; j++) {
				if(j%13 != 0) {
					soma += j;
				}
			}
		}

		System.out.println(soma);
		en.close();
	}
}

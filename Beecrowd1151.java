import java.util.Scanner;

public class Beecrowd1151 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int fib, seq = 0, aux = 1;
        //5
        for (int i = 1; i <= N; i++) {
        	if (i == N) System.out.println(seq);
        	else System.out.print(seq + " ");
        	fib = seq + aux;
        	seq = aux;
        	aux = fib;
        }

        leitor.close();
    }


}

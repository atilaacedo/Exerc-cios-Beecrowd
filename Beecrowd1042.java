import java.util.Scanner;

public class Beecrowd1042 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] num = new int[3];
		
		for(int i = 0; i < 3; i++) {
			num[i] = entrada.nextInt();
		}
		
		
		sort(num);
		
		entrada.close();
	}

	public static void swap(int a, int b) {
		int aux;
		aux = a;
		a = b;
		b=aux;
	}

	public static void imprimeArray(int[] num) {
		System.out.printf("%d\n%d\n%d\n", num[0], num[1], num[2]);
	}

	public static void sort(int [] num) {
		
		int[] matrizAux = new int[3];

		for(int i = 0; i < 3; i++) {
			matrizAux[i] = num[i];
		}
		for(int k = 0; k < matrizAux.length -1; k++) {
			for(int j = 0; j < matrizAux.length -1 ; j++ ) {
				if(matrizAux[j] > matrizAux[j+1]) {
					int aux = matrizAux[j];
					matrizAux[j] = matrizAux[j+1];
					matrizAux[j+1] = aux;
				}
				
			}
		}
		
		
		
		imprimeArray(matrizAux);
		
		imprimeArray(num);

	}
}

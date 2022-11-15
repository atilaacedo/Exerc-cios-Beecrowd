package Beecrowd1318;

import java.util.HashMap;
import java.util.Scanner;

public class BilhetesFalsos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Boolean> ingressosOr =  new HashMap<>();
		HashMap<Integer, Boolean> falso =  new HashMap<>();
		int n = -1, m = -1;
		
		while(n != 0 && m != 0) {
			n = sc.nextInt();
			m = sc.nextInt();
			int falsificados = 0;
			int[] ingressos = new int[m];
			for (int i = 0; i < m; i++) {
				ingressos[i] = sc.nextInt();
				ingressosOr.put(ingressos[i], false);
				falso.put(ingressos[i], false);
			}
			
			for (int i = 0; i < ingressos.length; i++) {
				if(ingressos[i] > n || ingressosOr.get(ingressos[i]) == true && falso.get(ingressos[i]) != true) {
					falsificados++;
					falso.put(ingressos[i], true);
				}else {
					ingressosOr.put(ingressos[i], true);
				}
			}
			
			
			ingressosOr.clear();
			if(n !=0 && m!=0)
				System.out.println(falsificados);
		}
		
	}
}

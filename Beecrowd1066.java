import java.util.Scanner;

public class Beecrowd1066 {
	public static void main(String[] args) {
	
		Scanner en = new Scanner(System.in);
		
		int[] num = new int[5];
		int par= 0 , imp = 0 , pos= 0, neg = 0; 
		for(int k = 0; k < 5; k++) {
			
			num[k] = en.nextInt();
			
			if(num[k] % 2 == 0) {
				par += 1;
			}else {
				imp +=1;
			}
			
			
			if(num[k] > 0) {
				pos+= 1;
			}else if(num[k] < 0){
				neg+=1;
			}
		
		}
		
		System.out.println(par + " valor(es) par(es)");
		System.out.println(imp + " valor(es) impar(es)");
		System.out.println(pos + " valor(es) positivo(s)");
		System.out.println(neg + " valor(es) negativo(s)");
		
		
		en.close();
	}
}

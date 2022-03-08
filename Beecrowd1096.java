
public class Beecrowd1096 {
	int i;
	int j;
	public static void main(String[] args) {
		Beecrowd1096 s = new Beecrowd1096();
		s.sequencia2();
	}
	
	
	public void sequencia2() {
		j = 8;
		i = 1;
		for(int k = 9; k >= i; k+=0) {
			j--;
			if(j < 5 ) {
				j = 7;
				i += 2;
				if(i > 9) {
					break;
				}
			} 
			System.out.print("I=" + i + " ");
			System.out.println("J=" + j );
		}
	}
}

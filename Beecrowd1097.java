
public class Beecrowd1097 {
	public static void main(String[] args) {
		Beecrowd1097 s = new Beecrowd1097();
		s.sequencia3();
	}
	
	
	public void sequencia3() {
		int i = 1;
		int j =  7;
		while(i <= 9 ) {
			for(int k = 0; k < 3; k++) {
				System.out.println("I=" + i + " J=" +j);
				j --;
			}
			i += 2;
			j += 5;
		}
	}
}



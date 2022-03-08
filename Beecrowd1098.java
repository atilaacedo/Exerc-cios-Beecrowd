
public class Beecrowd1098 {
	public static void main(String[] args) {
		Beecrowd1098 s = new Beecrowd1098();
		s.sequencia4();
	}
	
	
	public void sequencia4() {
		double i = 0;
		double[] j  = new double [3];
		j [0] = 1;
		j[1] = 2;
		j[2] = 3;
		double incr = 0.2;
		
		while(i <= 2) {
				i += incr;
			for(int k = 0; k <3; k++) {	
					System.out.printf("I=%.2f J=%.1f  \n", i  - 0.20, j[k]);
	
				j[k] += 0.2;
			}
			
		}
	}
}

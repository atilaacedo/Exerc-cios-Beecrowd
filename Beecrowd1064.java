import java.util.Scanner;

class Beecrowd1064 {
	
	public static void main(String[] args) {
			Beecrowd1064 p = new Beecrowd1064();
			p.Positivos();   
			final double PI = Math.PI;
			System.out.println(PI);
	}

	double Positivos(){
	  double tod = 0;
      int pos = 0;
      Scanner entrada = new Scanner(System.in);
		
      double[] numeros = new double[6];
		
      for(double i: numeros) {
    	  i = entrada.nextDouble();
    	  if(i > 0){
    		  tod += i;
    		  pos++;
    	  }
        
      }
      double media = tod / pos;
      System.out.println(pos + " valores positivos");
      System.out.printf("%.1f\n", media);
      entrada.close();
      return pos;
  }
}


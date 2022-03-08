import java.io.IOException;
	 
	  import java.util.Scanner;
public class Beecrowd1065 {
		
	 	static int cont;
	    public static void main(String[] args) throws IOException {
	    
	    Scanner e = new Scanner(System.in);

	      int [] pares = new int[5];

	      for(int i: pares){
	        i = e.nextInt();

	        if(i % 2 == 0){
	          cont++;
	        }
	      }
	    System.out.println(cont + " valores pares");
	    e.close();	    }
	 
	}

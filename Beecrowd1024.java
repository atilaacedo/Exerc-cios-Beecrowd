import java.util.Scanner;

public class Beecrowd1024 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        Beecrowd1024 crip = new Beecrowd1024();
        int teste = entrada.nextInt();
        while(teste >= 0) {
        	crip.criptografar(crip.lerTexto());
        	teste--;
        }
    }

    public String lerTexto(){
        String texto = entrada.nextLine();
        return texto;
    }
    
    public void escreveTexto(byte[] b) {
    	for(int i= 0; i < b.length; i++) {
    		char c = (char) b[i];
    		System.out.print(c);
    	}
    }

    public void criptografar(String texto){
        byte[] b = texto.getBytes();
        byte[] b2 = new byte[texto.length()];
        int tamanho = texto.length() -1;
        int metade = texto.length()/2;
        
        for(int i = 0; i < b.length; i++){
        	if((b[i] >= 'A' && b[i] <= 'Z' )|| b[i] >= 'a' && b[i] <= 'z') {
       
        			b[i]+=3; 	
        	}
        }
        for(int j = 0; j < b.length; j++) {
        	 b2[j] = b[tamanho-j];
        }
        
        for(int k = metade; k < b.length; k++) {
        	b2[k]--;
        }
        
        this.escreveTexto(b2);
    }

}

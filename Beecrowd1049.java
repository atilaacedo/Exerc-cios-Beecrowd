import java.util.Scanner;

public class Beecrowd1049 {

	
	static void Classificacao(String c1, String c2,String c3) {
		
		String animal = " ";
		
		 if(c1.equals("vertebrado") && c2.equals("ave") && c3.equals("carnivoro")) {
			animal = "aguia";
		}else if(c1.equals("vertebrado") && c2.equals("ave") && c3.equals("onivoro")) {
			animal = "pomba";
		}else if(c1.equals("vertebrado") && c2.equals("mamifero") && c3.equals("onivoro")) {
			animal = "homem";
		}else if(c1.equals("vertebrado") && c2.equals("mamifero") && c3.equals("herbivoro")) {
			animal = "vaca";
		}else if(c1.equals("invertebrado") && c2.equals("inseto") && c3.equals("hematofago")) {
			animal = "pulga";
		}else if(c1.equals("invertebrado") && c2.equals("inseto") && c3.equals("herbivoro")) {
			animal = "lagarta";
		}else if(c1.equals("invertebrado") && c2.equals("anelideo") && c3.equals("hematofago")) {
			animal = "sanguessuga";
		}else if(c1.equals("invertebrado") && c2.equals("anelideo") && c3.equals("onivoro")) {
			animal = "minhoca";
		}
		
		System.out.println(animal);
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String class1 = entrada.nextLine();
		String class2 = entrada.nextLine();
		String class3 = entrada.nextLine();
		
		Classificacao(class1, class2, class3);
		entrada.close();
	}
}

import java.util.Scanner;
public class exercicioTriangulo {
	public static void main (String args []) {
		Scanner ler = new Scanner (System.in);
		
		//variaveis
		double a,b,c;
		
		//leitura de dados
		System.out.println("Insira o valor de A.");
		a = ler.nextDouble();
		
		System.out.println("Insira o valor de B.");
		b = ler.nextDouble();
		
		System.out.println("Insira o valor de C.");
		c = ler.nextDouble();
		
		//Tomada de decisões 
		if (a+b>c & a+c>b & b+c>a) {
			
			if (a==b & a==c & b==c) {
			System.out.println("Triângulo equilátero");
			
			} else if (a!=b && a!=c && b!=c) {
				System.out.println("Triângulo escaleno");
			} else {
				System.out.println("Triangulo Isóceles");
			}
		}else {
			System.out.println("Não é um triâgulo.");
		}
		ler.close();
	}
}

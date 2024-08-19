import java.util.Scanner;
public class parade {
	public static void main (String args []) {
		Scanner ler = new Scanner (System.in);
		
	
		//Variaveis
		double c, l, lT;
		
		System.out.println ("Digite a largura da parede.");
		l = ler.nextDouble();
		
		
		System.out.println ("Digite o comprimento da parade.");
		c = ler.nextDouble();
		
		lT = (c*l)/3.8;
		System.out.println ("Você irá precisar de:" + lT + "Latas de tintas que cobrem 3,8m².");
		
		ler.close();
		
		
	}
}

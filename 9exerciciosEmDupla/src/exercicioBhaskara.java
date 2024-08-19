import java.util.Scanner;
public class exercicioBhaskara {
	public static void main (String args []) {
		Scanner ler = new Scanner (System.in);
	
		//variaveis 
		double a,b,c,d,x1,x2;
		
		//Leitura de dados
		System.out.println("Digite o valor de A.");
		a = ler.nextDouble();
		
		System.out.println("Digite o valor de B.");
		b = ler.nextDouble();
		
		System.out.println("Digite o valor de C.");
		c = ler.nextDouble();
		
		//calculo do delta
		d = (b*b) -4*a*c;
		
		if (d>0) {
			x1 = (-b + Math.sqrt(d)) / 2*a;
			x2 = (-b - Math.sqrt(d)) / 2*a;
			System.out.println("A equação possui 2 raízes reias:" + x1 + x2);
		} else if (d==0) {
			x1 = -b / (2*a);
			System.out.println("A equação possui apenas uma raiz real:" + x1);
		}else {
			System.out.println("A equação não possui uma raiz real.");
		}
		ler.close();
	}
}
import java.util.Scanner;
public class ordemCrescente {
	public static void main (String args []) {
		Scanner ler = new Scanner (System.in);
		
		//variaveis 
		int a, b, c, n1, n2, n3;
		n1 = 0;
		n2 = 0;
		n3 = 0;
		
		//leitura de dados
		System.out.println("Digite o valor de A.");
		a = ler.nextInt();
		
		System.out.println("Digite o valor de B.");
		b = ler.nextInt();
		
		System.out.println("Digite o valor de C.");
		c = ler.nextInt();
		
		if (a<=b && a<=c) {
			n1 = a;
			if (b<=c) {
				n2 = b;
				n3 = c;
			} else {
				n2 = c;
				n3 = b;
			}
		} else if (b<=a && b<=c) {
			n1 = b;
			if (a<=c) {
				n2 = a;
				n3 = c;
			} else {
				n2 = c;
				n3 = a;
			}
		} else if (c<=a && c<=b) {
			n1 = c;
			if (a<=b) {
				n2 = a;
				n3 = b;
			} else {
				n2 = b;
				n3 = a;
			}
			System.out.println("teste" + n1);
			System.out.println("teste" + n2);
			System.out.println("teste" + n3);
			ler.close();
		}
	}
}

import java.util.Scanner;
public class DescontoProduto {
	public static void main (String args []) {
		Scanner ler = new Scanner (System.in);
		
		//Variaveis
		double p, pf, d;
		
		System.out.println ("Subtrair o desconto de um preço de um produto.");
		
		//Leitura de dados
		System.out.print ("Digite o preço do produto.");
		p = ler.nextDouble();
		
		System.out.print ("Digite a porcentagem do desconto. ");
		d = ler.nextDouble();
		
		pf = (p/100*d);
		
		System.out.println ("O valor final do produto é: R$" + pf);
		
		ler.close();
	}
}

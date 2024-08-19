import java.util.Scanner;
public class IPVA {
	public static void main (String args []) {
		
	Scanner ler = new Scanner(System.in);
	
	//Variaveis
	double vC, IPVA;
	
	System.out.println ("Quer saber o valor do seu IPVA?");
	
	//leitura de dados
	System.out.println ("Digite o preço do carro.");
	vC = ler.nextDouble();
	
	IPVA = vC*0.04;
			
			System.out.print("O valor a ser pago deste carro é:" + IPVA);
			
			ler.close();
	}
}

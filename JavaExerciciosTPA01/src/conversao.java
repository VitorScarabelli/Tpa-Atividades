import java.util.Scanner;
public class conversao {
public static void main (String args []) {
	Scanner ler = new Scanner(System.in);
	
	//Variaveis 
	double e, c, eR;
	
	//leitura de dados
	System.out.println ("Digite o valor em euros.");
	e = ler.nextDouble();
	
	System.out.println ("Digite a cotação atual.");
	c = ler.nextDouble();
	
	//calculo
	eR = e/c;
	
	//apresentação
	System.out.println ("O valor da conversão em reais é:" + "R$" + eR);
	
		ler.close();
	}
}


import java.util.Scanner;
public class SomaQuadrados {
	public static void main (String args []) {
		Scanner ler = new Scanner (System.in);
		
		//Variaveis
		double n1, n2, n3, soma;
		
		System.out.println ("Saiba a soma de três quadrados de três números!");
		
		//Leitura dos dados
		
	System.out.println ("Digite o primeiro número.");
	n1 = ler.nextDouble();
	
	System.out.println ("Digite o segundo número.");
	n2 = ler.nextDouble();
	
	System.out.println ("Digite o terceiro número");
	n3 = ler.nextDouble();
	
	//Calculo dos quadrados
	soma = ( n1 * n1 ) + ( n2 * n2 ) + ( n3 * n3 );
	
	//Apresentação do resultado
	System.out.print ("A soma do quadrado dos três números é:" + soma);
	
	ler.close();
	}
}

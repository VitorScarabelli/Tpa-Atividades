import java.util.Scanner;
public class AlternarValores {
	public static void main (String Args []) {
		Scanner ler = new Scanner (System.in);
		
		//Variaveis
		Double valor1, valor2, valor3;
		
		System.out.println ("Alterador de valores.");
		
		//Leitura de dados
		System.out.println ("Digite o valor n1:");
		valor1 = ler.nextDouble();
		
		System.out.println("Digite o valor n2:");
		valor2 = ler.nextDouble();
				
		valor3 = valor1;
		valor1 = valor2;
		valor2 = valor3;
		
		System.out.println("O valor 1 é igual a:" + valor1);
		System.out.println("O valor 2 é igual a:" + valor2);
		ler.close();
	}

}

import java.util.Scanner;
public class Salario {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		
		//Variaveis
		double s, d, sF;
		
		//Texto
		System.out.println("Quer saber quanto deve receber ao total contando com o valor pago pelo governo por dependente?");
		
		//lendo dados
		
	System.out.println ("Digite o seu salario.");
	s = ler.nextDouble();
	
	System.out.println("Digite a quantidade de dependentes.");
	d = ler.nextDouble();
	
	//Calculo
	sF = (d*55) + s;
	
	System.out.print("O seu salário final a ser recebido vai ser: R$" + sF);
	
	ler.close();
	}
	
}

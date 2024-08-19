import java.util.Scanner;

public class ConversorMetros {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		
		//Variaveis
		double km, metros;
		
		//Leitura de dados
		System.out.println ("Digite a quantidade de metros.");
		metros = ler.nextInt();
		
		//Calculo
		km = metros/1000;
		
		//Apresentação
		System.out.print ("Essa é a conversão para km:" + km);
		
		ler.close();
	}

}

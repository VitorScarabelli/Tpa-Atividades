import java.util.Scanner;
public class AntecessorSucessor {
	public static void main (String args []) {
		Scanner ler = new Scanner (System.in);
		
		//Variaveis
		int num, ant, suce;
		
		System.out.println ("Quer saber o antecessor e sucessor de um número?");
		
		//Leitura de dados
		System.out.println ("Digite o número desejado.");
		num = ler.nextInt();
		
		//Antecessor
		ant = num - 1;
		System.out.println("O antecessor deste número é:" + ant);
		
		//Sucessor
		suce = num + 1;
		System.out.println("O sucessor deste número é:" + suce);
		
		ler.close();
	}
}
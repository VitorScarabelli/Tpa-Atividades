import java.util.Scanner;
public class Algoritmos {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		
		//Variaveis
		int nascimento, anoAtual, idade;
		
		System.out.println ("Saiba sua idade!");
		
		//Leitura de dados
		System.out.println("Digite o ano de seu nascimento");
		nascimento = ler.nextInt();
		
		System.out.println("Digite o ano atual/desejado");
		anoAtual = ler.nextInt();
		
		//Cálculo
		idade = (anoAtual-nascimento);
		
		System.out.println("Sua idade é:" + idade);
		idade = ler.nextInt();
		
		ler.close();
	}
}

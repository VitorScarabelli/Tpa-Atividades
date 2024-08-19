import java.util.Scanner;
public class exercicioIdade {
	public static void main (String args []) {
		Scanner ler = new Scanner (System.in);
		
		//variaveis
		int aa, an, id;
		
		//leitura de dados
		System.out.println ("Digite o seu ano de nascimento.");
		an = ler.nextInt();
		
		System.out.println ("Digite o ano atual.");
		aa = ler.nextInt();
		
		//calculo idade
		id = aa - an;
		
		//tomada de decisão em cascata
		if (id<10) {
			System.out.println ("Criança");
		}else if (id<18) {
			System.out.println ("Adolescente");
		}else if (id<60) {
			System.out.println ("Adulto");
		}else {
		System.out.println ("Idoso");
		}
		ler.close();
	}
}

import java.util.Scanner;
public class exercicio1 {
 public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	//VAriaveis 
	int i,aE,aN;
	
	//leitura
	System.out.println("Escreva o seu ano de nascimento.");
	aN = ler.nextInt();
	
	System.out.println("Escreva o ano da próxima eleição.");
	aE = ler.nextInt();
	
	i = aE-aN;
	
	if (i>=16) {
		System.out.println("Você poderá votar na próxima eleição.");
	}
		else {
		System.out.println("Você não poderá votar na próxima eleição.");
	}
	ler.close();
 	}
}

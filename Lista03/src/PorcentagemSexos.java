import java.util.Scanner;
public class PorcentagemSexos {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		
		//Variaveis
		double nH, nM, tA, pH, pM;
		
		//Texto
		System.out.println("Calculadora de porcentagem de homens e mulheres em uma sala.");
			
		//Leitura de dados
		System.out.println("Digite a quantidade de alunos na sala.");
		tA = ler.nextInt();
		
		System.out.println("Digite a quantidade de homens.");
		nH = ler.nextInt();
		
		System.out.println("Digite a quantidade de mulheres.");
		nM = ler.nextInt();
		
		//Calculos
		pH = nH/100*tA;
		pM = nM/100*tA;
		
		System.out.println("A porcentagem de homens na sala é: %" + pH);
		System.out.println("A porcentagem de mulheres na sala é: %" + pM);
		
		ler.close();
	}

}

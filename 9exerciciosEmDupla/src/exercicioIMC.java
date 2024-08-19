import java.util.Scanner;
public class exercicioIMC {
	public static void main (String args []) {
		Scanner ler = new Scanner (System.in);
		
		//variaveis 
		double a,p,imc;
		
		//leitura de dados
		System.out.println("digite sua altura em metros.");
		a = ler.nextDouble();
		
		System.out.println("Digite seu peso em quilos.");
		p = ler.nextDouble();
		
		//contas
		imc = p/(a*a);
		
		//tomada de decisão
		if (imc<18.5) {
			System.out.println("Excesso de magreza.");
		}else if (imc<25) {
			System.out.println("Peso normal");
		}else if (imc<30) {
			System.out.println("Excesso de peso");
		} else if (imc<35) {
			System.out.println("Obesidade grau I");
		} else if (imc<40) {
			System.out.println("Obesidade grau II");
		} else {
			System.out.println("Obesidade grau III");
		}
		ler.close();
	}
}

import java.util.Scanner;
public class descontoSalario {
	public static void main (String args []) {
		Scanner ler= new Scanner (System.in);
	
		//variaveis
		double sal, des;
		
		//leitura de dados
		System.out.println("Digite o seu salário");
		sal = ler.nextDouble();
		
		if (sal<=1434.59) {
			System.out.println("Seu salário não tem descontos.");
			
		} else if (sal<2150) {
			des = ((sal*7.5)/100) - 107.59;
			System.out.println("Seu salário possui um desconto de:R$" + des);
			
		} else if (sal<2886.70) {
			des = ((sal*15)/100)-268.84;
			System.out.println("Seu salário possui um desconto de:R$" + des);
			
		} else if (sal<3582) {
			des = ((sal*22.5)/100)- 483.84;
			System.out.println("Seu salário possui um desconto de:R$" + des);
			
		} else {
			des = ((sal*27.5)/100)- 662.94;
			System.out.println("Seu salário possui um desconto de:R$" + des);
		}
		ler.close();
	}
}

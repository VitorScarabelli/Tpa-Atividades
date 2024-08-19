import java.util.Scanner;
public class exercicioCombustivel {
	public static void main (String args []) {
		Scanner ler = new Scanner (System.in);
	
		//variaveis
		double dp, ct, gm;
		
		//leitura de dados
		System.out.println ("Digite a distância percorrida em quilômetros.");
		dp = ler.nextDouble();
		
		System.out.println("Digite a capacidade de combustivel do veículo em litros.");
		ct = ler.nextDouble();
		
		//calculo
		gm = dp / ct;
		
		//tomada de decisão
		if (gm>=10) {
			System.out.println("O veículo é econômico.");
		}else {
			System.out.println("O veículo não é econômico.");
		}
		ler.close();
	}
}

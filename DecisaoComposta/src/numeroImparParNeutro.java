import java.util.Scanner;
public class numeroImparParNeutro {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//variaveis 
		double n;
		
		//leitura de dados
		System.out.println("Entre com o número.");
		n = ler.nextDouble();
		
		//if else
		if (n<0) {
			System.out.println("O número é negativo.");
		}else if (n==0) {
			System.out.println("O número é neutro.");
		}else {
			System.out.println("O número é positivo.");
		}
		ler.close();
	}
}

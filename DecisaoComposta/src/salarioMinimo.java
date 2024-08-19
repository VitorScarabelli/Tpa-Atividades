import java.util.Scanner;
public class salarioMinimo {
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
		
	//variaveis
	int s;
	
	//leitura de dados
	System.out.println("Entre com o valor do seu salário.");
	s = ler.nextInt();
	
	
	//salario minimo, igual ou maior.
	if (s<1302) {
		System.out.println("Seu salário está abaixo de um salário minimo.");
		}else if (s==1302) {
		System.out.println("Seu salário equivale a um salário minimo.");
		}else {
		System.out.println("Seu salário está acima de um salário minimo.");
		}
	ler.close();
	}
}

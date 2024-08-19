import java.util.Scanner;
public class fahrenheitCelcius {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//variaveis
		double f,c;
		
		//leitura de dados
		System.out.println("Entre com a temperatura em fahrenheit.");
		f = ler.nextDouble();
		
		//conversão
		c = (f-32)/1.8;
		System.out.println(c + "ºC");
		
		//if else
		if (c<=15) {
			System.out.println("Está frio");
		}else if (c<=22) {
			System.out.println("Está ameno");
		}else {
			System.out.println("Está calor.");
		}
		ler.close();
	}
}

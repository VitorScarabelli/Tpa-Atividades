import java.util.Scanner;
public class ConversorDias {
	public static void main (String args []) {
		Scanner ler = new Scanner (System.in);
		
		//Variaveis
		int dias;
		double meses, anos;
		
		System.out.println ("Conversor de dias em meses e anos.");
		
		System.out.print ("Digite a quantidade de dias");
		dias = ler.nextInt();
		
		meses = dias/30;
		anos = meses/12;
		
		System.out.println ("A quantidade de meses é:" + meses);
		System.out.print ("A quantidade de anos é igual a:" + anos);
		
		ler.close();
	}
}

import java.util.Scanner;
public class festa {
public static void main (String args []) {
	Scanner ler = new Scanner(System.in);

		//Variaveis 
		int h, f, s, d;
		double be, bo;
		
		//leitura de dados
		System.out.println("Digite a quantidade de convidados do sexo masculino");
		h = ler.nextInt();
		
		System.out.println ("Digite a quantidade de convidados do sexo feminino");
		f = ler.nextInt();
		
		
		//calculos
		s = h*15 + f*10;
		System.out.println ("A quantidade de salgados a serem encomendados é:" + s);
		
		d = h*6 + f*8;
		System.out.println ("A quantidade de doces a serem encomendados é:" + d);
	
		be = (h*600+f*500)/1000;
		System.out.println ("A quantidade de litros de bebida a serem encomendados é:" + be);
		
		
		bo = (h*100+f*100)/1000;
		System.out.println ("A quantidade de quilos de bolo a serem encomendados é:" + bo);
		
		ler.close();
	}
}
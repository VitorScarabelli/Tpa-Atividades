import java.util.Scanner;
public class notaExame {
	public static void main (String args []) {
		Scanner ler= new Scanner (System.in);
	
		//variaveis
		double n1, n2, m, mf, ne;
		
		//leitura de dados
		System.out.println("Insira a primeira nota.");
		n1 = ler.nextDouble();
		
		System.out.println("Insira a segunda nota.");
		n2 = ler.nextDouble();
		
		//calculo
		m = (n1+n2)/2;
				
		if (m<3) {
			System.out.println("Reprovado.");
		} else if (m>=3 & m <6) {
				System.out.println("Em exame.");
				System.out.println("Coloque a nota do exame.");
				ne = ler.nextDouble();
				mf = (ne+m)/2;
				
			    if (mf>=6) {
					System.out.println("Aprovado.");
			    } else {
					System.out.println ("Reprovado."); } 
		} else {
			System.out.println("Aprovado");
		}
		ler.close();
	}
}
import java.util.Scanner;

public class MediaAluno {
	public static void main (String args []) {
		Scanner ler = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
		
		System.out.println ("Quer saber a média de três notas de um aluno?");
		
		//leia (nota1)
		System.out.println("Digite a 1a nota:");
		nota1 = ler.nextDouble();
		
		//leia (nota2)
		System.out.println("Digite a 2a nota:");
		nota2 = ler.nextDouble();
		
		//leia (nota3)
				System.out.println("Digite a 3a nota:");
				nota3 = ler.nextDouble();
				
		media = (nota1 + nota2 + nota3)/3;
		
		//escreva media
		System.out.println("Sua média é:" + media);
		
		ler.close();
	}
}

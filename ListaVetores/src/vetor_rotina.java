import java.util.Scanner;
public class vetor_rotina {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		final int TAM=10;
		int a[], x, sim=0, i;
		a=new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"� valor de A: ");
			a[i]= ler.nextInt();
		}
		System.out.println("\nDigite um valor que deseja procurar em A: ");
		x=ler.nextInt();
		
		for(i=0; i<TAM; i++) {
			if(x==a[i]) {
				sim++;
			}
		}
		if(sim==1) {
			System.out.println("O valor est� armazenado em "+sim+" posi��o do vetor A");
		}else if(sim>1){
			System.out.println("O valor est� armazenado em "+sim+" posi��es do vetor A");
		}else {
			System.out.println("O valor digitado n�o foi encontrado.");
		}
		ler.close();
	}
}

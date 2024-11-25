import java.util.Scanner;
public class vetor_pares {
	public static  void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		
		final int TAM=10;
		int a[], i, j=0, posi;
		a = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.print("Digite a " + (i+1) + "º posição do vetor: ");
			a[i] = ler.nextInt();
		}
		
		System.out.print("Digite a posição que você deseja ver os pares de 0 a 9: ");
		posi=ler.nextInt();
		
		
		System.out.print("[ ");
		for(j=0; j<=a[posi]; j++) {
			if(j%2==0) {
				System.out.print(j + " ");
			}
		}
		System.out.print("]");
		
		ler.close();
	}
}

import java.util.Scanner;
public class vetor_matriz {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM=10;
		int a[], b[], i, j, soma=0;
		a = new int [TAM];
		b = new int [TAM];
		
		for(j=0; j<TAM; j++) {
			System.out.print("Digite a " + (j+1) + "� posi��o do vetor A: ");
			a[j] = ler.nextInt();
		}
		
		System.out.print("B[ ");
		for(i=0; i<TAM; i++) {
			soma=0;
			for(j=i; j<TAM; j++) {
				soma+=a[j];
			}
			b[i]=soma;
			System.out.print(b[i] + " ");
		}
		System.out.print("]");
		
		ler.close();
	}
}

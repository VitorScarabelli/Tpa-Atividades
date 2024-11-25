import java.util.Scanner;
public class vetor_tabuada {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=5;
		int a[], i, resultado, k, j=0;
		a = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.print("Digite a " + (i+1) + "º posição do vetor: ");
			a[i] = ler.nextInt();
		}
		
		
		while(j<TAM) {
			for(k=1; k<11; k++) {
				resultado=a[j]*k;
				System.out.println(a[j] + "x" + k + "=" + resultado);
			}
			System.out.println(" ");
			j++;
		} 
		ler.close();
	}
}

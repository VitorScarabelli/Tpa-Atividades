import java.util.Scanner;
public class vetor_formacao {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		final int TAM=10;
		int a[], b[], c[], i;
		a= new int [TAM];
		b= new int [TAM];
		c= new int [TAM];	

		for (i=0; i<TAM; i++) {
			System.out.print("Digite a " + (i+1) + "� posi��o do vetor A: ");
			a[i] = ler.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			System.out.print("Digite a " + (i+1) + "� posi��o do vetor B: ");
			b[i] = ler.nextInt();
		}
		 System.out.print("C=[ ");
		for(i=0; i<TAM; i++) {
			if(a[i]>b[i]) {
				c[i]=1;
			}else if(a[i]==b[i]){
				c[i]=0;
			}else {
				c[i]=-1;
			}System.out.print(c[i] + " ");
		}
		System.out.print("]");
	}
}

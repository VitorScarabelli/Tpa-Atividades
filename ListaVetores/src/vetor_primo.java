import java.util.Scanner;
public class vetor_primo {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		final int TAM=10;
		int a[], primo=0, i, j;
		a= new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"� digito de A: ");
			a[i]=ler.nextInt();
		}
		for(i=0; i<TAM; i++) {
			for(j=1; j<=a[i]; j++) {
				if(a[i]%j==0) {
					primo++;
				}
			}
			if(a[i]<=1) {
				System.out.println(a[i]+" N�o � primo. \n");
			}else if(primo==2) {
				System.out.println(a[i]+" � primo. \n");
			}else {
				System.out.println(a[i]+" N�o � primo. \n");
			}
			primo=0;
		}
		ler.close();
	}
}

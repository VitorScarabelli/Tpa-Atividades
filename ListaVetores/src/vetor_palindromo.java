import java.util.Scanner;
public class vetor_palindromo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=10;
		int a[], i;
		a= new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.print("Digite a " + (i+1) + "� posi��o do vetor: ");
			a[i] = ler.nextInt();
		}
		
		if(a[0]==a[9]) {
			if(a[1]==a[8]) {
				if(a[2]==a[7]) {
					if(a[3]==a[6]) {
						if(a[4]==a[5]) {
							System.out.println("O vetor � um pal�ndromo");
						}else {
							System.out.println("O vetor n�o � um pal�ndromo");
						}
					}
				}else {
					System.out.println("O vetor n�o � um pal�ndromo");
				}
			}else {
				System.out.println("O vetor n�o � um pal�ndromo");
			}
		}else {
			System.out.println("O vetor n�o � um pal�ndromo");
		}ler.close();
	}
}

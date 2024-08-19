import java.util.Scanner;
public class exercicio2 {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int R, N;
		//leia(N);
		System.out.println("Digite o número");
		N = ler.nextInt();
		R=N%2;
		if (R==0) {
			System.out.println("Ele é par");
		}
		else {
			System.out.println("Ele é ímpar");
		}
		ler.close();
	}
}

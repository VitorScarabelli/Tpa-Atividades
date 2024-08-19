import java.util.Scanner;
public class produtosEscola {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int codigo;
		
		System.out.println("Digite o código do produto.");
		codigo = ler.nextInt();
		
		switch (codigo) {
		case 1:
			System.out.println("Produto: Cachorro quente.");
			System.out.println("Valor: R$8,00.");
		case 2:
			System.out.println("Produto: Cheesburguer.");
			System.out.println("Valor: R$12,00.");
			break;
		case 3:
			System.out.println("Produto: X-Salada.");
			System.out.println("Valor: R$15,00.");
			break;
		case 4:
			System.out.println("Produto: Misto quente.");
			System.out.println("Valor: R$11,00.");
			break;
		case 5:
			System.out.println("Produto: Pão na chapa.");
			System.out.println("Valor: R$6,00.");
			break;
		default:
			System.out.println("Código de produto inválido.");
		}
		ler.close();
	}
}

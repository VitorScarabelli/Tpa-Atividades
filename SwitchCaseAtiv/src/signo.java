import java.util.Scanner;
public class signo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int dia, mes;
		
		System.out.println("Digite o dia do seu nascimento.");
		dia = ler.nextInt();
		
		System.out.println("Digite o mês do seu nascimento.");
		mes = ler.nextInt();
		
		switch (mes) {
		case 1:
			if (dia <= 19)
				System.out.println("Seu signo é de Capricornio.");
			else 
				System.out.println("Seu signo é de Aquário");
			break;
		case 2:
			if (dia <= 18)
				System.out.println("Seu signo é de Aquário.");
			else 
				System.out.println("Seu signo é de Peixe.");
			break;
		case 3:
			if (dia <= 20)
				System.out.println("Seu signo é de Peixe.");
			else 
				System.out.println("Seu signo é de Aries.");
			break;
		case 4:if (dia <= 19)
			System.out.println("Seu signo é de Aries.");
		else 
			System.out.println("Seu signo é de Touro.");
		break;
		case 5:if (dia <= 20)
			System.out.println("Seu signo é de Touro.");
		else 
			System.out.println("Seu signo é de Gêmeos.");
		break;
		case 6:if (dia <= 20)
			System.out.println("Seu signo é de Gêmeos.");
		else 
			System.out.println("Seu signo é de Câncer.");
		break;
		case 7:if (dia <= 22)
			System.out.println("Seu signo é de Câncer.");
		else 
			System.out.println("Seu signo é de Leão.");
		break;
		case 8:if (dia <= 22)
			System.out.println("Seu signo é de Leão.");
		else 
			System.out.println("Seu signo é de Virgem.");
		break;
		case 9:if (dia <= 22)
			System.out.println("Seu signo é de Virgem.");
		else 
			System.out.println("Seu signo é de Libra.");
		break;
		case 10:if (dia <= 22)
			System.out.println("Seu signo é de Libra.");
		else 
			System.out.println("Seu signo é de Escorpião.");
		break;
		case 11:if (dia <= 21)
			System.out.println("Seu signo é de Escorpião.");
		else 
			System.out.println("Seu signo é de Sagitário.");
		break;
		case 12:if (dia <= 21)
			System.out.println("Seu signo é de Sagitário.");
		else 
			System.out.println("Seu signo é de Capricornio.");
		break;
		default:
			System.out.println("Mês inválido.");
		}
		ler.close();
	}
}

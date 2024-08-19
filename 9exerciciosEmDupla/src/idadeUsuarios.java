import java.util.Scanner;
public class idadeUsuarios {
	public static void main (String args []) {
		Scanner ler = new Scanner (System.in);
		
		//variaveis 
		int id,idVelho,idNovo;
		String nome, nomeVelho, nomeNovo;
		
		//leitura de dados
		System.out.println ("Digite o nome do usuário.");
		nome = ler.next();
		
		System.out.println("Digite a idade do usuário.");
		id = ler.nextInt();
		
		nomeVelho = nome;
		idVelho = id;
		nomeNovo = nome;
		idNovo = id;
		
		System.out.println ("Digite o nome do usuário.");
		nome = ler.next();
		
		System.out.println("Digite a idade do usuário.");
		id = ler.nextInt();
		
		if (id>idVelho) {
			idVelho = id;
			nomeVelho = nome;
		} else if (id<=idNovo) {
		idNovo = id;
		nomeNovo = nome; 
		}
		
		System.out.println ("Digite o nome do usuário.");
		nome = ler.next();
		
		System.out.println("Digite a idade do usuário.");
		id = ler.nextInt();
		
		if (id>idVelho) {
			idVelho = id;
			nomeVelho = nome;
		} else if (id<=idNovo) {
		idNovo = id;
		nomeNovo = nome; 
		}
		
		System.out.println ("Digite o nome do usuário.");
		nome = ler.next();
		
		System.out.println("Digite a idade do usuário.");
		id = ler.nextInt();
		
		if (id>idVelho) {
			idVelho = id;
			nomeVelho = nome;
		} else if (id<=idNovo) {
		idNovo = id;
		nomeNovo = nome; 
		}
		
		System.out.println ("Digite o nome do usuário.");
		nome = ler.next();
		
		System.out.println("Digite a idade do usuário.");
		id = ler.nextInt();
		
		if (id>idVelho) {
			idVelho = id;
			nomeVelho = nome;
		} else if (id<=idNovo) {
		idNovo = id;
		nomeNovo = nome; 
		}
		
		System.out.println(nomeNovo);
		System.out.println(idNovo);
		
		System.out.println(nomeVelho);
		System.out.println(idVelho);
		
		ler.close();
	}
}

import java.util.Scanner;
public class mencoes {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos: ");
        int alunosTotais = ler.nextInt();

        int alunoAtual = 0;

        int quantidadeMb = 0;
        int quantidadeB = 0;
        int quantidadeR = 0;
        int quantidadeI = 0;

        do {
            System.out.println("Digite a nota do aluno " + (alunoAtual + 1) + " (mb, b, r, i): ");
            String nota = ler.next();

            alunoAtual += 1;

            switch (nota) {
                case "mb":
                    quantidadeMb += 1;
                    break;
                case "b":
                    quantidadeB += 1;
                    break;
                case "r":
                    quantidadeR += 1;
                    break;
                case "i":
                    quantidadeI += 1;
                    break;
                default:
                    System.out.println("Nota inválida.");
                    alunoAtual -= 1; // Não conta aluno atual se a nota for inválida
                    break;
            }
        } while (alunoAtual < alunosTotais);

        // Calculando as porcentagens
        double percentagemMb = (quantidadeMb / (double)alunosTotais) * 100;
        double percentagemB = (quantidadeB / (double)alunosTotais) * 100;
        double percentagemR = (quantidadeR / (double)alunosTotais) * 100;
        double percentagemI = (quantidadeI / (double)alunosTotais) * 100;
        
        // Exibindo as porcentagens
        System.out.println("Porcentagem das notas:");
        System.out.println("Muito Bom (mb): " + percentagemMb + "%");
        System.out.println("Bom (b): " + percentagemB + "%");
        System.out.println("Regular (r): " + percentagemR + "%");
        System.out.println("Insatisfatorio (i): " + percentagemI + "%");
        
        ler.close();
    }
}
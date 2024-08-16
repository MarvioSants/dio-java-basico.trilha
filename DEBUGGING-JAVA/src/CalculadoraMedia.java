import java.util.Scanner;

public class CalculadoraMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Bruno","Lucas","Pedro"};
        
        double media = calcularMediaDaTurma(alunos, scan);
        System.out.printf("Média da turma: %.1f", media);

    }
    public static double calcularMediaDaTurma(String[] alunnos, Scanner scanner){
        int soma = 0;
        for(String aluno : alunnos){
            System.out.printf("Nota do aluno %s: ",aluno);
            int nota = scanner.nextInt();
            soma += nota;
        }
        return (double) soma / alunnos.length;
   
    }

}
    
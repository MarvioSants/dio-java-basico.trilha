import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            int idade = 0;
            boolean idadeValida = false;
            while (!idadeValida) {
                try {
                    System.out.println("Informe sua idade: ");
                    idade = scanner.nextInt();
                    idadeValida = true;  // Se o valor for válido, saia do loop
                } catch (Exception e) {
                    System.out.println("Idade inválida, por favor, insira um número inteiro.");
                    scanner.next(); // Limpa a entrada inválida
                }
            }

            double altura = 0;
            boolean alturaValida = false;
            while (!alturaValida) {
                try {
                    System.out.println("Informe sua altura: ");

                    String alturaString = scanner.next();
                    altura = Double.parseDouble(alturaString);
                    alturaValida = true;  // Se o valor for válido, saia do loop
                } catch (NumberFormatException e) {
                    System.out.println("Altura inválida, por favor, insira um número decimal.");
                }
            }

            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + " cm");

        } finally {
            scanner.close(); // Fecha o scanner
        }
    }
}

import java.util.Locale;
import java.util.Scanner;

public class ClasseScanner {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = escanear.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = escanear.next();

        System.out.println("Digite sua altura em cm: ");
        Double altura = escanear.nextDouble();

        System.out.println("Iforme sua idade: ");
        int idade = escanear.nextInt();

        System.out.println("Olá, meu nome é "+nome +" "+ sobrenome);
        System.out.println("Tenho "+idade+ " anos de idade");
        System.out.println("E minha altura é "+altura+ " cm");
    }
}

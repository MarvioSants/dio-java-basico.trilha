import java.util.Scanner;

public class SenhaWhile {
    public static void main(String[] args) {
        Scanner senha = new Scanner(System.in);
        String senhaCorreta = "123456";
        String senhaDigitada = "";

        while (!senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Digite a senha: ");
            senhaDigitada = senha.nextLine();
            if (!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Sua senha está incorreta, por favor, inseririr senha correta.");
                
            }
                  
        }
        System.out.println("Parabéns, seu acesso foi concedido!");
        senha.close();
    }
}

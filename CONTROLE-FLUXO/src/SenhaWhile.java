import java.util.Scanner;

public class SenhaWhile {
    public static void main(String[] args) {
        Scanner senha = new Scanner(System.in);
        String senhaCorreta = "123456";
        String senhaDigitada = "";
        int tentativas = 0;
        int maxTentativas = 3;


        while (!senhaDigitada.equals(senhaCorreta)&& tentativas < maxTentativas) {
            System.out.println("Digite a senha: ");
            senhaDigitada = senha.nextLine();
            tentativas ++;

            if (!senhaDigitada.equals(senhaCorreta)&& tentativas< maxTentativas) {
                System.out.println("Sua senha está incorreta, por favor, inseririr senha correta.");     
            }
        }
        if (senhaDigitada.equals(senhaCorreta)){
        System.out.println("Parabéns, seu acesso foi concedido!");
        }else{
        System.out.println("Máximo de tentativas excedido. Acesso não permitido.");
        }
        senha.close();
    }
}

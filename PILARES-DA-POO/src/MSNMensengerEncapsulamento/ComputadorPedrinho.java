package MSNMensengerEncapsulamento;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoDeMensagemInstantanea smi = null;


        String appEscolhido = "fcb";

        if (appEscolhido.equals("msn")){
            smi = new MSNMensenger();
        }
        else if (appEscolhido.equals("fcb")) {
            smi = new Facebook();
        }
        else if (appEscolhido.equals("tlg")) {
            smi = new Telegram();
        }
        else{
            System.out.println("Aplicativo não reconhecido");
            return;
        }

        smi.enviarMensagem();
        smi.receberMensagem();
            
    }         
}

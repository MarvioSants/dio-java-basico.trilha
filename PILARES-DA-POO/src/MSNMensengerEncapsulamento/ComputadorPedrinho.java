package MSNMensengerEncapsulamento;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSNMensenger msn = new MSNMensenger();

        System.out.println("MSN MENSSENGER");
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println();


        System.out.println("FACEBOOK MENSSENGER");
        Facebook fcb = new Facebook();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        System.out.println();

        System.out.println("TELEGRAM MENSSENGER");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
      
        
    }
}

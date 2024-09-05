package MSNMensengerEncapsulamento;

public class Telegram extends ServicoDeMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        conectadoInternet();
        System.out.println("Envaiando mensagempelo TELEGRAM"); 
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagempelo TELEGRAM");
    }
    
    public void salvarHistorico(){
        
    }
}

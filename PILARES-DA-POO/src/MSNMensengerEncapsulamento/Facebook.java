package MSNMensengerEncapsulamento;

public class Facebook extends ServicoDeMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        conectadoInternet();
        System.out.println("Envaiando mensagempelo FACEBOOK");        
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagempelo FACEBOOK");
    }

    public void salvarHistorico(){
        
    }
    
}

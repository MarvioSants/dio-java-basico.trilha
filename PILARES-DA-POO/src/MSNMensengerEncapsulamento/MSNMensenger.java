package MSNMensengerEncapsulamento;

public class MSNMensenger extends ServicoDeMensagemInstantanea {
    
    @Override
    public void enviarMensagem() {
        conectadoInternet();
        System.out.println("Envaiando mensagempelo MSN");
        
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN");
        
    }

    public void salvarHistorico(){
        
    }

}
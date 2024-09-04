package MSNMensengerEncapsulamento;

public class MSNMensenger {
    public void enviarMensagem(){
        conectadoInternet();
        System.out.println("Enviando mensagem pelo msn mensenger");
        salvarHistoricoMensagem();
    }

    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo msn mensenger");
    }

    private void conectadoInternet(){
        System.out.println("Validando conexão");

    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvano hitórico de mensagem");
    }
}
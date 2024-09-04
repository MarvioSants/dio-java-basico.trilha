package MSNMensengerEncapsulamento;

public class ServicoDeMensagemInstantanea {
    public void enviarMensagem(){
        //confirma se conectado
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        //salvar histórico depois de enviar
        salvarHistorico();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }
    private void validarConectadoInternet(){
        System.out.println("Validando se conectado");
    }
    private void salvarHistorico(){
        System.out.println("Salvando hitórico da mensagem");
    }
}

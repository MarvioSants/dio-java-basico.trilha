package MSNMensengerEncapsulamento;

public abstract class ServicoDeMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    public abstract void salvarHistorico();

    //somente a classe filho conhece o método
    protected void conectadoInternet(){
        System.out.println("Validando se conectado");
    }
}

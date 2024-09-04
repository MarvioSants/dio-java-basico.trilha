public class Carro extends Veiculo {

    public  void ligar(){
        Combustivel();
        ConfereCambio();
        System.out.println("Carro ligado");
    } 

    private  void Combustivel(){
        System.out.println("Conferindo combustivel");
    }

    private  void ConfereCambio(){
        System.out.println("Conferindo cambio em P");
    }
}

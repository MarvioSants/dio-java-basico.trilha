public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();

        //jeep.ligar();
        jeep.setPlaca("234567");
        

        Moto z400 = new Moto();
        //z400.ligar();
        z400.setPlaca("1213-MAR");

        Veiculo coringa = z400;
        coringa.ligar();

    }
}

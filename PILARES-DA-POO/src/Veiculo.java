public abstract class Veiculo {
    private String Placa;
    public String getPlaca() {
        return Placa;
    }
    public void setPlaca(String placa) {
        this.Placa = placa;
    }

    public abstract void ligar();

}

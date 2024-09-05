package Interfacejava;
import Interfacejava.Copiadora;

public class EquipamentoMultiFuncional implements Copiadora, Digitalizadora, Impressora{ 
    @Override
    public void copiar(){
        System.out.println("Copiando por Multifuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando por Multifuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo por Multifuncional");
    }

}

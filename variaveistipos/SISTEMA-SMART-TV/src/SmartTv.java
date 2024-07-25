public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;

    }
    //proximo canal
    public void nextChannel(){
        canal++;
    }
    //canal anterior 
    public void previousChannel(){
        canal--;
    }


    public void turnUpTheVolume(){
        volume++;

        System.out.println("Aumentando o volume para: "+volume);
    }
    public void lowerTheVolume(){
        volume--;

        System.out.println("Diminuindo o volume para:"+volume) ;

    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

}
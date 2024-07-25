public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        //diminuir Volume
        smartTv.lowerTheVolume();
        smartTv.lowerTheVolume();
        smartTv.lowerTheVolume();

        //mudar canal para próximo e anterior

        System.out.println("Canal atual:"+ +smartTv.canal);
        smartTv.mudarCanal(10);
        
        System.out.println("Canal atual:"+smartTv.canal);



        //aumentar Volume
        smartTv.turnUpTheVolume();

        System.out.println("A tv está ligada:"+ smartTv.ligada);
        System.out.println("Canal atual:" +smartTv.canal);
        System.out.println("Qual o volume atual? : "+ smartTv.volume);

        smartTv.ligar();
        System.out.println("A tv está ligada? "+ smartTv.ligada);

        smartTv.desligar();
        System.out.println("A tv está desligada?"+ smartTv.ligada);

        //diminuir Volume
        smartTv.lowerTheVolume();
        smartTv.lowerTheVolume();
        smartTv.lowerTheVolume();

        //aumentar Volume
        smartTv.turnUpTheVolume();


        }
}

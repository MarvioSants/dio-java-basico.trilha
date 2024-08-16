public class Excecoes {
    public static void main(String[] args) {
        int [] numeros = {10,20,30,100};
        int [] peso = new int[] {2,0,4};


        try{//tentar
            //ele vai tentar execultar 

            for (int i =0; i< 4; i++){
                int resultado = numeros[i] / peso[i];
                System.out.printf("%d / %d = %d\n", numeros[i], peso[i], resultado);

            }
            System.out.println("numero: ");
            System.out.println(numeros[5]);
    

        }
        catch(Exception erro){ //capturar
            //trata os erros capturados no bloco try
            //aqui valos lidar com os problemas
            //imprimir o erro que aconteceu
            //criar arquivo de log

            System.out.println(erro.getMessage());

        }


        System.out.println("Mensagem final");
    }   
}

package edu.marcio.tipovariaveis.operadores;

public class operRelacional {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        
        boolean simNao = num1==num2;
        System.out.println("numero1 é igual a numero2?: "+ simNao);

        simNao = num1!=num2;
        System.out.println("numero1 é diferente numero2? "+simNao);

        simNao = num1>num2;
        System.out.println("numero1 é maior numero2? "+simNao);

        if (num1 < num2){
            System.out.println("Sim, numero1 é menor que numero2");

           String nomeUm = "Marcio";
           String nomeDois = "Marcio";
           
           System.out.println(nomeUm == nomeDois);


        //NOVO EXEMPLO

        String nomeOne = "Marcio";
        String nomeTwo = new String("Marcio");
        
        System.out.println(nomeOne== nomeTwo);

        //como usar para texto? usar o método "equals" ele compara conteúdos. quando usado para objetos ele é a forma mais recomendada.
        String nomeOne1 = "Marcio";
        String nomeTwo2 = new String("Marcio");
        
        System.out.println(nomeOne1.equals(nomeTwo2));



        }
    }
}

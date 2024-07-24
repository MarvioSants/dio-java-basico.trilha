package edu.marcio.tipovariaveis.operadores;

public class operLogicos {
    //. && => E
    //. || =>OU 

    public static void main(String[] args) {
        boolean condicional1 = true;
        boolean condicional2 = true;

        if(condicional1 && condicional2){
            System.out.println("as duas sao verdadeira");
    
        }
        if ( condicional1 || condicional2) {
            System.out.println("Uma delas é verdadeira");
            
        }
        System.out.println("Fim");

    }
}

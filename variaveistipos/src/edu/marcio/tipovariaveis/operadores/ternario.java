package edu.marcio.tipovariaveis.operadores;

public class ternario {
    public static void main(String[] args) {
        int a, b;
        a = 5;
        b = 7;

        String resultado = "";
        if (a==b)
            resultado = "True";
        else 
            resultado = "False";

        System.out.println(resultado);

        //vamos para o ternario correto
        int c, d;

        c = 10;
        d = 10;

        String resultadoString = a==b? "True": "False";
        System.out.println(resultadoString);

    }
}

package edu.marcio.tipovariaveis.operadores;

import java.util.Date;

public class Operadores {
    public static void main(String[] args){
        //classe Operadores.java
        String nome = "Marcio";
        int idade = 21;
        double peso = 54.5;
        char sexo = 'M';
        boolean doadorSangue = true;
        Date dataNascimento = new Date();

        //Operadores Aritiméticos

        double soma =10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 2 * 7;
        int divisao = 15/3;
        int modulo = 18 % 3;// resto da divisao
        double resultado = (10*2)+(20/4);

        //Operadore de Adição

        String nomeCompleto = "linguaguem" + "java";
        //System.out.println(nomeCompleto);


        //Operadores unários
        int num = 5;

        num = -num;
        System.out.println(num);

        num = num * -1;
        System.out.println(num);

        // incrementar

        int nume = 5;
        //x repetições
       // nume = nume +1;

       nume++;
       System.out.println(nume);



    }
    
}

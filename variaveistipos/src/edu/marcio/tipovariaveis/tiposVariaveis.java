package edu.marcio.tipovariaveis;

public class tiposVariaveis {
    public static void main(String[] args) {
        byte idade = 21;
        short ano = 2024;
        int cep = 12345678;//se começar com zero tem que mudar o tipo
        long cpf = 12345678901L;//se começar com zero talvez mude o tipo
        float PI = 3.14F;
        double salario = 1234.75;
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 =(short) numeroNormal;

        //variavel não vai perder valor.
        int numero = 10;
        numero = 12;

        System.out.println(numero);
        //deve ser escrita toda em caixa alta, e deve receber um "final" no início do seu tipo
        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);

    }
}

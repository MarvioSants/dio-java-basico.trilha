public enum EstadoBrasileiro {

    SAO_PAULO("SP", "SÃO PAULO", 11),
    RIO_JANEIRO("RJ", "RIO DE JANEIRO",12),
    PIAUI("PI", "PIAUÍ",13),
    MARANHAO("MA","MARANHÃO", 14),
    CEARA("CE", "CEARÁ",15);

    private String nome;
    private String sigla;
    private int ibge;

    private EstadoBrasileiro(String sigla, String nome, int ibge ){
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public String getSigla(){
        return sigla;
    }
    public String getNome(){
        return nome;
    }
    public int getIbge(){
        return ibge;
    }
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }

}

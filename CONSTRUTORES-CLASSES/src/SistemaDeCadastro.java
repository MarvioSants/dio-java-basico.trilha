public class SistemaDeCadastro {
    public static void main(String[] args) {
        Pessoa marciPessoa = new Pessoa("124","Marcio");

        marciPessoa.setEndereco("Rua da Aroeiras");


        System.out.println(marciPessoa.getNome()+"-"+ marciPessoa.getCpf());
    }
}

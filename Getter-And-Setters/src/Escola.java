public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();

        felipe.setNome("Felipe Anderson");
        felipe.setIdade(10);
        felipe.setSexo("Masculino");
    

        System.out.println("O aluno "+felipe.getNome()+ " tem " +felipe.getidade()+" anos de idade.");
        System.out.println("Seu sexo é "+felipe.getSexo());
    }
}

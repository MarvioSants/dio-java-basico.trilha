import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Candidatura {
    public static void main(String[] args) {
        String[] candidatos = {"Marcio","Vitoria", "Jana","Felipe","Júlia"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
       // imprimirSelecionado();  // Adicionei chamada ao método para exibir a lista de candidatos
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuaTentando = !atendeu;
            if (continuaTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso!");
            }
        } while(continuaTentando && tentativasRealizadas < 3);
        if (atendeu) {
            System.out.println("Conseguimos contato com o " + candidato + " na " + tentativasRealizadas + "ª tentativa");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + " após o número máximo de tentativas");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionado() {
        String[] candidatos = {"Marcio","Vitoria", "Jana","Felipe","Júlia"};
        System.out.println("Imprimindo a lista de candidatos informando índice do elemento:");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº " + (indice+1) + " é " + candidatos[indice]);
        }
        System.out.println("Usando o for each:");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi: " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"Marcio","Felipe","Anderson","Júlia","Romeu","Julieta","Tavila","Vitória","Luana","Jana"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if(salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contraproposta");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}

package candidaturas;
import java.security.KeyStore;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String candidatos[] = {"Renan", "Lucas", "Luciana", "Cleber", "Josivaldo"};
        for (String candidato : candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando =  !atendeu;
            if (continuarTentando){
                tentativasRealizadas++;
            } else {

                System.out.println("Contato realizado!" );
            }

        } while(continuarTentando && tentativasRealizadas < 3);

        if (atendeu){
            System.out.println("Conseguimos contato com o " + candidato + " na " +
                    "" + tentativasRealizadas + " tentativa");
        } else {
            System.out.println("Não conseguimos contato com o " + candidato + " número máximo de " +
                    "tentativas " + tentativasRealizadas);
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }


    static void imprimirCandidatos() {
    String candidatos[] = {"Renan", "Lucas", "Luciana", "Cleber", "Josivaldo"};
        System.out.println("Imprimindo mostrando o índice do candidato.");
        for (int indice = 0; indice < candidatos.length; indice ++){
            System.out.println("O candidato de nº " + (indice+1) + " é o " + candidatos[indice]);
        }

        System.out.println("Imprimindo de forma simplificada.");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi o " + candidato);
        }

    }

    static void selecaoCandidatos(){
        String candidatos[] = {"Renan", "Lucas", "Luciana", "Cleber", "Josivaldo", "Joana", "Maria", "Ana", "Rafael",
        "Lorena"};
        int candidatosSelecionados = 0;
        int contagemCandidatos = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && contagemCandidatos < candidatos.length){
            String candidato = candidatos[contagemCandidatos];
            double salarioPretendido = valorAleatorio();

            System.out.println("O candidato " + candidato + " solicitou o valor: " + salarioPretendido);
            if (salarioPretendido <= salarioBase){
                System.out.println("O candidato: " + candidato + " foi selecionado para vaga" );
                candidatosSelecionados++;
            }
            contagemCandidatos++;
        }

    }

    static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analiseCandidatos(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o Candidato oferecendo proposta!");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o Candidato oferecendo contraproposta!");
        }else {
            System.out.println("Aguardando a resposta dos demais candidatos");
        }
    }
}

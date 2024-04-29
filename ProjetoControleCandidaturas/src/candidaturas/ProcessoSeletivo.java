package candidaturas;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
    }
    static void selecaoCandidatos(){
        String candidatos[] = {"Renan", "Lucas", "Luciana", "Cleber", "Josivaldo", "Joana", "Maria", "Ana"};
        int candidatosSelecionados = 0;
        int contagemCandidatos = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5){
            String candidato = candidatos[contagemCandidatos];
            double salarioPretendido = valorAleatorio();

            System.out.println("O candidato " + candidato + " solicitou o valor: " + salarioPretendido);
            if (salarioPretendido >= salarioBase){
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

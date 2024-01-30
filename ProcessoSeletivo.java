import java.util.ArrayList;
import java.util.Random;

class ProcessoSeletivo {
    final double salarioBase = 2000.00;
    ArrayList<String> candidatosSelecionados = new ArrayList<>(5);

    void analisarCandidato(double pretensaoSalarial) {
        if (this.salarioBase > pretensaoSalarial) {
            System.out.println("Ligar para candidato");
        } else if (this.salarioBase == pretensaoSalarial) {
            System.out.println("Ligar para candidato com contraproposta");
        } else {
            System.out.println("Aguardando resultado com demais candidatos");
        }
    }

    void selecionarCandidato(String nome, double pretensaoSalarial) {
        if (this.salarioBase >= pretensaoSalarial && candidatosSelecionados.size() < 5) {
            candidatosSelecionados.add(nome);
            System.out.println("Você passou para próxima etapa");
        } else {
            System.out.println("Infelizmente você não passou para próxima etapa");
        }
    }

    ArrayList<String> getCandidatosSelecionados() {
        return this.candidatosSelecionados;
    }

    void ligar(String candidato) {
        int tentativas = 1;
        boolean atendeu = new Random().nextInt(2) == 1;

        while(tentativas <= 3) {
            if(atendeu) {
                System.out.println("Conseguimos contato com " + candidato + " em " + tentativas + " tentativa(s)");
                break;
            } else {
                tentativas++;
            }
        }

        if(tentativas > 3) {
            System.out.println("Não conseguimos entrar em contato com " + candidato);
        }
    }
}
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Candidato c1 = new Candidato("Aline",1500.00);
        Candidato c2 = new Candidato("Luan",2500.00);
        Candidato c3 = new Candidato("Igor",2000.00);
        Candidato c4 = new Candidato("Melissa",2500.00);
        Candidato c5 = new Candidato("Carol",1500.00);
        Candidato c6 = new Candidato("Gustavo",1500.00);
        Candidato c7 = new Candidato("Julia",2000.00);
        Candidato c8 = new Candidato("Leticia",2500.00);
        Candidato c9 = new Candidato("Jessica",1500.00);

        ArrayList<Candidato> candidatos = new ArrayList<>();
        candidatos.add(c1);
        candidatos.add(c2);
        candidatos.add(c3);
        candidatos.add(c4);
        candidatos.add(c5);
        candidatos.add(c6);
        candidatos.add(c7);
        candidatos.add(c8);
        candidatos.add(c9);

        ProcessoSeletivo ps = new ProcessoSeletivo();
        
		// ps.selecionarCandidato(c1.getNome(),c1.getPretensaoSalarial());
		// ps.selecionarCandidato(c2.getNome(),c2.getPretensaoSalarial());
		// ps.selecionarCandidato(c3.getNome(),c3.getPretensaoSalarial());
		// ps.selecionarCandidato(c4.getNome(),c4.getPretensaoSalarial());
		// ps.selecionarCandidato(c5.getNome(),c5.getPretensaoSalarial());
		// ps.selecionarCandidato(c6.getNome(),c6.getPretensaoSalarial());
		// ps.selecionarCandidato(c7.getNome(),c7.getPretensaoSalarial());
		// ps.selecionarCandidato(c8.getNome(),c8.getPretensaoSalarial());
		// ps.selecionarCandidato(c9.getNome(),c9.getPretensaoSalarial());

        candidatos.forEach((Candidato c) -> ps.selecionarCandidato(c.getNome(),c.getPretensaoSalarial()));

        System.out.println(ps.getCandidatosSelecionados());
	}
}
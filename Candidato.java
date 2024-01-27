class Candidato {
    double pretensaoSalarial;
    String nome;
    Candidato(String nome, double pretensaoSalarial) {
        this.pretensaoSalarial = pretensaoSalarial;
        this.nome = nome;
    }

    double getPretensaoSalarial() {
        return this.pretensaoSalarial;
    }
    
    String getNome() {
        return this.nome;
    }
}